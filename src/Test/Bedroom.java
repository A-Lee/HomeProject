package Test;

/**
 * Created by Ali on 28.05.2017.
 */
public class Bedroom
{
    private Lamp lamp;
    private Bed bed;
    private Desk desk;
    private Wall north,south,west,east;

    public Bedroom(Lamp lamp, Bed bed, Desk desk, Wall north, Wall west, Wall south, Wall east)
    {
        this.lamp = lamp;
        this.bed = bed;
        this.desk = desk;
        this.north = north;
        this.east = east;
        this.west = west;
        this.south = south;
    }

    public void turnOnLamp()
    {
        lamp.turnOn();
    }
    public void turnOffLamp()
    {
        lamp.turnOff();
    }
    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public Wall getNorth() {
        return north;
    }

    public Wall getSouth() {
        return south;
    }

    public Wall getWest() {
        return west;
    }

    public Wall getEast() {
        return east;
    }
    public void makeBed()
    {
        System.out.println("Bedroom -> Making bed");
        bed.makeBed();
    }
}
