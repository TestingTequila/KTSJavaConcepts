package day18;

public class Registration
{
    String fname;
    String lName;
    int age;
    char gender;

    String state;
    String city;


    public Registration(String fname, String lName, int age, char gender, String state, String city)
    {
         this.fname = fname;
         this.lName = lName;
         this.age =age;
         this.gender = gender;
         this.state= state;
         this.city =city;
    }

    public Registration(String fname, String lName, int age, char gender)
    {
        this.fname = fname;
        this.lName = lName;
        this.age =age;
        this.gender = gender;
        this.state= "NY";
        this.city ="RoadStreet";
    }
}
