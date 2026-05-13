package day12;

public class Calculations
{
    public void addition1(int a, int b)
    {
        int sum =a+b;
        System.out.println("ADDITION1: The sum of " + a+ " and " + b + " is: " + sum);
    }

    public int addition2(int a, int b)
    {
        int sum =a+b;
        System.out.println("ADDITION2: The sum of " + a+ " and " + b + " is: " + sum);
        return sum;
    }

    public void fullName1(String fName, String lName)
    {
        String completeName =fName + lName;
        System.out.println("Complete Name is : " + completeName);
    }

    public String fullName2(String fName, String lName)
    {
        String completeName =fName + lName;
        System.out.println("Complete Name is : " + completeName);
        return completeName;
    }
}
