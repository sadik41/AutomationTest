package filedownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotAPIDemo
{
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("http://spreadsheetpage.com/index.php/site/file/yearly_calendar_workbook");

        driver.findElement(By.xpath(""));
    }
}
