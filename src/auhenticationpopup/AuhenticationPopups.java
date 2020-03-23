package auhenticationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuhenticationPopups {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //driver.get("http://the-internet.herokuapp.com/basic_auth");

        // http://username:password@test.com

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

        String text=driver.findElement(By.cssSelector("#content > div > p")).getText();
        System.out.println(text);

        driver.close();

    }
}
