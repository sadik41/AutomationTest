package assertionstestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssert
{
    @Test
    void demoTest(){
        Assert.assertTrue(true); // passed
        Assert.assertEquals("welcome","Welcome"); // flase - failed
        Assert.assertEquals("Selenium","Selenium"); // true - passed
        System.out.println("Successfully passed!");

    }
}
