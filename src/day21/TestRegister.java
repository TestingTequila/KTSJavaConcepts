package day21;

public class TestRegister {
    public static void main(String[] args) {
        Registration register = new Registration("Ashish", "test@1234", 8860418);
        System.out.println(register.getUserName());
        System.out.println(register.getPw());
        System.out.println(register.getMobileNumber());
        System.out.println(register.getAge());//19
        System.out.println(register.getCity());//New York


        Registration register1 = new Registration("Kerrie", "test@1265", 567567);
        System.out.println(register1.getUserName());
        System.out.println(register1.getPw());
        System.out.println(register1.getMobileNumber());
        System.out.println(register1.getAge());//19
        System.out.println(register1.getCity());//New York

    }
}
