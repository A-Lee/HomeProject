/**
 * Created by Ali on 11.05.2017.
 */
public class Car extends Vehicle
{
    private static final String TYPE = "Car";

    private String model, submodel,gear;
    private int year;
    private boolean on;
    public Car(String model, String submodel, int year, double weight, double enginepwr, int seat, String plateID)
    {
        super(TYPE, weight, weight, seat, plateID);
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

    public String getPlateID()
    {
        return super.getPlateID();
    }

    public void changeGear(int choise)
    {
        if(!isOn())
        {
            System.out.println("The vehicle is not on!");
        }
        else if(choise == 2)
        {
            if(gear.equalsIgnoreCase("R"))
            {
                System.out.println("Car already in reverse");
            }
            else
            {
                gear = "R";
            }
        }
        else if(choise == 1)
        {
            if(!isNumber(getGear()))
            {
                gear = "1";
            }
            else if(Integer.parseInt(getGear()) >= 1 && Integer.parseInt(getGear()) <= 5)
            {
                int number = Integer.parseInt(getGear());
                setGear("" + ++number);
            }
            else if(Integer.parseInt(getGear()) > 5)
            {
                System.out.println("You are on the highest gear '6'");
            }
        }
        else if(choise == 0)
        {
            if(!isNumber(getGear()))
            {
                if(gear.equalsIgnoreCase("R"))
                {
                    System.out.println("The car is in reverse. Cant gear down");
                }
                else
                {
                    System.out.println("The car is in neutral. Cant gear down");
                }
            }
            else if(Integer.parseInt(getGear()) > 1 && Integer.parseInt(getGear()) <= 5)
            {
                int number = Integer.parseInt(getGear());
                setGear("" + --number);
            }
            else if(Integer.parseInt(getGear()) == 1)
            {
                setGear("N");
            }
        }
    }
    public static String getTYPE()
    {
        return TYPE;
    }

    public String getModel()
    {
        return model;
    }

    public String getSubmodel()
    {
        return submodel;
    }

    public int getYear()
    {
        return year;
    }
    public void setGear(String gear)
    {
        this.gear = gear;
    }
    public double getEnginepwr()
    {
        return super.getEnginepwr();
    }
    public int getSeat()
    {
        return super.getSeat();
    }
    public String getGear()
    {
        return  gear;
    }
    public boolean isNumber(String gear)
    {
        if(Character.isDigit(gear.toCharArray()[0]))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isOn()
    {
        return on;
    }
    public double getWeight()
    {
        return super.getWeight();
    }
}