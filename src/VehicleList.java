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
            System.out.println("Vehicle object is invalid!");
            return false;
        }
        else
        {
            for(Vehicle v : vehicleList)
            {
                if(v.getPlateID().equalsIgnoreCase(vehicle.getPlateID()))
                {
                    System.out.println("The provided platenumber is already registered in the list ");
                    return false;
                }
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
            System.out.println("Vehicle has been removed");
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
}
