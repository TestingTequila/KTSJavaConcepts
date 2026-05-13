package day12;

public class LaunchBrowsers
{
    public String browserType(String browserName)
    {
        System.out.println("Launching the Browser....." + browserName);
        String myBrowser = "N/A";

        if(browserName.equals("Chrome"))
        {
            myBrowser= "Chrome";
        }
        else if (browserName.equals("Firefox"))
        {
            myBrowser=  "Firefox";
        }
        else if (browserName.equals("Edge"))
        {
            myBrowser=  "Edge";
        }
        else if (browserName.equals("Safari"))
        {
            myBrowser=  "Safari";
        }
        else if (browserName.equals("IE"))
        {
            myBrowser=  "IE";
        }
        return myBrowser;
    }
}
