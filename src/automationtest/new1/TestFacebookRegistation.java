package automationtest.new1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistation {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Sadikur");
        driver.findElement(By.xpath("//input[@id='u_0_7']")).click();

        Select select1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        select1.selectByVisibleText("Dec");

        Select select2=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        select2.selectByValue("6");

        Select select3=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        select3.selectByValue("1989");

        driver.findElement(By.xpath("//button[@id='u_0_15']")).click();

        driver.findElement(By.xpath("//a[@class='_8esh']")).click();


        driver.quit();


    }
}
