package day21;

public class Automobile
{

    private String name;
    private int age;

    public Automobile(String name, int age) {
        this.name = name;
        this.age = age;
        this.m1(); // We can call method/s within a constructor
    }

    public void m1()
    {
        //this("AShish", 32); cannot call a constructor within a method for obvious reasons
        System.out.println("m1 method");
        this.m2();
    }
    public void m2()
    {
        System.out.println("m2 method");
    }
    public void m3()
    {
        System.out.println("m3 method");
    }

    public static void m4()
    {
        System.out.println("m4 static method");
    }

    public static void m5()
    {
        System.out.println("m5 static method");
    }
}
