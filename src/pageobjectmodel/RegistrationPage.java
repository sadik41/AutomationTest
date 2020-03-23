package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage
{

    WebDriver driver;

    By RegLink= By.linkText("REGISTER");
    By FirstName= By.name("firstName");
    By LastName= By.name("lastName");
    By Phone= By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input");
    By email=By.id("userName");
    By address1=By.name("address1");
    By address2=By.name("address2");
    By city=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input");
    By state=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input");
    By postalCode=By.name("postalCode");
    By country=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select");
    By username=By.xpath("//input[@id=\"email\"]");
    By password=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input");
    By confirmPassword=By.name("confirmPassword");
    By registerBtn=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input");

    RegistrationPage(WebDriver d)
    {
        // this.driver=driver
        driver=d;
    }

    public  void clickRegLink()
    {
        driver.findElement(RegLink).click();
    }

    public  void setFirstName(String fname)
    {
        driver.findElement(FirstName).sendKeys(fname);
    }

    public  void setLastName(String lname)
    {
        driver.findElement(LastName).sendKeys(lname);
    }

    public  void setPhone(String ph)
    {
        driver.findElement(Phone).sendKeys(ph);
    }




}
