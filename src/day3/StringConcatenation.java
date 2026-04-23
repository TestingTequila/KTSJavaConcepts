package day3;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "world";

        int a = 100;
        int b = 200;

        System.out.println(x); //Hello
        System.out.println(y); //world

        System.out.println(a); //100
        System.out.println(b); //200

        System.out.println(x + y); //Helloworld
        System.out.println(a + b); //300

        System.out.println(x + a);//Hello100
        System.out.println(a + b + x);//300Hello
        System.out.println(a + b + x + y);//300Helloworld
        System.out.println(x + y + a + b);//Helloworld100200
        System.out.println(x + y + a + b + x + y);//Helloworld100200Helloworld
        System.out.println(a + b + x + y + a + b);//300Helloworld100200
        System.out.println(x+y+(a+b));//Helloworld300

        double d1 = 12.33;
        double d2 = 23.44;
        System.out.println(x+y+d1+d2); //Helloworld12.3323.44
        System.out.println(x+y+(d1+d2)); //Helloworld35.77

        int z = 300;
        System.out.println("The value of z is: " + z);
        System.out.println("The sum of a and b is: " + a+b);//The sum of a and b is: 100200
        System.out.println("The sum of a and b is: " + (a+b));//The sum of a and b is: 300

    }
}
