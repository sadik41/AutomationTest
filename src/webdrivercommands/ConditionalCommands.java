package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.facebook.com/");

        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));

        WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));

        if(email.isDisplayed() && email.isEnabled())
        {
            email.sendKeys("sadikurrahman41@gmail.com");

        }
        if(pass.isDisplayed() && pass.isEnabled())
        {
            pass.sendKeys("41403785sadik");
        }
          //Female
        System.out.println(driver.findElement(By.xpath("//input[@id='u_0_6']")).isSelected());//false
           //Male
        System.out.println(driver.findElement(By.xpath("//input[@id='u_0_7']")).isSelected()); //false

        //select femame radio button
        if(driver.findElement(By.xpath("//input[@id='u_0_6']")).isSelected()==false)
        {
            driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
        }

    }
}
