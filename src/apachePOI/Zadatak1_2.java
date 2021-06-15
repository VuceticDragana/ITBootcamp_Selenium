package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Zadatak1_2
{

  public static void main(String[] args) throws IOException
  {
    File file = new File("data/podaci.xlsx");
    FileInputStream fis = new FileInputStream (file);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    XSSFSheet sheet1 = wb.getSheet("Zadatak1_2");
    
    int indeksPoslednjegReda = sheet1.getLastRowNum();
    
    for (int i = 0; i <= indeksPoslednjegReda; i++)
    {
      XSSFRow redUPetlji = sheet1.getRow(i);
      
      XSSFCell pol = redUPetlji.getCell(0);      
      
      System.out.println(pol.getStringCellValue());      

    }
    fis.close();
    wb.close();

  }

}
