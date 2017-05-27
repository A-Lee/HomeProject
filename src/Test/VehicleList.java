package Test;

import java.util.ArrayList;

/**
 * Created by Ali on 17.05.2017.
 */
public class VehicleList
{
    private ArrayList<Vehicle> vehicleList;

    public VehicleList()
    {
        vehicleList = new ArrayList<>();
    }
    public boolean addVehicle(Vehicle vehicle)
    {
        if(vehicle.equals(null))
        {
            System.out.println("Test.Vehicle object is invalid!");
            return false;
        }
        else
        {
            if(exists(vehicle))
            {
                System.out.println("The provided platenumber is already registered in the list ");
                return false;
            }
            vehicleList.add(vehicle);
            return  true;
        }
    }
    public void removeVehicle(int index)
    {
        if(!indexCheck(index))
        {
            System.out.println("Invalid index provided!");
        }
        else
        {
            vehicleList.remove(index);
            System.out.println("Test.Vehicle has been removed");
        }
    }
    public Vehicle getVehicle(int index)
    {
        if(!indexCheck(index))
        {
            System.out.println("Invalid index provided!");
            return null;
        }
        else
        {
            return vehicleList.get(index);
        }
    }
    public boolean indexCheck(int index)
    {
        if((index > vehicleList.size() -1) && index < 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void addAll(Vehicle... vehicles)
    {
        int fails = 0;
        for(int i = 0; i < vehicles.length; i++)
        {
            if(exists(vehicles[i]))
            {
                fails++;
            }
            else
            {
                addVehicle(vehicles[i]);
            }
        }
        if(fails > 0)
        {
            System.out.println("Ammount of existing vehicles in list: " + fails);
        }
    }
    public boolean exists(Vehicle vehicle)
    {
        for(Vehicle v : vehicleList)
        {
            if(v.getPlateID().equalsIgnoreCase(vehicle.getPlateID()))
            {
                return true;
            }
        }
        return  false;
    }
}
