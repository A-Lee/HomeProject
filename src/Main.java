/**
 * Created by Ali on 17.05.2017.
 */
public class Main
{
    static VehicleList vehicleList;

    public static void main(String[] args)
    {
         vehicleList = new VehicleList();
         Car car1 = new Car("Audi", "A6",2004,2700,170,5,"AR91346");
         Car car2 = new Car("Nissan", "X-Trail",2004,3000,140,5,"CF16311");
         Motorcycle moped = new Motorcycle("NoIdea","never_used_one",2013,900,85,"CFF331");
        vehicleList.addAll(car1,car2,moped);
        Car car3 = new Car("Porche", "911",2010,1900,170,2,"RF37731");
        vehicleList.addAll(car1,car2,car3);
        System.out.println(vehicleList.getVehicle(1).getEnginepwr());
    }
}
