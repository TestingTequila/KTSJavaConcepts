package day12;

public class LaunchBrowser
{
    public String browserType(String browserName)
    {
        System.out.println("Launching the Browser....." + browserName);
        if(browserName.equals("Chrome"))
        {
            return "Chrome";
        }
        else if (browserName.equals("Firefox"))
        {
            return "Firefox";
        }
        else if (browserName.equals("Edge"))
        {
            return "Edge";
        }
        else if (browserName.equals("Safari"))
        {
            return "Safari";
        }
        else if (browserName.equals("IE"))
        {
            return "IE";
        }
        return "N/A";
    }
}
