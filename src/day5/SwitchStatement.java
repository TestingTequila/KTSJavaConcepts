package day5;

public class SwitchStatement
{
    public static void main(String[] args) {

        String browserName = "Edge";

        switch (browserName)
        {
            case "IE":
                System.out.println("Launch IE Browser..");
                break;
            case "Safari":
                System.out.println("Launch Safari Browser..");
                break;
            case "Chrome":
                System.out.println("Launch Chrome Browser..");
                break;
            case "Firefox":
                System.out.println("Launch Firefox Browser..");
                break;
            case "Edge":
                System.out.println("Launch Edge Browser..");
                break;
            default:
                System.out.println("Enter correct browser name");
                break;
            case "Opera":
                System.out.println("Launch Opera Browser..");
                break;


        }
    }
}
