package assertionstestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {

    @Test
    public  void loginT()
    {
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver(); // launch the browser

        driver.get("http://newtours.demoaut.com/");  // open URL

        WebElement usernametxt=driver.findElement(By.name("userName"));
        WebElement passwordtxt=driver.findElement(By.name("password"));

        // This is to check whether the textbox is displayed or not
        // Test will only continue, if the below statement is true

        Assert.assertTrue(usernametxt.isDisplayed());
        usernametxt.sendKeys("Sadik");

        Assert.assertTrue(passwordtxt.isDisplayed());
        passwordtxt.sendKeys("sadik");

        /*Assert.assertFalse(usernametxt.isDisplayed());
        usernametxt.sendKeys("Sadik");

        Assert.assertFalse(passwordtxt.isDisplayed());
        passwordtxt.sendKeys("sadik");*/

        driver.findElement(By.name("login")).click();

        // Validation

        String exceptedTitle="Find a Flight: Mercury Tours:";

        Assert.assertEquals(exceptedTitle,driver.getTitle()); // compare both the titles

        driver.close();


    }
}
