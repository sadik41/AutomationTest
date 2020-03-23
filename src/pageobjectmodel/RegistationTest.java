package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistationTest {

        @Test
        public  void verifyFlightReg(){

        System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver.exe");
        WebDriver driver=new FirefoxDriver();

       // RegistrationPage Rg1=new RegistrationPage(driver);

        RegistrationPage2 Rg2=new RegistrationPage2(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");

        Rg2.clickRegLink();
        Rg2.setFirstName("Sadikur");
        Rg2.setLastName("Rahman");
        Rg2.setPhone("01717414881");
        Rg2.setEmail("sadik41@gmail.com");
        Rg2.setAddress1("Kalaiura");
        Rg2.setAddress2("Beanibazar");
        Rg2.setCity("Dhaka");
        Rg2.setState("Bd");
        Rg2.setPostalCode("8736");
        Rg2.setCountry("Bangladesh");
        Rg2.setUsername("Sadik");
        Rg2.setPassword("sadik");
        Rg2.setConfirmPassword("sadik");

        Rg2.clickRegistratoinButton();

        //Validation

        if (driver.getPageSource().contains("Thank you for registering")){
                System.out.println("Your Registered successfully- Test Passed");
        }
        else{
                System.out.println("Test Failed");
        }
    }
}

