package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://jqueryui.com/resizable/");

        driver.switchTo().frame(0);

        WebElement resize=driver.findElement(By.xpath("//div[@id=\"resizable\"]/div[3]"));

        Actions act=new Actions(driver);
        act.moveToElement(resize).dragAndDropBy(resize,70,130).build().perform();
        Thread.sleep(3000);

    }
}
