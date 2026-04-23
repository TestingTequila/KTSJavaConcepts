package day5;

public class IfElseIfStatement2
{
    public static void main(String[] args) {
        String browser = "Chrome";

        if(browser.equals("IE"))
        {
            System.out.println("Launch Internet Explorer Browser...");
        }
        else if (browser.equals("Firefox"))
        {
            System.out.println("Launch Firefox Browser...");
        }
        else if (browser.equals("Safari"))
        {
            System.out.println("Launch Chrome Browser...");
        }
        else if (browser.equals("Chrome"))
        {
            System.out.println("Launch Chrome Browser...");
        }
        else
        {
            System.out.println("Not a valid browser name....");
        }
    }
}
