package Shoot;

/**
 * Created by Ali on 05.06.2017.
 */
public class HDD
{
    private int capacity;
    private int maxCapacity;
    private int rpm;
    private String brand;

    public HDD(int capacity, int rpm, String brand)
    {
        this.capacity = capacity;
        this.maxCapacity = capacity;
        this.rpm = rpm;
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRpm() {
        return rpm;
    }

    public String getBrand() {
        return brand;
    }
    public void deleteFile(int size)
    {
        if((capacity + size) > maxCapacity)
        {
            System.out.println("Something weird going on with the filesystem. Error");
        }
        else
        {
            capacity += size;
        }
    }
    public void writeFile(int size)
    {
        if((capacity - size) < 0)
        {
            System.out.println("Something weird going on with the filesystem. Error");
        }
        else
        {
            capacity -= size;
        }
    }
}
