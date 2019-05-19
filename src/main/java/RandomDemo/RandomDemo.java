package RandomDemo;

import java.util.Random;

public class RandomDemo
{

    public static void main(String[] args)
    {
        final Random random = new Random();

        System.out.println("Random Boolean: " + random.nextBoolean());

        System.out.println("Random Int [0-9]: " + random.nextInt(10));

        System.out.println("Random Double [0.0, 1.0): " + random.nextDouble());

    }
}
