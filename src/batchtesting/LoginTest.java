package batchtesting;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginByemail()
    {
        System.out.println("this is the login by email");
    }

    @Test
    public void loginByfacebook()
    {
        System.out.println("this is the login by facebook");
    }

    @Test
    public void loginBytwitter()
    {
        System.out.println("this is the login by twitter");
    }

}
