package day11;

public class Calculations
{
    //WAP to perform addition, subtraction, multiplication and division of two integer numbers

    // Class level Variable or Instance Variables or Global Variable
    int a;//30
    int b;//27

    public void addition()
    {
        int sum =a+b;
        System.out.println("Addition of " + a+ " and " + b + " is: " + sum);
    }

    public  void subtraction()
    {
        int difference =a-b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + difference);
    }

    public  void multiplication()
    {
        int product =a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + product);
    }
}
