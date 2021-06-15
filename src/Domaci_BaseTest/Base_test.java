package Domaci_BaseTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Domaci_Pages.LogInPage;
import Domaci_Pages.MainNavigationPage;
import Domaci_Pages.WelcomePage;
import Tests.ExcelReader;

public class Base_test
{
  public WebDriver driver;
  public MainNavigationPage mainNavigation;
  public LogInPage logInPage;
  public WelcomePage welcomePage;
  public ExcelReader readFromExcel;
  public String homeUrl;
  
  @BeforeClass
  public void preSihTestova() throws IOException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    mainNavigation = new MainNavigationPage(driver);
    logInPage = new LogInPage(driver);
    welcomePage = new WelcomePage(driver);
    
    readFromExcel =  new ExcelReader("data/Domaci_WordPress.xlsx");
    homeUrl = "https://wordpress.com/";
  }   
  
  @AfterClass
  public void posleSihTestova() 
  {
      driver.close();
  }
}
