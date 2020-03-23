package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FileUploadWithAutoIT {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//input[@id=\"imagesrc\"]")).click();

        Runtime.getRuntime().exec("D://SeleniumJars/auto it/file upload.exe");

    }
}
