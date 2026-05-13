package day12;

public class TestLaunchBrowser
{
    public static void main(String[] args) {
         LaunchBrowser browser= new LaunchBrowser();
         String browserName =browser.browserType("Edge");
        System.out.println("Launched..." + browserName);
    }
}
