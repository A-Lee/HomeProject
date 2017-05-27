package Test;

/**
 * Created by Ali on 28.05.2017.
 */
public class Lamp
{
    private boolean isOn;
    private String style;

    public Lamp(boolean isOn, String style)
    {
        this.isOn = isOn;
        this.style = style;
    }
    public void turnOn()
    {
        if(isOn)
        {
            System.out.println("Lamp is already turned on");
        }
        else
        {
            isOn = true;
        }
    }
    public void turnOff()
    {
        if(!isOn)
        {
            System.out.println("Lamp is already turned off");
        }
        else
        {
            isOn = false;
        }
    }

    public String getStyle() {
        return style;
    }
}
