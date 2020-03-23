package automationtest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.ScatterChart;

import java.io.File;
import java.io.FileInputStream;

public class Excell2
{
    public static void main(String[] args) {

        File src=new File("D:\\SadikTestExcell\\Test1.xlsx");
        try {
            FileInputStream fis = new FileInputStream(src);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet1 = wb.getSheetAt(0);
            int rowcount=sheet1.getLastRowNum();
            System.out.println("Total rows is "+rowcount);
            for (int i=0;i<rowcount;i++){
                String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
                System.out.println("Test Data from Excell is: "+data0);
            }
            wb.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
