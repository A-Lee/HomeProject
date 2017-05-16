/**
 * Created by Ali on 16.05.2017.
 */
public class Test
{
    private String name;
    public Test()
    {
        name = "Testing";
    }
    public void sayHello()
    {
        System.out.println("Hello " + name);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
