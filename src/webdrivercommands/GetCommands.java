package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.amazon.in/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/div[3]/div[2]/div[1]/a[4]")).getText();

        System.out.println(text);





    }
}
