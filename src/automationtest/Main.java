package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    FirefoxDriver driver;

    public void invokeBrowser(){

        try {
            System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
            getCommads();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getCommads(){
       try {
           driver.get("http://www.amazon.in");
           String titleOfThePage=driver.getTitle();
           System.out.println("Title of the page is: "+titleOfThePage);
           driver.findElement(By.linkText("Today's Deals")).click();
           String currentUrl=driver.getCurrentUrl();
           System.out.println("The current Url is: "+currentUrl);
           System.out.println("The current page source is: "+driver.getPageSource());
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {

        Main myObj=new Main();
        myObj.invokeBrowser();


    }
}
