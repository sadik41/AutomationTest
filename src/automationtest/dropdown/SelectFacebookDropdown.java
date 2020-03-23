package automationtest.dropdown;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDropdown {
    @Test
    public void selectDDValues() throws InterruptedException
    {
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement month_dropdown = driver.findElement(By.id("month"));

        Select month__dd = new Select(month_dropdown);
        // It will select march
        month__dd.selectByIndex(3);

        Thread.sleep(3000);

        // It will select October
        month__dd.selectByValue("10");

        Thread.sleep(3000);
        month__dd.selectByVisibleText("Aug");
    }
}
