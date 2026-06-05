package day17;

public class Users {

    String name;

    public void ns1() {
        Users.s2();
        System.out.println("ns1 method");
    }

    public void ns2() {
        Users u1= new Users();
        u1.ns1();
        u1.name = "Harshita";
        System.out.println("ns2 method");
    }

    public static void s1() {
        Users u2= new Users();
        u2.ns1();
        u2.name = "Rajesh";
        System.out.println("s1 method");

    }

    public static void s2() {
        Users.s1();
        System.out.println("s2 method");
    }
}
