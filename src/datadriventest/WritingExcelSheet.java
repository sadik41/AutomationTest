package datadriventest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelSheet
{
    public static void main(String[] args) throws IOException
    {

        FileOutputStream file=new FileOutputStream("D://SadikTestExcell//Test2.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook();

        XSSFSheet sheet=workbook.createSheet("data");


        for (int i=0;i<=5;i++)
        {
            XSSFRow row=sheet.createRow(i);
            for(int j=0;j<3;j++)
            {
                row.createCell(j).setCellValue("wse");
            }
        }
         workbook.write(file);
        file.close();
        System.out.println("Written data into excel is completed");
    }

}
