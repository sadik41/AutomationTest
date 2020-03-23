package hashmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class Hmap {

   static HashMap <String,String> logindata()
   {
        HashMap <String,String> hm=new HashMap<String, String>();

        hm.put("x","Sadik@sadik");
        hm.put("y","sadik1@sadik1");
        hm.put("z","sadik2@sadik2");

        return hm;
   }


    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("http://newtours.demoaut.com/");

        // login as x

         String credentials=logindata().get("y");

         String arr[]=credentials.split("@"); // sadik sadik

        driver.findElement(By.name("userName")).sendKeys(arr[0]);
        driver.findElement(By.name("password")).sendKeys(arr[1]);

        driver.findElement(By.name("login")).click();

        // Validation

        if (driver.getTitle().equals("Find a Flight: Mercury Tours:"))
        {
            System.out.println("Test is passed");
        }
        else
        {
            System.out.println("Test is failed");
        }
        driver.findElement(By.linkText("Home"));


    }
}
