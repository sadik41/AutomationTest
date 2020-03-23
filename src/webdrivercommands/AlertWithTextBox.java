package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
         // 1st click
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();

        driver.switchTo().alert().sendKeys("testing");
        driver.switchTo().alert().accept();

        String expString="Hello testing How are you today";

        String actString=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();

        if(expString.equals(actString))
        {
            System.out.println("test is passed");
        }




    }
}
