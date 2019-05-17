package Interfaces;

public class TV implements Switchable
{

    @Override
    public void switchOn()
    {
        System.out.println("TV On");
    }

    @Override
    public void switchOff()
    {
        System.out.println("TV Off");
    }

}
