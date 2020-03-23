package automationtest.dropdown;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDropdown2 {
    @Test
    public void selectDDValues() throws InterruptedException
    {
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement month_dropdown = driver.findElement(By.id("month"));

        Select month_dd = new Select(month_dropdown);

        // It will select march
        month_dd.selectByIndex(3);

        WebElement seleted_value = month_dd.getFirstSelectedOption();

        System.out.println("After Selection selected values is "+seleted_value.getText());


    }
}
