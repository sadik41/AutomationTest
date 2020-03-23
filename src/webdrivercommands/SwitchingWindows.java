package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchingWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Windows.html");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();

        //System.out.println(driver.getTitle());

       Set<String> s=driver.getWindowHandles();

       for (String i: s){
            String t=driver.switchTo().window(i).getTitle();

           if(t.contains("Frames & windows"))
           {
               driver.close();
           }
       }

    }
}
