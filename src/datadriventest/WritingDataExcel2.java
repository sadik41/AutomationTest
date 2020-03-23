package datadriventest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataExcel2
{
    public static void main(String[] args) throws IOException
    {

        FileOutputStream file=new FileOutputStream("D://SadikTestExcell//Test4.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook();

        XSSFSheet sheet1=workbook.createSheet("dataset1");
        XSSFSheet sheet2=workbook.createSheet("dataset2");



        for (int i=0;i<=5;i++)
        {
            XSSFRow row1=sheet1.createRow(i);
            XSSFRow row2=sheet2.createRow(i);
            for(int j=0;j<3;j++)
            {
                row1.createCell(j).setCellValue("wse");
                row2.createCell(j).setCellValue("Sa");
            }
        }
        workbook.write(file);
        file.close();
        System.out.println("Written data into excel is completed");
    }
}
