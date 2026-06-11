package day19;

public class Browser
{
    public Browser() {

        System.out.println("Trying to Launch Browser....");
    }

    public  void launchBrowser()
    {
        checkOS();
        checkVersion();
        checkRAM();
        System.out.println("Browser is Launched...");
    }

    private   void checkRAM()
    {
        System.out.println("Checking RAM....");
    }

    private   void checkVersion()
    {
        System.out.println("Checking Version....");
    }

    private   void checkOS()
    {
        System.out.println("Checking OS....");
    }
}
