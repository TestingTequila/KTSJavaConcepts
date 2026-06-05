package day17;

public class TestUsers
{
    public static void main(String[] args) {

        Users.s1();
        Users.s2();

        Car.stop();

        Car car1= new Car();
        car1.start();

        Users u1= new Users();
        u1.ns1();
        u1.ns2();
        u1.name = "Justin";
    }
}
