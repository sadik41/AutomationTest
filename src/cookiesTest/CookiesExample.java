package cookiesTest;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class CookiesExample
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");

        Set <Cookie> cookies=driver.manage().getCookies(); // capture all the cookies of the browser

        System.out.println("Size of Cookies: "+cookies.size()); //print size of cookies
        for(Cookie cookie:cookies) // read and print all the cookies
        {
            System.out.println(cookie.getName()+":"+cookie.getValue()); // prints name and value of cookies
        }

       // System.out.println(driver.manage().getCookieNamed("x-wl-uid")); //prints specific cookies according to the name

        // add new cookie to the browser
        Cookie cobj=new Cookie("mycookie","1234567890");
        driver.manage().addCookie(cobj);

        cookies=driver.manage().getCookies();
        System.out.println("Size of Cookies: "+cookies.size()); //print size of cookies

        for(Cookie cookie:cookies) // read and print all the cookies
        {
            System.out.println(cookie.getName()+":"+cookie.getValue()); // prints name and value of cookies
        }

        // deleting cookies

        /*driver.manage().deleteCookie(cobj);
        cookies=driver.manage().getCookies();
        System.out.println("size of cookies:"+ cookies.size());*/

        driver.manage().deleteAllCookies();

        cookies=driver.manage().getCookies();
        System.out.println("size of cookies:"+ cookies.size());

        driver.quit();
    }



}
