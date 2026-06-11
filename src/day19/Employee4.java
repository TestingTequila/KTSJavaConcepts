package day19;

public class Employee4 {
    private String state;
    private String city;
    private int atmPin;

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getAtmPin() {
        return atmPin;
    }

    public Employee4(String state, String city, int atmPin) {
        this.state = state;
        this.city = city;
        this.atmPin = atmPin;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }


}
