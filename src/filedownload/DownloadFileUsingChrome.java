package filedownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChrome {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/FileDownload.html");

        driver.findElement(By.id("textbox")).sendKeys("testing");
        driver.findElement(By.xpath("//button[@id=\"createTxt\"]")).click();  //generate txt file
        driver.findElement(By.id("link-to-download")).click(); //display download and link

        driver.findElement(By.xpath("//textarea[@id=\"pdfbox\"]")).sendKeys("testing pdf download");
        driver.findElement(By.xpath("//button[@id=\"createPdf\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"pdf-link-to-download\"]")).click();

        //driver.quit();

    }
}
