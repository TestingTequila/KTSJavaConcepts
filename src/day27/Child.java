package day27;

public class Child extends Parent
{
    public Child()
    {
        //super(21);
        System.out.println("This is Child Constructor...");

    }

    public Child(int age)
    {
        super(21);
        System.out.println("This is Child class parametrized Constructor..." + age);
    }
}
