package filedownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadUsingFirefox {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

        //creating browser profile
        FirefoxProfile profile=new FirefoxProfile();
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");
        profile.setPreference("browser.download.manager.showwhenStarting",false);

        FirefoxOptions option=new FirefoxOptions();
        option.setProfile(profile);

        WebDriver driver=new FirefoxDriver(option);

        driver.get("http://demo.automationtesting.in/FileDownload.html");

        driver.findElement(By.xpath("//textarea[@id=\"textbox\"]")).sendKeys("testing");
        driver.findElement(By.xpath("//button[@id=\"createTxt\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"link-to-download\"]")).click();

        driver.quit();





    }
}
