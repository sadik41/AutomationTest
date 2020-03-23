package pageobjectmodel;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.DOMConfiguration;

import java.util.logging.Logger;

public class RegistrationPage2
{
    Logger logger=Logger.getLogger("RegistrationPage2");



    WebDriver driver;

    @FindBy(how = How.LINK_TEXT,using = "REGISTER") //syntax 1
    WebElement RegLink;

    @FindBy(how = How.NAME,using = "firstName") //syntax 2
    WebElement FirstName;

    @FindBy(name = "lastName") //syntax 2
    WebElement LastName;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(id = "userName")
    WebElement email;

    @FindBy(name = "address1")
    WebElement address1;

    @FindBy(name = "address2")
    WebElement address2;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(name = "postalCode")
    WebElement postalCode;

    @FindBy(name = "country")
    WebElement country;

    @FindBy(name = "email")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(name = "register")
    WebElement registerBtn;

    RegistrationPage2 (WebDriver d){
        // this.driver=driver;
        driver=d;
        PageFactory.initElements(d,this); //additional method
    }

    public void clickRegLink(){
        RegLink.click();
    }

    public void setFirstName(String firstName)
    {
        FirstName.sendKeys(firstName);
    }

    public void setLastName(String lastName)
    {
        LastName.sendKeys(lastName);
    }

    public void setPhone(String ph)
    {
        phone.sendKeys(ph);
    }

    public void setEmail(String em)
    {
        email.sendKeys(em);
    }

    public void setAddress1(String ad1)
    {
        address1.sendKeys(ad1);
    }

    public void setAddress2(String ad2)
    {
        address2.sendKeys(ad2);
    }

    public void setCity(String cty)
    {
        city.sendKeys(cty);
    }

    public void setState(String sta)
    {
        state.sendKeys(sta);
    }

    public void setPostalCode(String pscode)
    {
        postalCode.sendKeys(pscode);
    }

    public void setCountry(String cutry)
    {
        country.sendKeys(cutry);
    }

    public void setUsername(String uname)
    {
        username.sendKeys(uname);
    }

    public void setPassword(String pword)
    {
        password.sendKeys(pword);
    }

    public void setConfirmPassword(String coPasWord)
    {
        confirmPassword.sendKeys(coPasWord);
    }

    public void clickRegistratoinButton()
    {
        registerBtn.click();
    }

}
