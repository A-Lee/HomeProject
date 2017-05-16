/**
 * Created by Ali on 10.05.2017.
 */
public class Vehicle
{
    private String type,direction;
    private double weight,enginepwr;
    private int seat;
    private boolean on;

    public Vehicle(String type, double weight, double enginepwr, int seat)
    {
        this.type = type;
        this.weight = weight;
        this.enginepwr = enginepwr;
        this.seat = seat;
        on = false;
        direction = "Straight";
    }

    public void turnOn()
    {
        if(!isOn())
        {
            on = true;
        }
        else
        {
            System.out.println("Vehicle is already on");
        }
    }
    public void turnOff()
    {
        if(isOn())
        {
            on = false;
        }
        else
        {
            System.out.println("Vehicle is already off");
        }
    }
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getEnginepwr() {
        return enginepwr;
    }

    public int getSeat() {
        return seat;
    }

    public boolean isOn()
    {
        return on;
    }
    public boolean getOn()
    {
        return on;
    }
    public void goLeft()
    {
        if(direction.equalsIgnoreCase("West"))
        {
            System.out.println("Already facing left");
        }
        else
        {
            direction = "left";
        }
    }
    public void goStraight()
    {
        if(direction.equalsIgnoreCase("North"))
        {
            System.out.println("Already facing straight");
        }
        else
        {
            direction = "straight";
        }
    }
    public void goRight()
    {
        if(direction.equalsIgnoreCase("East"))
        {
            System.out.println("Already facing right");
        }
        else
        {
            direction = "right";
        }
    }
}
