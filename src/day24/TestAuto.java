package day24;

public class TestAuto {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.refuel();
        car.stop();
        car.brandLogo();
        Car.billing();
        System.out.println(car.name); //Bharati

        System.out.println("=======================BMW object==================");
        BMW bmw = new BMW();
        bmw.autoParking(); //BMW auto-parking
        bmw.start();       // BMW start
        bmw.refuel();      // car refuel
        bmw.stop();        // car stop
        bmw.brandLogo();
        BMW.billing();
        System.out.println(bmw.name); //Ashish

        System.out.println("================Top Casting Concept====================");

        Car car1 = new BMW(); //Top Casting
        car1.start(); // BMW start
        car1.refuel();// Car refuel
        car1.stop();// Car stop
        car1.brandLogo();//car brand logo
        Car.billing();
        System.out.println(car1.name); //Bharati

        //System.out.println("================Down Casting Concept====================");

        //BMW bmw1 = (BMW)new Car();




    }
}
