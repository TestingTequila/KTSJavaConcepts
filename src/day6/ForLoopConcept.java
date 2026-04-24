package day6;

public class ForLoopConcept {

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




        for (int i =1;i<=10;i++)
        {
            System.out.println("Ashish");
        }


        // WAP to print numbers from 1- 10;

        System.out.println("====================WAP to print numbers from 1- 10=====================");



        for (int j =1;j<=10;j++)
        {
            System.out.println(j);

        }


        System.out.println("====================WAP to print numbers from 10- 1=====================");


        for (int k = 10;k>0;k--)
        {
            System.out.println(k);//10

        }


        System.out.println("====================WAP to print table of 2=====================");



        for (int m = 1;m<=10;m++)
        {
            System.out.println(2*m);
        }



        System.out.println("====================WAP to print table of 2 except the value 10=====================");



        for (int n = 1;n<=10;n++)
        {
            int x =2*n;
            if(x!=10)
            {
                System.out.println(x);
            }


        }

    }
}
