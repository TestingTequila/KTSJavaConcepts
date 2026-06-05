package day17;

public class Admin {
    public void m1() {
        Admin.m4();
        System.out.println("non-static m1 method");
    }

    public void m2() {
        Admin admin1= new Admin();
        admin1.m1();
        System.out.println("non-static m2 method");
    }

    public static void m3() {
        Admin admin2= new Admin();
        System.out.println("static m3 method");
        admin2.m1();
    }

    public static void m4() {
        Admin.m3();
        System.out.println("static m4 method");
    }
}


//1. If I want to call non-static method inside other non-static method : through object reference variable
//2. If I want to call non-static method inside static method: through object reference variable
//3. If I want to call static method within other static method: Through class name
//4. If I want to call static method within non-static method: Through class name