package day19;

public class Admin
{
    private String userName;
    private int password;

    private String gender;

    public Admin(String userName) {
        this.userName = userName;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
