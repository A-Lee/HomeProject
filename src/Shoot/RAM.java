package Shoot;

/**
 * Created by Ali on 05.06.2017.
 */
public class RAM
{
    private int mhz;
    private double volt;
    private String type;

    public RAM(int mhz, double volt,String type)
    {
        this.mhz = mhz;
        this.volt = volt ;
        this.type = type;
    }

    public int getMhz() {
        return mhz;
    }

    public String getType() {
        return type;
    }
}
