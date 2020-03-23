package assertionstestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SortAssertTest {

    SoftAssert softAssert=new SoftAssert();

    @Test
    void demoTest(){
        softAssert.assertTrue(true); // passed
        softAssert.assertEquals("Welcome","Welcome");
        softAssert.assertEquals("Selenium","Selenium");
        System.out.println("Successfully passed!");
        softAssert.assertAll();
    }
}
