package screenshot;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;


public class FacebookScreenShot  {
    WebDriver driver;

    public void captureScreenShotFacebook() throws Exception{
        System.setProperty("webdriver.gecko.driver","C://GeckoDriver.exe");
        driver=new FirefoxDriver();
        driver.get("http://www.facebook.com/");
        driver.findElement(By.id("u_0_m")).sendKeys("Maimuna Siddiqa");
        driver.findElement(By.id("u_0_15")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("F:/automationTest/Screenshots/facebook.png"));
        System.out.println("the Screenshot is taken");



    }
    public void quitDriver(){
        driver.quit();
    }

    public static void main(String[] args) throws Exception{
        FacebookScreenShot obj=new FacebookScreenShot();
        obj.captureScreenShotFacebook();
        obj.quitDriver();



    }

}
