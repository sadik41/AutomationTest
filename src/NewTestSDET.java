     /* Test case
        -----------
        1. Open a brower
        2. Open URL (http://wwww.newtours.demoaut.com/)
        3. Enter user name
        4. Enter password
        5. Click ok.
        6. Check the page tittle*/
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTestSDET
{
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");

        FirefoxDriver driver=new FirefoxDriver();

        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("t-shirts");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

        System.out.println("Page Title: "+driver.getTitle());

        String exp_title="Amazon.in: t-shirts";

        String Act_title=driver.getTitle();

        System.out.println(Act_title);

        if (exp_title.equals(Act_title)==true)
        {
            System.out.println("test is passed");
        }
        else
        {
            System.out.println("test is filled");
        }

        driver.quit();
    }

}
