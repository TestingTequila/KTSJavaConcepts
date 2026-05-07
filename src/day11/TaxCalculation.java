package day11;

public class TaxCalculation
{
    public void taxCalculation(int empSalary)
    {
        double taxRate=0.3;
        double taxableSalary =empSalary*taxRate;
        System.out.println("Tax Deducted from employee is : " + taxableSalary);
    }
}
