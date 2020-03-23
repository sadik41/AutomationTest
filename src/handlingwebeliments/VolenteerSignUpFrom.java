package handlingwebeliments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VolenteerSignUpFrom {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");

        driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input")).sendKeys("Sadikur");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Rahman");

        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Vill:Kalaiura, P.O:Jaldhup,P.S:Beanibazar,Sylhet");

        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("sadikurrahamn@gmail.com");


    }
}
