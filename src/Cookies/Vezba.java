package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Napisati program koji:
//●     Ucitava stranicu http://cms.demo.katalon.com/my-account/
//●     Postavlja kolacic za ulogovanog usera         
//●     Refresuje stranicu
//●     Proverava da li je korisnik ulogovan

public class Vezba
{

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("http://cms.demo.katalon.com/my-account/");
    Thread.sleep(3000);
    
    Cookie c = new Cookie("wordpress_logged_in_4d8a854e0c8bd1c7f0585d2f4b3ad575", "customer%7C1622380763%7CKtda6hRIxzNNNRhpTcgl2oHF5ePWWLeiX8CFj5SgJma%7C318ce5dc409f5b60e1d6d5cd1096a23bd3ef52e49456c82dc6f4bb437594a32f");
    driver.manage().addCookie(c);  
    Thread.sleep(2000);
    
    driver.navigate().refresh();
    Thread.sleep(2000);
    
    driver.close();

  }

}
