package day22;

public class TestCBR
{
    public static void main(String[] args) {

        CBR cbr= new CBR(12,4);
        System.out.println(cbr.getA());//4
        System.out.println(cbr.getB());//12
        System.out.println("*******************************");
        cbr.setA(40);
        cbr.setB(120);
        System.out.println(cbr.getA());//40
        System.out.println(cbr.getB());//120

        System.out.println("*******************************");

        cbr.updateValue(cbr);
        System.out.println(cbr.getA());//400
        System.out.println(cbr.getB());//1200




    }
}
