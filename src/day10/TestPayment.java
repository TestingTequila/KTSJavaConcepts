package day10;

public class TestPayment
{
    public static void main(String[] args) {

        Payment pay1= new Payment();
        pay1.basicSalary = 5000;
        pay1.travelAllowance =3000;
        pay1.calculateSalary();
    }
}
