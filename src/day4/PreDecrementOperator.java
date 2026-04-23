package day4;

public class PreDecrementOperator
{
    public static void main(String[] args) {

        int a =1;
        int b = --a;
        System.out.println(a);//0
        System.out.println(b);//0

        int c = 100;
        int d = --c;
        System.out.println(c);//99
        System.out.println(d);//99
    }
}
