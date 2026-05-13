package day12;

public class TestEmployeeSalary {
    public static void main(String[] args) {

        EmployeeSalary empSal = new EmployeeSalary();
        double salary = empSal.calculateEmpSalary(8000, 4000);
        double salaryWithBonus = salary + 1000;
        System.out.println("Salary dispersed with bonus is: $" + salaryWithBonus);
    }
}
