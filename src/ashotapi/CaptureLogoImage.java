package ashotapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CaptureLogoImage {

    public static void main(String[] args) throws IOException {

       // System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        //WebDriver driver=new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logoImageElemet=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img"));

        Screenshot logoImageScreenshot= new AShot().takeScreenshot(driver,logoImageElemet);
        ImageIO.write(logoImageScreenshot.getImage(),"png",new File("C://Users//Sadik//Desktop//SeleniumPractice/OrangeHRMlogo.png"));

        File f=new File("C://Users//Sadik//Desktop//SeleniumPractice/OrangeHRMlogo.png");

        if (f.exists())
        {
            System.out.println("Image File Captured");
        }
        else
        {
            System.out.println("Image File Not Captured");
        }
    }
}
