package qrcodeautomation;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadingQRCode
{
    public static <URl> void main(String[] args) throws IOException, NotFoundException {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver();

        /*System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        System.setProperty("webdriver.edge.driver","C:/Users/Sadik/Downloads/MicrosoftWebDriver.exe");
        WebDriver driver=new EdgeDriver(); */

        driver.get("https://testautomationpractice.blogspot.com/");

        String qrCodeURL=driver.findElement(By.xpath("//div[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");

        URL url=new URL(qrCodeURL);

        BufferedImage bufferedImage=ImageIO.read(url);

        LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedImage);

        BinaryBitmap binaryBitmap=new BinaryBitmap( new HybridBinarizer(luminanceSource));

        Result result=new MultiFormatReader().decode(binaryBitmap);

        System.out.println(result.getText());
    }
}
