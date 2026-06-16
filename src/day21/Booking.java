package day21;

public class Booking
{
    private String fName;
    private String lName;
    private int age;
    private String password;
    private String confirmPassword;
    private String city;
    private char gender;
    private String country;


//    public Booking(String fName, String lName, int age, String password, String confirmPassword, String city, char gender, String country) {
//        this.fName = fName;
//        this.lName = lName;
//        this.age = age;
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//        this.city = city;
//        this.gender = gender;
//        this.country = country;
//    }


    public Booking setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public Booking setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public Booking setAge(int age) {
        this.age = age;
        return this;
    }

    public Booking setPassword(String password) {
        this.password = password;
        return this;
    }

    public Booking setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public Booking setCity(String city) {
        this.city = city;
        return this;
    }

    public Booking setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public Booking setCountry(String country) {
        this.country = country;
        return this;
    }
}
