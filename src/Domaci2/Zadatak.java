package Domaci2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Napisati automatski test koji:
//Ocitava stranicu https://demoqa.com/ (inace stranica je namenjena za automatsko testiranje i
//odlicna je za pocetak pa mozete ako zelite proci kroz sve delove stranice)
//Klikne na "Elements"
//Klikne na "Text Box"
//Polje "Full name" ocisti pa unese vase ime - ciscenje se radi tako sto napisete ime elementa
//kako ste ga nazvali i dodate .clear() na primer za element username bi bilo username.clear();
//U polje "Email" unesite vas email
//Kliknete na "Check Box"
//Kliknete na strelicu da se spusti dropdown lista (levo od "Home" dugme)
//Selektujete samo "Desktop"
//Kliknete ponovo na "Elements" da se zatvori spisak
//Na kraju stavite sleep 5 sekundi i zatvorite program


public class Zadatak
{

  public static void main(String[] args) throws InterruptedException
  {
    int x = 3000;
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://demoqa.com/");
    Thread.sleep(x);
    
    WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div"));
    elements.click();
    Thread.sleep(x);
    
    WebElement textBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
    textBox.click();
    Thread.sleep(x);
    
    
    WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    fullName.clear();
    fullName.sendKeys("Pera Peric");
    Thread.sleep(x);

    WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    email.sendKeys("pera.peric@gmail.com");
    Thread.sleep(x);
    
    WebElement chechBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
    chechBox.click();
    Thread.sleep(x);
    
    WebElement dropdownStrelica = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
    dropdownStrelica.click();
    Thread.sleep(x);
    
    WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label"));
    desktop.click();
    Thread.sleep(x);
    
    WebElement elements2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]"));
    elements2.click();
    Thread.sleep(5000);
    
    driver.close();
  }

}
