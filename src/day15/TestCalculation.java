package day15;

public class TestCalculation
{


    public static void main(String[] args, int a) {
        System.out.println("A");
    }

    public static void main(int a, String[] args) {
        System.out.println("B");
    }


    public static void main(String[] args, int a, String c) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Calculations calc= new Calculations();
        calc.addition(12,34, 6);
        calc.addition(12,67);
    }


}
