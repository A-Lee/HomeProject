package Shoot;

/**
 * Created by Ali on 05.06.2017.
 */
public class Monitor
{
    private int width, height;
    private GPU gpu;

    public Monitor(int width, int height, GPU gpu)
    {
        this.width = width;
        this.height = height;
        this.gpu = gpu;
    }
    public void drawPizelAt(int x, int y, String color)
    {
       gpu.drawPizelAt(x,y,color);
    }
}
