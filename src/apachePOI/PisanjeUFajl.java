package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PisanjeUFajl
{
//  zadatak 3: upisati u novi excel fajl u kolonu B brojeve 
  //od 1 do 99, sheet nazvati "jednocifreni brojevi"

  public static void main(String[] args) throws IOException
  {
    File fileZaUpis = new File("data/podaci2.xlsx");
    FileOutputStream fos = new FileOutputStream(fileZaUpis);

    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet sheet1 = wb.createSheet("Vezbanje upisa");
    
    XSSFRow red1 = sheet1.createRow(0);    
    XSSFCell gornjeLevoPlje = red1.createCell(0);
    gornjeLevoPlje.setCellValue("Gornje levo polje");
    
    wb.write(fos);
    wb.close();
    fos.close();
    
    System.out.println("Kraj programa");

  }

}
