package Shoot;

/**
 * Created by Ali on 05.06.2017.
 */
public class PSU
{
    private double volt;
    private String brand;

    public PSU(double volt, String brand)
    {
        this.volt = volt;
        this.brand = brand;
    }

    public double getVolt() {
        return volt;
    }

    public String getBrand() {
        return brand;
    }
}
