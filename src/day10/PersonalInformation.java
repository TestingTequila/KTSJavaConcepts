package day10;

public class PersonalInformation
{
    //WAP to print the full name of a person

    String fName;
    String lName;

    public void fullName()
    {
        String completeName=fName+lName;
        System.out.println("Complete Name of Person is: " + completeName);
    }
}
