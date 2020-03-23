package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class TestNavigateCommands
{
    FirefoxDriver driver;

    public void invokeBrowser1() {

        try {
            System.setProperty("webdriver.gecko.driver", "C:\\GeckoDriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            navigateCommands();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void navigateCommands(){

            driver.navigate().to("http://www.flipkart.com");
            driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/span")).click();
    }

        public static void main (String[]args)
        {
            TestNavigateCommands test1=new TestNavigateCommands();
            test1.invokeBrowser1();

        }

    }


