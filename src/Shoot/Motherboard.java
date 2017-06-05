package Shoot;

/**
 * Created by Ali on 05.06.2017.
 */
public class Motherboard
{
    private final int PSULIMIT = 300;
    private final String RAMPWR = "DDR3";
    private final String GPUPWR = "DDR3";

    private RAM[] ramSlots;
    private GPU[] gpuSlots;
    private HDD[] hddslots;
    private Monitor monitor;
    private PSU powersupply;

    public Motherboard(String monitorType, int monitorWidth, int monitorHeight, PSU psu, GPU[] gpus, HDD[] hdds, RAM... rams)
    {
        if(psu.getVolt() > PSULIMIT)
        {
            throw new IllegalArgumentException("PSU volt is over the psu limit for this motherboard!");
        }
        else
        {
            this.powersupply = psu;
        }
        for(int i = 0; i < gpus.length; i++)
        {
            if(!gpus[i].getType().equalsIgnoreCase(GPUPWR))
            {
                throw new IllegalArgumentException("GPU type is not for this motherboard!");
            }
        }
        for(int i = 0; i < rams.length; i++)
        {
            if(!rams[i].getType().equalsIgnoreCase(RAMPWR))
            {
                throw new IllegalArgumentException("RAM type is not for this motherboard!");
            }
        }
        this.ramSlots = rams;
        this.gpuSlots = gpus;
        this.hddslots = hdds;
        this.monitor = new Monitor(monitorWidth,monitorHeight, gpus[0]);
    }

}
