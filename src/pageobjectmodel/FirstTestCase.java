package pageobjectmodel;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    void setup()
    {
        System.out.println("Opening browser");
    }

    @Test
    void login()
    {
        System.out.println("This is login test");
    }


    void teardown()
    {
        System.out.println("closing browser");
    }
}
