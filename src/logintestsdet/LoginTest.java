package logintestsdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest   {

    public static void main(String[] args)
    {

   System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();


        driver.get("http://www.amazon.in/");



    }
}
