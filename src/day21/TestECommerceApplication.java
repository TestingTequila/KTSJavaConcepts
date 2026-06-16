package day21;

public class TestECommerceApplication {
    public static void main(String[] args) {
        ECommerceApplication ecommerceApp = new ECommerceApplication();
        ecommerceApp.doLogin("ashish", "test@1234")
                .doSearch("IPad", 57575)
                .doAddToCart("IPad").doPayment("ashish@paypal")
                .generateOrderId().logOut();

        ECommerceApplication ecm = new ECommerceApplication();
        ecm.doLogin("manthan", 43534).doSearch("Laptop").logOut();

//        ecommerceApp.doLogin("ashish2134", "test@1234");
//        ecommerceApp.doSearch("iphone", 565675);
//        ecommerceApp.doAddToCart("iphone");
//        ecommerceApp.doPayment("456546546456", 5675);
//        ecommerceApp.generateOrderId();
//        ecommerceApp.logOut();

    }
}
