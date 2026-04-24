package day6;

public class Test {

    public static void main(String[] args) {

        System.out.println("====WAP to print every alternate numbers from 1 - 20");

        System.out.println("=====Using While loop===============");
        int i = 1;
        while (i<=20)
        {
            System.out.println(i);
            i = i +2;
        }


        System.out.println("=====Using For loop===============");


        for (int j = 1;j<=20;j = j +2)
        {
            System.out.println(j);

        }
    }
}
