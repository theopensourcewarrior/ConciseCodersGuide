package Inheritance;

public class InheritanceDemo
{

    public static void main(String[] args)
    {
        final Dog dog = new Dog();
        final Cat cat = new Cat();

        cat.drink();
        cat.sleep();
        cat.eat();
        cat.meow();

        dog.drink();
        dog.sleep();
        dog.eat();
        dog.bark();
    }
}
