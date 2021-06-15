package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DodavanjeSheeta
{

  public static void main(String[] args) throws IOException
  {
    File postojeciFile = new File("data/podaci3.xlsx");
    FileInputStream fis = new FileInputStream (postojeciFile);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    FileOutputStream fos = new FileOutputStream(postojeciFile);
    wb.createSheet("novi sheet");
    XSSFSheet noviSheet = wb.getSheet("novi sheet");
    
    XSSFRow red1 = noviSheet.createRow(0);
    XSSFCell gornjeLevoPolje = red1.createCell(0);
    
    gornjeLevoPolje.setCellValue("novo polje u novom sheetu");
    
    wb.write(fos);
    wb.close();
    fos.close();
    fis.close();
    
    System.out.println("Kraj programa");

  }

}
