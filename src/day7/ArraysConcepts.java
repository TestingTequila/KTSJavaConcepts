package day7;

import java.util.Arrays;

public class ArraysConcepts {
    public static void main(String[] args) {

        //12,45,67,3,89,100, 56

        //dataType[] arrayName = {value1, value2, value3, value4.......};

        int x = 10;

        //System.out.println(x); //10

        int[] marks = {12, 45, 67, 3, 89, 100, 56};

        System.out.println("======WHILE LOOP===========");
        int i = 0;
        while (i < marks.length) {
            System.out.println(marks[i]);
            i++;

        }

        System.out.println("======FOR LOOP===========");

        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);

        }

        System.out.println("================ADVANCED FOR LOOP==============");

        for (int m : marks)
        {
            System.out.println(m);
        }

        //System.out.println(marks.length);//7

        // Jason, Ron, Radha, Lee, Ashish, Bharati

        String[] names = {"Jason", "Ron", "Radha", "Lee", "Ashish", "Bharati"};

        System.out.println("======WHILE LOOP===========");
        int k =0;
        while (k<names.length)
        {
            System.out.println(names[k]);
            k++;
        }

        System.out.println("======FOR LOOP===========");

        for (int j =0;j<names.length;j++)
        {
            System.out.println(names[j]);
        }

        System.out.println("================ADVANCED FOR LOOP==============");

        for(String n:names)
        {
            if(n.equals("Lee"))
            {
                break;
            }
            System.out.println(n);
        }

        System.out.println("================TO DISPLAY===============");

        System.out.println(Arrays.toString(names));

        //System.out.println(names[5]);// Bharati
        //System.out.println(names[2]);// Radha

        String pageTitle = "Your Store";

        String[] tabs = {"Home", "Gift Certificates", "Brands", "Blogs", "Contact Us"};

        System.out.println("======WHILE LOOP===========");

        int p =0;
        while (p<tabs.length)
        {
            System.out.println(tabs[p]);
            p++;
        }

        System.out.println("======FOR LOOP===========");

        for (int q =0;q<tabs.length;q++)
        {
            System.out.println(tabs[q]);

        }

        System.out.println("================ADVANCED FOR LOOP==============");

        for(String t :tabs)
        {
            System.out.println(t);
        }

        System.out.println("======WHILE LOOP - Print alternate tabs ===========");

        int a =0;
        while (a<tabs.length)
        {
            System.out.println(tabs[a]);
            a = a+2;
        }

        System.out.println(Arrays.toString(tabs));
        System.out.println(Arrays.toString(marks));

    }
}



//Array when we don't know the exact values to store
//values with different data types
//Limitations of Array
