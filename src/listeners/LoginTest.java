package listeners;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test()
    public void loginByEmail()
    {
        System.out.println("this is the login by email");
        Assert.assertEquals("sadik","sadik"); //true
    }

    @Test
    public void loginByFacebook()
    {
        System.out.println("this is the login by facebook");
        Assert.assertEquals("sadik","selim"); // flase
    }
}
