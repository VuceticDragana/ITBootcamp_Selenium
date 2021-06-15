package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PisanjeUFajl2
{
//  zadatak 3: upisati u novi excel fajl u kolonu B brojeve 
  //od 1 do 99, sheet nazvati "jednocifreni brojevi"

  public static void main(String[] args) throws IOException
  {
    File fileZaUpis = new File("data/podaci3.xlsx");
    FileOutputStream fos = new FileOutputStream(fileZaUpis);

    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet sheet1 = wb.createSheet("Brojevi do 100");    
    
//    XSSFRow red1 = sheet1.createRow(0);    
//    XSSFCell brojevi = red1.createCell(1);
//    brojevi.setCellValue("Gornje levo polje");
    
    for (int i = 0; i < 99; i++)
    {
      XSSFRow red1 = sheet1.createRow(i);    
      XSSFCell brojevi = red1.createCell(1);
      brojevi.setCellValue(i + 1);
    }
    
    wb.write(fos);
    wb.close();
    fos.close();
    
    System.out.println("Kraj programa");

  }

}
