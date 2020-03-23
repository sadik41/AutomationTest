package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException, FindFailed {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();

        String imagesFilePath="D:\\SeleniumJars\\SikuliPractice\\";
        String inputFilePath="D:\\SeleniumJars\\SikuliPractice\\";

        Screen s=new Screen();

        Pattern fileInputTextbox=new Pattern(imagesFilePath+"Box.PNG");
        Pattern openButton=new Pattern(imagesFilePath+"Open.PNG");

        Thread.sleep(5000);

        s.wait(fileInputTextbox,20);
        s.type(fileInputTextbox,inputFilePath+"fruiits.jpg");
        s.click(openButton);



    }
}
