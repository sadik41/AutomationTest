package datadriventest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDrivenTest3
{
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        // Getting data from ewxcel sheet

        FileInputStream file=new FileInputStream("D://SadikTestExcell//Registration.xlsx");

        // Get the workbook instance for XLS file

        XSSFWorkbook workbook=new XSSFWorkbook(file);

        XSSFSheet sheet=workbook.getSheet("Sheet1");


    }
}
