package day27;

public class StackMemory
{
    public  void m1()
    {
        System.out.println("m1 method...");
        m2();
    }

    public  void m2()
    {
        m3();
        System.out.println("m2 method...");

    }

    public  void m3()
    {
        m1();
        System.out.println("m1 method...");


    }

}
