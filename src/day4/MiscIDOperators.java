package day4;

public class MiscIDOperators {
    public static void main(String[] args) {

        float f = 2.5F;
        float g = ++f;

        System.out.println(f);//3.5
        System.out.println(g);//3.5


        char ch1 = 'a';
        char ch2 = ch1++;
        System.out.println(ch1);//b
        System.out.println(ch2);//a


        int num = 10;
        System.out.println(num++);//10
        System.out.println(num);//11


        int total = 10;
        System.out.println(++total);//11
        System.out.println(total);//11

    }
}
