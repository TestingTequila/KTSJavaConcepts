package day12;

public class EmployeeSalary
{
    //Whatever is the salary of every employee, we will pay $1000 as bonus to all employees
    // Calculate Salary of employees - basicSalary, traveLAllowance
    // Add bonus to that salary

    public  double calculateEmpSalary(double basicSalary, double travelAllowance)
    {
        double empSalary =basicSalary+travelAllowance;
        System.out.println("Salary Without Bonus is : $" + empSalary);
        return empSalary;
    }
}
