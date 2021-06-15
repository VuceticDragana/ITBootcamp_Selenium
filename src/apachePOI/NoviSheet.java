package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NoviSheet
{

  public static void main(String[] args) throws IOException
  {
    File postojeciFile = new File("data/podaci3.xlsx");
    FileInputStream fis = new FileInputStream (postojeciFile);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    FileOutputStream fos = new FileOutputStream(postojeciFile);
    wb.createSheet("od 100 do 1000");
    XSSFSheet noviSheet = wb.getSheet("od 100 do 1000");
    
    for (int i = 0; i <= 900; i++)
    {
      XSSFRow red1 = noviSheet.createRow(i);
      XSSFCell celija = red1.createCell(0);
      celija.setCellValue(i + 100);
    }

    wb.write(fos);
    wb.close();
    fos.close();
    fis.close();
    
    System.out.println("Kraj programa");
  }

}
