package day4;

public class PostDecrementOperator
{
    public static void main(String[] args) {

        //post Decrement -- [assigning & then decrement]
        int a =1;
        int b = a--;
        System.out.println(a);//0
        System.out.println(b);//1

         int c = -99;
         int d = c--;
        System.out.println(c);//-100
        System.out.println(d);//-99


    }
}
