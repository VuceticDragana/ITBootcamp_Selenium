package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CitanjeIzFajla
{
  public static void main(String[] args) throws IOException
  {
    File file = new File("data/podaci.xlsx");
    FileInputStream fis = new FileInputStream (file);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    XSSFSheet sheet1 = wb.getSheet("Zadatak1");
    
    int indeksPoslednjegReda = sheet1.getLastRowNum();
    
    //System.out.println(indeksPoslednjegReda);
//    XSSFRow treciRed = sheet1.getRow(2);
//    XSSFCell treciRedPrvaCelija = treciRed.getCell(0);
    
    //System.out.println(treciRedPrvaCelija);
    
    for (int i = 1; i <= indeksPoslednjegReda; i++)
    {
      XSSFRow redUPetlji = sheet1.getRow(i);
      
      XSSFCell ime = redUPetlji.getCell(0);
      XSSFCell prezime = redUPetlji.getCell(1);
      XSSFCell email = redUPetlji.getCell(2);
      
      System.out.print(ime.getStringCellValue() + ", ");
      System.out.print(prezime.getStringCellValue() + ", ");
      System.out.println(email.getStringCellValue());

    }
    fis.close();
    wb.close();
  }

}
