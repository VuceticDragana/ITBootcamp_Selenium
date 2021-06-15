package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//napisati test za log in u http://cms.demo.katalon.com/
//kredencijali customer 123456789
//test napisati koristeci test ng notacije

public class Vezba1
{
  WebDriver driver;
  WebDriverWait cekanje;

  @BeforeClass
  public void preSihTestova()
  {    
    System.out.println("============================");
    System.out.println("Ispis pre svih testova");
    System.out.println("============================");
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @BeforeMethod
  public void preSvakogTesta() throws InterruptedException
  {
    System.out.println("--------------------------------");
    System.out.println("Ispis pre svakog testa");
    driver.navigate().to("http://cms.demo.katalon.com/");    
    driver.manage().window().maximize();
    
    WebElement logIn = driver.findElement(By.id("primary-menu"));
    logIn.click();
  }

  @Test
  public void logIn() throws InterruptedException
  {      
    driver.findElement(By.id("username")).sendKeys("customer");    
    driver.findElement(By.id("password")).sendKeys("123456789");    
    WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"));
    logInButton.click();    
   
    String actualTest = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a")).getText();
    assertEquals(actualTest, "Log out");
  }
  
  @Test
  public void logInPrazan() throws InterruptedException
  {        
    driver.findElement(By.id("username")).sendKeys("");    
    driver.findElement(By.id("password")).sendKeys("");    
    WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"));
    logInButton.click();
    
    String actualTest = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();
    assertEquals(actualTest, "Error: Username is required.");
  }
  
  @Test
  public void logInPogresanUserName() throws InterruptedException
  {       
    driver.findElement(By.id("username")).sendKeys("asdf");    
    driver.findElement(By.id("password")).sendKeys("123456789");    
    WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"));
    logInButton.click();
    
    String actualTest = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();
    assertEquals(actualTest, "ERROR: Invalid username. Lost your password?");
  }
  
  @Test
  public void logInPogresanPassword() throws InterruptedException
  {       
    driver.findElement(By.id("username")).sendKeys("customer");    
    driver.findElement(By.id("password")).sendKeys("1234");    
    WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"));
    logInButton.click();
    
    String actualTest = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();
    assertEquals(actualTest, "ERROR: The password you entered for the username customer is incorrect. Lost your password?");
  }
  
  @AfterMethod
  public void posleSvakogTesta()
  {
    System.out.println("Ispis nakon svakog testa");
    System.out.println("--------------------------------");
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
  }

  @AfterClass
  public void posleSihTestova()
  {
    System.out.println("============================");
    System.out.println("Ispis posle svih testova");
    System.out.println("============================");
    driver.close();
  }

}
