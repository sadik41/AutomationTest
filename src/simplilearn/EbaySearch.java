package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySearch {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        driver=new FirefoxDriver();
        driver.get("http://www.ebay.com/");
    }

    public void searchProduct() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.id("gh-ac")).sendKeys("JBL Spekers");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Daily Deals")).click();
    }

    public void navigate() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("http://www.simpilearn.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("The tittle of this page is : "+driver.getTitle());

    }
    public void closeBrowser(){
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {

        EbaySearch obj=new EbaySearch();
        obj.launchBrowser();
        obj.searchProduct();
        obj.navigate();
        obj.closeBrowser();

    }
}
