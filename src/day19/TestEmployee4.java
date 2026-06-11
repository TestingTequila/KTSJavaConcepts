package day19;

public class TestEmployee4
{
    public static void main(String[] args) {
       Employee4 emp4 = new Employee4("Haryana", "Gurgaon", 5546);
        System.out.println(emp4.getState());
        System.out.println(emp4.getCity());
        System.out.println(emp4.getAtmPin());

        System.out.println("*********************************");
        emp4.setState("Maharashtra");
        emp4.setCity("Borivali");
        emp4.setAtmPin(9876);

        System.out.println(emp4.getState());
        System.out.println(emp4.getCity());
        System.out.println(emp4.getAtmPin());

    }
}
