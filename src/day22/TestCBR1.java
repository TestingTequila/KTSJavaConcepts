package day22;

public class TestCBR1
{
    public static void main(String[] args) {
        CBR1 cbr1 = new CBR1();
        cbr1.setA(12);
        cbr1.setB(4);
        System.out.println(cbr1.getA()); //12
        System.out.println(cbr1.getB()); //4

        System.out.println("***************************");

        cbr1.setA(120);
        cbr1.setB(40);
        System.out.println(cbr1.getA()); //120
        System.out.println(cbr1.getB()); //40
    }
}
