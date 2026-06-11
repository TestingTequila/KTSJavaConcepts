package day19;

public class Employee2
{
    private String fName;
    private String lName;
    private int age;
    private int salary;


    public Employee2(String fName, String lName, int age, int salary)
    {
        this.fName = fName;
        this.lName= lName;
        this.age=age;
        this.salary=salary;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {

        int empSalary= 0;

        if (salary > 1000 & salary <= 10000)
        {
            empSalary= this.salary;
        }
        return empSalary;
    }
}
