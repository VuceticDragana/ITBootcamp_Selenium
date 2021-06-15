package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Posetite stranicu http://cms.demo.katalon.com/ i u delu za 
//pretragu uneti tekst “Flying Ninja” i kliknuti na search dugme 
//(search ikonica). Pri ucitavanju stranice maksimizovati prozor.
//Na kraju programa zatvorite stranicu

public class Vezba1
{

  public static void main(String[] args) throws InterruptedException
  {
System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
   
    driver.navigate().to("http://cms.demo.katalon.com/");
    Thread.sleep(3000);

    driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/label/input")).sendKeys("Flying Ninja");
    WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/button/i"));
    cartButton.click();
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.close();

  }

}
