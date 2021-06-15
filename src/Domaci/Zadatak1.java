package Domaci;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Napravite excel fajl gde cete u jednom sheetu napraviti kolone 
//Valid username, Valid password, Invalid username i Invalid password 
//(dodajte koliko zelite celija za ove kolone ali sve kolone moraju imati 
//isti broj celija). Zatim iz tog fajla napravite onoliko petlji koliko ima 
//kombinacija za unos i naravno u petlji stampajte podatke iz celija.
//Na primer: Petlja 1 - Valid username, valid password
//Petlja 2 - Invalid username, valid password

public class Zadatak1
{

  public static void main(String[] args) throws IOException
  {
    File file = new File("src/Domaci/Zadatak1.xlsx");
    FileInputStream fis = new FileInputStream (file);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    XSSFSheet sheet1 = wb.getSheet("Sheet1");    
    
    stampaUsernameIPassword(sheet1, 0, 1, "Petlja 1 - Valid username, valid password");
    stampaUsernameIPassword(sheet1, 2, 1, "Petlja 2 - Invalid username, valid password");
    stampaUsernameIPassword(sheet1, 0, 3, "Petlja 3 - Valid username, invalid password");
    stampaUsernameIPassword(sheet1, 2, 3, "Petlja 4 - Invalid username, invalid password");
    
    fis.close();
    wb.close();
  }

  public static void stampaUsernameIPassword(XSSFSheet sheet1, int username, int password, String text)
  {
    int indeksPoslednjegReda = sheet1.getLastRowNum();
    
    System.out.println(text);
    
    for (int i = 1; i <= indeksPoslednjegReda; i++)
    {
      XSSFRow redUPetlji = sheet1.getRow(i);
      
      XSSFCell validUsername = redUPetlji.getCell(username);
      XSSFCell validPassword = redUPetlji.getCell(password);      
      
      System.out.print(validUsername.getStringCellValue() + ", ");
      System.out.println(validPassword.getStringCellValue());
    }
    
    System.out.println("-------------------------------------");
  }
}
