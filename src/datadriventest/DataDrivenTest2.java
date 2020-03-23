package datadriventest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDrivenTest2 {

    public static void main(String[] args) throws IOException
    {

        FileInputStream file=new FileInputStream("D://SadikTestExcell//Test1.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook(file);

        XSSFSheet sheet=workbook.getSheetAt(0);

        int rowCount=sheet.getLastRowNum();
        int colCount=sheet.getRow(0).getLastCellNum();

        for(int i=0;i<rowCount;i++)
        {
            XSSFRow currentRow=sheet.getRow(i);
            for(int j=0;j<colCount;j++)
            {
                String value=currentRow.getCell(j).toString();
                System.out.print("      "+value);
            }
            System.out.println();
        }





    }
}
