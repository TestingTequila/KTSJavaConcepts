package day27;

import java.util.Arrays;

public class StringManipulation
{
    public static void main(String[] args) {
        String str = "This is my Java Code";
        System.out.println(str.length());//20
        System.out.println(str.charAt(3));//s
        System.out.println(str.charAt(19));//e
        //System.out.println(str.charAt(20));

        System.out.println(str.indexOf('s'));//3
        System.out.println(str.indexOf("Java"));//11
        System.out.println(str.indexOf('i'));//2
        System.out.println(str.indexOf('i', str.indexOf('i')+1));

       String message=  "Welcome to Payment Page Bharati";
       if(message.indexOf("Ashish")==24)
       {
           System.out.println("I will make the Payment");
       }
       else
       {
           System.out.println("This is not my payment page");
       }

        //trim: removes the space before and after a String
        String s2 = "           Hello Bharati     ";
        System.out.println(s2);
        System.out.println(s2.trim());

        //replace

        System.out.println(s2.replace(" ", ""));

        String dob = "25/12/1990";
        System.out.println(dob);
        System.out.println(dob.replace("/", "-"));


        String s3 = "I Hate Java";
        System.out.println(s3);
        System.out.println(s3.replace("Hate", "Love"));

        //equal
        String e1 = "Hello Selenium";
        String e2 = "Hello SELENIUM";

        System.out.println(e1.equals(e2));//false
        System.out.println(e1.equalsIgnoreCase(e2));//true


        //contains

        String s4 = "This is trainer Ashish Here";
        System.out.println(s4.contains("Ashish"));

        //split

        String lang = "Java_Python_C#_JavaScript_TypeScript";
        System.out.println(lang.length());
        String[] l =lang.split("_");
        System.out.println(l.length);
        System.out.println(Arrays.toString(l));


        String lang1 = "Java Python C# JavaScript TypeScript VB";
        String[] l1 =lang1.split(" ");
        System.out.println(l1.length);
        System.out.println(Arrays.toString(l1));







    }





}
