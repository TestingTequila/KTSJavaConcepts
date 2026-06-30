package day24;

public class BMW extends Car
{
   String name = "Ashish";

    @Override
    public  void start()
    {
        System.out.println("BMW start.....");
    }

    public  void autoParking()
    {
        System.out.println("BMW auto-parking");
    }

    public static void billing()
    {
        System.out.println("BMW billing....");
    }

    /*
    cannot be overridden as this is final
    @Override
    public  void brandLogo()
    {
        System.out.println("BMW Brand Logo...");
    }
    */

}
