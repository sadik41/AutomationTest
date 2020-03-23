package handlingwebeliments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("file:///D:/SadikTestExcell/sample.html");

        int r=driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
        System.out.println(r);

        int c=driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
        System.out.println(c);

        for (int i=2; i<=r;i++)
        {
            for (int j=1;j<=c;j++)
            {
               String s= driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.print(s+"   ");
            }
            System.out.println();
        }

    }
}
