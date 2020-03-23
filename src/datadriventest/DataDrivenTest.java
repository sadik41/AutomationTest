package datadriventest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDrivenTest {

    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("C://Users//Sadik//Desktop//SeleniumPractice//test.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook(file);

        //XSSFSheet sheet=workbook.getSheet("Sheet1"); // proving sheet name
        XSSFSheet sheet=workbook.getSheetAt(0);  // proving sheet name

        int rowCount=sheet.getLastRowNum(); //returns the row count
        int colCount=sheet.getRow(0).getLastCellNum();// returns column/cell count

        for (int i=0;i<rowCount;i++)
        {
            XSSFRow currentRow=sheet.getRow(i); //focussed on current row
            for (int j=0;j<colCount;j++)
            {
                String value=currentRow.getCell(j).toString();
                System.out.print("  "+value);
            }
            System.out.println();
        }






    }
}
