package Test;

/**
 * Created by Ali on 28.05.2017.
 */
public class Bed
{
    private int sheets, pillows;

    public Bed(int sheets, int pillows)
    {
        this.sheets = sheets;
        this.pillows = pillows;
    }
    public void makeBed()
    {
        System.out.println("Bed -> Bed is made");
    }

    public int getSheets() {
        return sheets;
    }

    public int getPillows() {
        return pillows;
    }
}
