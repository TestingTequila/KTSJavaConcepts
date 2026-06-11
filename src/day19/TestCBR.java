package day19;

public class TestCBR
{
    public static void main(String[] args) {

        System.out.println("=====Assigning value to a & b=============");

        CBR cbr= new CBR(1, 5);//Assigning the value to global private variables a and b through constructor
        System.out.println(cbr.getA());//Getting the value of private variable a assigned by the constructor
        System.out.println(cbr.getB());//Getting the value of private variable a assigned by the constructor


        System.out.println("=====updating value to a & b=============");
        cbr.setA(10); //updating the value of a
        cbr.setB(50); //updating the value of b
        System.out.println(cbr.getA());//Getting the value of private variable a updated by the setA method
        System.out.println(cbr.getB());//Getting the value of private variable a updated by the setB method


        System.out.println("=====updating value to a & b by using Call By Reference Concept=============");
        cbr.updateValue(cbr);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

    }
}
