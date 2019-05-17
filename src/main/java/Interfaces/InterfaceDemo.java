package Interfaces;

public class InterfaceDemo
{

    public static void main(String[] args)
    {
        final Switchable computer = new Computer();
        final Switchable tv = new TV();

        computer.switchOn();
        tv.switchOn();

        computer.switchOff();
        tv.switchOff();

    }
}
