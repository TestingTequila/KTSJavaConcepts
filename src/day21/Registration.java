package day21;

public class Registration {
    private String userName; // mandatory
    private String pw; //mandatory
    private int age;

    private int mobileNumber;//mandatory
    private String city;

    public Registration(String userName, String pw, int mobileNumber) {
        this(19, "New York");
        this.userName = userName;
        this.pw = pw;
        this.mobileNumber = mobileNumber;
    }

    public Registration(int age, String city) {
        this.age = age;
        this.city = city;
    }

    public Registration(String userName) {
        this(32, "Delhi");
        //this("Bharati", "test@1287", 5675675); cannot call more than one constructor within other constructor as this will
        //not be the first statement & we know constructor calling should be the first statement inside of other constructor
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getPw() {
        return pw;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getCity() {
        return city;
    }
}
