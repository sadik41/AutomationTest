package automationtest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excell1
{

    public static void main(String[] args)
    {
        File src=new File("D:\\SadikTestExcell\\Test1.xlsx");

        try {
            FileInputStream fis=new FileInputStream(src);

            XSSFWorkbook wb=new XSSFWorkbook(fis);
            XSSFSheet sheet1=wb.getSheetAt(0);
            String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
            System.out.println("Data from Excellis: "+data0);

            String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
            System.out.println("Data from Excellis: "+data1);
            wb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}


