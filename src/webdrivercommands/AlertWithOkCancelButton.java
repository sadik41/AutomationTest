package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancelButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Alerts.html");

        // alert with Ok and Cancel link
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

        // alert with ok Cancel button
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

        String expTextOk="You pressed Ok";
        driver.switchTo().alert().accept();

        String actText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();

        if(expTextOk.equals(actText)==true)
        {
            System.out.println("test is passed");
        }

        // alert with ok Cancel button
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

        String ExpTextCancel="You Pressed Cancel";
        driver.switchTo().alert().dismiss();

        actText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();

        if(ExpTextCancel.equals(actText)==true)
        {
            System.out.println("test is passed");
        }
    }
}
