package day15;

public class Calculations
{
    public  void addition(int a, int b)
    {
        int sum = a+b;
        System.out.println("Addition: " +sum);
    }

    //1. By increasing the count of parameters

    public  void addition(int a, int b, int c)
    {
        int sum = a+b+c;
        System.out.println("Addition: " +sum);
    }

    //2. By changing the data type of parameters
    public  void addition(int a, byte b)
    {
        int sum = a+b;
        System.out.println("Addition: " +sum);
    }

    //3. By changing the order of parameters
    public  void addition(byte a, int b)
    {
        int sum = a+b;
        System.out.println("Addition: " +sum);
    }





}
