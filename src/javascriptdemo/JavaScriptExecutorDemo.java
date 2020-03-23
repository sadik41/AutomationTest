package javascriptdemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorDemo {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        /*System.setProperty("webdriver.edge.driver","C:/Users/Sadik/Downloads/MicrosoftWebDriver.exe");
        WebDriver driver=new EdgeDriver();*/

        driver.get("https://www.twoplugs.com/");

        driver.manage().window().maximize();

        // Flashing
        //WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
        // JavaScriptUtil.flash(joinfree,driver);

        //Drawing border
       // JavaScriptUtil.drawBorder(joinfree, driver);

        // Capture ScreenShot
//        File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File trg= new File ("D://ScreenShot/twoplugs.png");
//        FileUtils.copyFile(src,trg);

        // capture title page
        //System.out.println(driver.getTitle());

       // String title=JavaScriptUtil.getTitleByJS(driver);
       // System.out.println(title);

        // Clicking on element

      // WebElement loginButon=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a"));
       // JavaScriptUtil.clickElementByJS(loginButon,driver);

        // Generate and alert

        //JavaScriptUtil.generateAlert(driver,"You clicked on login button...");

        //driver.navigate().refresh();

        //JavaScriptUtil.refreshBrowserByJS(driver);

        // Scrolling
        WebElement image= driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
        JavaScriptUtil.scrollIntoView(image, driver);

        //JavaScriptUtil.scrollPageDown(driver);
    }
}
