package day9;

public class TestUser
{
    public static void main(String[] args) {
         User u1 = new User();
         u1.name = "Ravi";
         u1.age = 60;
         u1.city = "Varanasi";

         User u2 = new User();
         u2.name = "Anjali";
         u2.age = 32;
         u2.city = "LA";

        User u3 = new User();
        u3.name = "Kareem";
        u3.age = 30;
        u3.city = "NY";

        final User u4 = new User();
        u4.name = "Ashish";
        u4.age = 34;
        u4.city = "Gurgaon";



        System.out.println(u1.name +", " + u1.age + ", " + u1.city);
        System.out.println(u2.name +", " + u2.age + ", " + u2.city);
        System.out.println(u3.name +", " + u3.age + ", " + u3.city);

        System.out.println("==============================u1=u2===============");

        u1= u2; //u1 is breaking its original connection and pointing where u2 is pointing

        System.out.println(u1.name +", " + u1.age + ", " + u1.city); //Anjali
        System.out.println(u2.name +", " + u2.age + ", " + u2.city); //Anjali
        System.out.println(u3.name +", " + u3.age + ", " + u3.city); //Kareem

        System.out.println("==============================u2=u3===============");

        u2 = u3;

        System.out.println(u1.name +", " + u1.age + ", " + u1.city); //Anjali
        System.out.println(u2.name +", " + u2.age + ", " + u2.city); //Kareem
        System.out.println(u3.name +", " + u3.age + ", " + u3.city); //Kareem

        System.out.println("==============================u3=u1===============");

        u3=u1;

        System.out.println(u1.name +", " + u1.age + ", " + u1.city); //Anjali
        System.out.println(u2.name +", " + u2.age + ", " + u2.city); //Kareem
        System.out.println(u3.name +", " + u3.age + ", " + u3.city); //Anjali

        //u4= u3; cannot be done as u4 is reference variable of a final class

    }

}
