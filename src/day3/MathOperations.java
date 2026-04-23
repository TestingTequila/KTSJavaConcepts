package day3;

public class MathOperations {
    public static void main(String[] args) {

        //1. I/I = I part
        System.out.println(10 / 2);//5
        System.out.println(9 / 2); //4

        //2. I/D or D/I or D/D = I+D both part

        System.out.println(9.0 / 2);//4.5
        System.out.println(9 / 2.0); //4.5
        System.out.println(9.0 / 2.0);//4.5

        //Misc
        int a = 10;
        int b = 2;
        int c = 3;
        double d = a / c;//3
        System.out.println(d); //3.0

        //Modulo Operator

        System.out.println(10 % 2); //0
        System.out.println(9 % 2); //1
        System.out.println(9.0 % 2); //1.0

    }
}
