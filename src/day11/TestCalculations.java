package day11;

public class TestCalculations {
    public static void main(String[] args) {

        Calculations calc = new Calculations();
        calc.a = 30;
        calc.b = 27;
        calc.addition(); //30+27
        calc.subtraction();//30-27
        calc.multiplication();//30*27

        System.out.println("==================CALCULATIONS2=======================");

        Calculations2 calc2= new Calculations2();
        calc2.addition(12,4);// 12+4
        calc2.subtraction(30,5);//30-5
        calc2.multiplication(5, 4);//5*4
    }
}
