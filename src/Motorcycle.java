/**
 * Created by Ali on 11.05.2017.
 */
public class Motorcycle extends Vehicle
{
    private static final String TYPE = "Motorcycle";

    private String model, submodel,gear;
    private int year;
    private boolean on;
    public Motorcycle(String model, String submodel, int year, double weight, double enginepwr, String plateID)
    {
        super(TYPE, weight, weight, 1, plateID);
        this.model = model;
        this.submodel = submodel;
        this.year = year;
        on = super.getOn();
    }
    public void turnOn()
    {
        super.turnOn();
    }
    public void turnOff()
    {
        super.turnOff();
    }

    public static String getTYPE() {
        return TYPE;
    }

    public String getModel() {
        return model;
    }

    public String getSubmodel() {
        return submodel;
    }

    public String getGear() {
        return gear;
    }

    public int getYear() {
        return year;
    }
    public String getPlateID()
    {
        return super.getPlateID();
    }

    public boolean isOn() {
        return on;
    }
}
