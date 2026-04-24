package day6;

public class WhileLoopConcept {

    public static void main(String[] args) {
//         Ashish - Print 10 times

//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");


        int i =1;

        while (i<=10)
        {
            System.out.println("Ashish");
            i++;//11

        }


        // WAP to print numbers from 1- 10;

        System.out.println("====================WAP to print numbers from 1- 10=====================");

        int j =1;

        while (j<=10)
        {
            System.out.println(j);
            j++;
        }


        System.out.println("====================WAP to print numbers from 10- 1=====================");


        int k = 10;

        while (k>0)
        {
            System.out.println(k);//10
            k--;
        }



        System.out.println("====================WAP to print table of 2=====================");

        int m = 1;

        while (m<=10)
        {
            System.out.println(2*m);
            m++;
        }



        System.out.println("====================WAP to print table of 2 except the value 10=====================");

        int n = 1;

        while (n<=10)
        {
            int x =2*n;
            if(x!=10)
            {
                System.out.println(x);
            }
            n++;

        }

    }
}
