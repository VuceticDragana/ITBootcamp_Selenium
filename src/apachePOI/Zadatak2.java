package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Zadatak2
{

  public static void main(String[] args) throws IOException
  {
    File file = new File("data/podaci.xlsx");
    FileInputStream fis = new FileInputStream (file);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    XSSFSheet sheet1 = wb.getSheet("Zadatak2");
    
    int indeksPoslednjegReda = sheet1.getLastRowNum();
    double suma = 0;
    
    System.out.println("Ulica   Broj    Grad    Drzava");
    for (int i = 1; i <= indeksPoslednjegReda; i++)
    {      
      XSSFRow redUPetlji = sheet1.getRow(i);
      
      XSSFCell ulica = redUPetlji.getCell(0);
      XSSFCell broj = redUPetlji.getCell(1);
      XSSFCell grad = redUPetlji.getCell(2);
      XSSFCell drzava = redUPetlji.getCell(3);
      
      System.out.print(ulica.getStringCellValue() + ", ");
      System.out.print(broj.getNumericCellValue() + ", ");
      System.out.print(grad.getStringCellValue() + ", ");
      System.out.println(drzava.getStringCellValue());
      
      suma = suma + broj.getNumericCellValue();
      
    }
    
    System.out.println("Suma brojeva je " + suma);
    
    fis.close();
    wb.close();

  }

}
