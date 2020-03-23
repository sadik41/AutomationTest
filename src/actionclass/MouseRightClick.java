package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions act=new Actions(driver);

        WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        act.contextClick(button).build().perform(); //right click on the element

        driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();

        System.out.println(driver.switchTo().alert().getText()); //capture the text alert box

        driver.switchTo().alert().accept();
    }
}
