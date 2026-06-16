package day21;

public class ECommerceApplication {

    public ECommerceApplication() {
        System.out.println("Page Is Loading.......");
        System.out.println("Login into App............");
    }

    public ECommerceApplication doLogin(String un, String pw) {
        System.out.println("Login using un/pw: " + un + "," + pw);
        return this;
    }

    public ECommerceApplication doLogin(String un, int otp) {
        System.out.println("Login using un/otp: " + un + "," + otp);
        return this;
    }

    public ECommerceApplication doSearch(String productName) {
        System.out.println("Searching using product Name: " + productName);
        return this;
    }

    public ECommerceApplication doSearch(String productName, int price) {
        System.out.println("Searching using product Name & Price: " + productName + ", " + price);
        return this;
    }

    public ECommerceApplication doSearch(String productName, int price, String brand) {
        System.out.println("Searching using product Name, Price & Brand: " + productName + ", " + price + ", " + brand);
        return this;
    }

    public ECommerceApplication doAddToCart(String productName) {
        System.out.println("Adding Product to the Cart: " + productName);
        return this;
    }

    public ECommerceApplication doPayment(String ccNumber, int Cvv) {
        System.out.println("Making Payments  using Credit Card" + ccNumber + ", " + Cvv);
        return this;
    }

    public ECommerceApplication doPayment(String payPal) {
        System.out.println("Making Payments  using Paypal" + payPal);
        return this;
    }

    public ECommerceApplication generateOrderId() {
        System.out.println("4565464");
        return this;
    }

    public ECommerceApplication logOut() {
        System.out.println("Log out.....");
        return this;
    }
}
