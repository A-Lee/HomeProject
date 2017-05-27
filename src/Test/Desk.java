package Test;

/**
 * Created by Ali on 28.05.2017.
 */
public class Desk
{
    private String size;
    private int legs;

    public Desk(String size, int legs) {
        this.size = size;
        this.legs = legs;
    }

    public String getSize() {
        return size;
    }

    public int getLegs() {
        return legs;
    }
}
