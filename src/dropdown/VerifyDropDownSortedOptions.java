package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VerifyDropDownSortedOptions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.xpath("//select[@id=\"animals\"]"));

        Select se=new Select(element);

        List originalList=new ArrayList();
        List tempList=new ArrayList();

        List <WebElement>options=se.getOptions();
        for(WebElement e:options)
        {
            originalList.add(e.getText());
            tempList.add(e.getText());
        }
        System.out.println("Before Original list : "+originalList);
        System.out.println("Before Temp list : "+tempList);

        Collections.sort(tempList);


        System.out.println("After sorting origilaList list"+originalList);
        System.out.println("After sorting temp list"+tempList);

        if (originalList == tempList)
        {
            System.out.println("Dropdown sorted");
        }
        else
        {
            System.out.println("Dropdown not sorted");
        }
        driver.close();
    }
}
