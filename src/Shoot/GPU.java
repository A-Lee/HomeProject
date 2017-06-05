package Shoot;

/**
 * Created by Ali on 05.06.2017.
 */
public class GPU
{
    private int mhz;
    private double volt;
    private String brand, type;

    public GPU(int mhz, double volt, String brand, String type)
    {
        this.mhz = mhz;
        this.volt = volt;
        this.brand = brand;
        this.type = type;
    }

    public int getMhz() {
        return mhz;
    }

    public double getVolt() {
        return volt;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
    public void drawPizelAt(int x, int y, String color)
    {
        System.out.println("Drawing " + color + " color at position x:" + x + " y:" + y);
    }
}
