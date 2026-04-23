package day5;

public class SwitchStatement2
{
    public static void main(String[] args) {
        String day = "Saturday";

        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Go to Office");
                break;
            default:
                System.out.println("Its weekend ...stay at home");
        }
    }

}
