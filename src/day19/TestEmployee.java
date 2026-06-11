package day19;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setfName("Bharati");
        emp1.setlName("Mishra");
        emp1.setAge(21);
        emp1.setSalary(10000);

        System.out.println(emp1.getfName());
        System.out.println(emp1.getlName());
        System.out.println(emp1.getAge()); //21
        System.out.println(emp1.getSalary());

        System.out.println("*************************************");
        emp1.setAge(44);

        System.out.println(emp1.getfName());
        System.out.println(emp1.getlName());
        System.out.println(emp1.getAge());//44
        System.out.println(emp1.getSalary());

    }
}
