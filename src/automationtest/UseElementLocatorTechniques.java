package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class UseElementLocatorTechniques {
    FirefoxDriver driver;

    public void invokeBrowser(String url)
    {

        try
        {
            System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.get(url);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void closeBrowser(){
        driver.close();
    }
    public void elementLocatorTechniques()
    {
       try {
           invokeBrowser("http://www.amazon.in");
           driver.findElement(By.linkText("Best Sellers")).click();
           Thread.sleep(1000);
           driver.navigate().back();
           driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
           Thread.sleep(1000);
           driver.findElement(By.className("nav-input")).click();
           driver.navigate().back();
           driver.findElement(By.partialLinkText("Today's Deals")).click();
           Thread.sleep(1000);

       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
    public void elementLocatorTechniquesFacebook()
    {
        try{
            invokeBrowser("http://www.facebook.com");
            driver.findElement(By.name("firstname")).sendKeys("urakalai420@gmail.com");
            driver.findElement(By.cssSelector("input#email")).sendKeys("sadikurrahman41@gmail.com");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        UseElementLocatorTechniques obj=new UseElementLocatorTechniques();
        //obj.elementLocatorTechniques();
        obj.elementLocatorTechniquesFacebook();
    }
}
