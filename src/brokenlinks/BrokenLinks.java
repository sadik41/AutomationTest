package brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {

    public static void main(String[] args) throws InterruptedException, IOException {
        // Initiate driver
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Maximize page
        driver.manage().window().maximize();

        //Implicit wait for 10 sec
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Open Url of page
        driver.get("http://newtours.demoaut.com/");

        //wait
        Thread.sleep(5000);

        //capture links from a webpage
        List <WebElement> links=driver.findElements(By.tagName("a"));

        //Numbers of links
        System.out.println(links.size());

        for(int i=0;i<links.size();i++)
        {
            // by using href attribute we can get URL of required link
            WebElement element=links.get(i);
            String url=element.getAttribute("href");

            URL link=new URL(url);

            //create a connection using url object 'link'
            HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
            Thread.sleep(2000);

            httpconn.connect();

            int rescode=httpconn.getResponseCode();

            if(rescode>=400)
            {
                System.out.println(url+" - "+" is broken link");
            }
            else
            {
                System.out.println(url+" - "+" is valid link");
            }

        }


    }


}
