package day19;

public class Employee3 {
    private String aadharNumber;
    private String panNumber;
    private int accountNumber;
    private String state;
    private String city;
    private int atmPin;

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }


    public Employee3(String aadharNumber, String panNumber, int accountNumber) {
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.accountNumber = accountNumber;
    }
}
