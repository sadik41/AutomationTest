package automationtest.new1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

    FirefoxDriver driver=null;

    public  void  test1(){

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.learn-automation.com");

        String title=driver.getTitle();
        boolean value=title.contains("Selenium");

        System.out.println("Status value is "+value);
    }

    public  void test2(){
        driver.quit();
    }
}
