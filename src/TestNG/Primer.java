package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Primer
{
  WebDriver driver;
  
  @BeforeClass
  public void preSvihTestova()
  {
    System.out.println("***********************");
    System.out.println("Ispis pre svih testova");
    System.out.println("***********************");

    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    driver = new ChromeDriver();
  }
  
  @BeforeMethod
  public void preSvakogTesta() throws InterruptedException
  {
    System.out.println("-----------------------");
    System.out.println("Ispis pre svakog testa");
    
    driver.get("https://www.google.com/");
    Thread.sleep(3000);
  }
  
  @Test 
  public void test() throws InterruptedException
  {
    driver.findElement(By.name("q")).sendKeys("it bootcamp");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    Thread.sleep(3000);
  }

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    Thread.sleep(3000);

    driver.findElement(By.name("q")).sendKeys("it bootcamp");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    Thread.sleep(3000);

  }
}
