package day10;

public class Payment
{
    //WAP to calculate the salary of an employee [Basic salary + Travel Allowance]
    double basicSalary;
    double travelAllowance;

    public void calculateSalary()
    {
        double totalSalary =basicSalary+travelAllowance;
        System.out.println("The salary of the employee is : $" + totalSalary);
    }
}



