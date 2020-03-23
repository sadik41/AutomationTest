package automationtest;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBrowserCommands
{

    FirefoxDriver driver;

    public void invokeBrowser()
    {

        try {
            System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
            driver.get("http://www.yatra.com");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void  closeBrowser()
    {
        try {
           // driver.close();
            driver.quit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        TestBrowserCommands obj=new TestBrowserCommands();
        obj.invokeBrowser();
        obj.closeBrowser();


    }
}
