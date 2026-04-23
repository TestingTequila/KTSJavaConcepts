package day4;

public class PostIncrementOperator {

    public static void main(String[] args) {
//        int a =1;
//        int b = a;
//        System.out.println(a);//1
//        System.out.println(b);//1

        //post increment++ [assigning & then increment]

        int a =1;
        int b = a++;
        System.out.println(a);//2
        System.out.println(b);//1

        int c = 100;
        int d = c++;
        System.out.println(c);//101
        System.out.println(d);//100


        int e = -99;
        int f = e++;
        System.out.println(e); //-98
        System.out.println(f); //-99

        int x =10;
        int y = x++;
        System.out.println(x);//11
        System.out.println(y);//10





    }
}
