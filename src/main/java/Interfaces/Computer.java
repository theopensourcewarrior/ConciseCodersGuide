package Interfaces;

public class Computer implements Switchable
{

    @Override
    public void switchOn()
    {
        System.out.println("Computer On");
    }

    @Override
    public void switchOff()
    {
        System.out.println("Computer Off");
    }

}
