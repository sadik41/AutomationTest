package barcodeautomation;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadTestFromBarCode
{

    public static void main(String[] args) throws IOException, NotFoundException {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver();

        /*System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();*/

        driver.get("https://testautomationpractice.blogspot.com/");

       // String barCodeURL=driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
        String barCodeURL=driver.findElement(By.xpath("//div[@id=\"HTML12\"]/div[1]/img[2]")).getAttribute("src");

        System.out.println(barCodeURL);
        URL url =new URL(barCodeURL);
        BufferedImage bufferImage= ImageIO.read(url);

        LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferImage);
        BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));

        Result result=new MultiFormatReader().decode(binaryBitmap);
        System.out.println("Result: "+result.getText());

    }

}
