package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

        WebDriver driver=new FirefoxDriver();

       // driver.get("http://www.popuptest.com/popuptest2.html");
       driver.get("http://demo.automationtesting.in/Windows.html");

       driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();

        //driver.close();
        driver.quit();

    }
}
