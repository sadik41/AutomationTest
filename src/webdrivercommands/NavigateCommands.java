package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.amazon.in/");
        System.out.println(driver.getTitle());

        driver.navigate().to("http://www.facebook.com/");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.navigate().forward();
        System.out.println(driver.getTitle());

        driver.navigate().refresh();

        driver.close();
    }

}
