package ashotapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompareImages {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

       BufferedImage expectedImage= ImageIO.read(new File("C://Users//Sadik//Desktop//SeleniumPractice/OrangeHRMlogo.png"));

       WebElement logoImageElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img"));
       Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver,logoImageElement);

       BufferedImage actualImage=logoImageScreenshot.getImage();

        ImageDiffer imgDiff=new ImageDiffer();
        ImageDiff diff=imgDiff.makeDiff(expectedImage,actualImage);

        if(diff.hasDiff()==true) // this will compare 2 images
        {
            System.out.println("Images age not same");
        }
        else
        {
            System.out.println("Images are same");
        }
        driver.quit();

    }
}
