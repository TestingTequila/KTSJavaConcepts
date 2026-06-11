package day19;

public class TestEmployee2
{
    public static void main(String[] args) {
        Employee2 emp2= new Employee2("Ben", "Fletcher", 32, 10000);

        System.out.println(emp2.getfName());
        System.out.println(emp2.getlName());
        System.out.println(emp2.getAge());
        System.out.println(emp2.getSalary());
    }
}
