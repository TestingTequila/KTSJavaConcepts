package day17.day17a;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee emp1= new Employee(); // constructor is called automatically the moment we create object
        emp1.fName = "Bharati";
        emp1.lName = "Mishra";
        emp1.age =39;
        emp1.gender = 'f';


        System.out.println(emp1.fName);
        System.out.println(emp1.lName);
        System.out.println(emp1.age);
        System.out.println(emp1.gender);

        emp1.m1(); //have to call explicitly
    }
}
