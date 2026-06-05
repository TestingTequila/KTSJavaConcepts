package day17;

public class TestCar {
    public static void main(String[] args) {

        System.out.println("======Car C1=============");
        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 9000;
        c1.color = "Red";
        c1.start(); //non-static method
        Car.stop(); //static method
        // Car.wheels =5; this cannot be overridden as this is final


        System.out.println("Car name: "+c1.name);
        System.out.println("Car Price: " + c1.price);
        System.out.println("Car Color: " + c1.color);
        System.out.println("Car Wheels: " + Car.wheels);


        System.out.println("======Car C2=============");

        Car c2 = new Car();
        c2.name = "Audi";
        c2.price = 8000;
        c2.color = "White";


        System.out.println("Car name: "+c2.name);
        System.out.println("Car Price: " + c2.price);
        System.out.println("Car Color: " + c2.color);
        System.out.println("Car Wheels: " + Car.wheels);

        System.out.println("======Car C3=============");

        Car c3 = new Car();
        c3.name = "Tesla";
        c3.price = 10000;
        c3.color = "Blue";

        System.out.println("Car name: "+c3.name);
        System.out.println("Car Price: " + c3.price);
        System.out.println("Car Color: " + c3.color);
        System.out.println("Car Wheels: " + Car.wheels);
    }
}
