package day21;

public class TestBooking {
    public static void main(String[] args) {
        //Booking book = new Booking("Jaosn,", "Roger", 32, "test@1", "Test@1", "Delhi", 'm', "India");

        Booking booking = new Booking();
        booking.setAge(32).setCity("Delhi").setCountry("India").setGender('F').setfName("Kerrie").setlName("Wright").setPassword("Test@1").setConfirmPassword("test@1");
    }
}
