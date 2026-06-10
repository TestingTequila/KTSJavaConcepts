package day18;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee emp1= new Employee("Ashish", 32, 'M');
        System.out.println(emp1.age);
        System.out.println(emp1.gender);
        System.out.println(emp1.trainersName);

        System.out.println("====================================");

        Employee emp2=new Employee("Kerrrie", 32, 'F');

        System.out.println(emp2.trainersName);//
        System.out.println(emp2.age);//
        System.out.println(emp2.gender);//

    }
}
