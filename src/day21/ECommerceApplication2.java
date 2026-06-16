package day21;

public class ECommerceApplication2 {

    public ECommerceApplication2() {
        System.out.println("Page Is Loading.......");
        System.out.println("Login into App............");
    }

    public ECommerceApplication2 doLogin(String un, String pw) {
        System.out.println("Login using un/pw: " + un + "," + pw);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 doLogin(String un, int otp) {
        System.out.println("Login using un/otp: " + un + "," + otp);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 doSearch(String productName) {
        System.out.println("Searching using product Name: " + productName);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 doSearch(String productName, int price) {
        System.out.println("Searching using product Name & Price: " + productName + ", " + price);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 doSearch(String productName, int price, String brand) {
        System.out.println("Searching using product Name, Price & Brand: " + productName + ", " + price + ", " + brand);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 doAddToCart(String productName) {
        System.out.println("Adding Product to the Cart: " + productName);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 doPayment(String ccNumber, int Cvv) {
        System.out.println("Making Payments  using Credit Card" + ccNumber + ", " + Cvv);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 doPayment(String payPal) {
        System.out.println("Making Payments  using Paypal" + payPal);
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 generateOrderId() {
        System.out.println("4565464");
        return new ECommerceApplication2();
    }

    public ECommerceApplication2 logOut() {
        System.out.println("Log out.....");
        return new ECommerceApplication2();
    }
}
