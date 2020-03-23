package assertionstestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2
{
    SoftAssert softAssert1=new SoftAssert();
    SoftAssert softAssert2=new SoftAssert();

    @Test
    void demoTest(){
        softAssert1.assertEquals("welcome","wel"); // flase - failled
        softAssert1.assertAll();
    }
    @Test
    void demoTest2(){
        softAssert2.assertEquals("welcome","welcome");  // true - passed
        softAssert2.assertAll();
    }
}
