package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.MainNavigation;
import Pages.MyAccountPage;
import Pages.SearchPage;
import Pages.ShopPage;

public class BaseTests
{
  WebDriver driver;
  MainNavigation mainNavigation;
  MyAccountPage myAccountPage;
  ShopPage shopPage;
  CartPage cartPage;
  SearchPage searchPage;
  ExcelReader citacIzExcela;
  String homeUrl;
  CheckoutPage checkoutPage;

  @BeforeClass
  public void preSihTestova() throws IOException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    mainNavigation = new MainNavigation(driver);
    myAccountPage = new MyAccountPage(driver);
    shopPage = new ShopPage(driver);
    cartPage = new CartPage(driver);
    searchPage = new SearchPage(driver);
    checkoutPage = new CheckoutPage(driver);
    citacIzExcela =  new ExcelReader("data/AutomationTestPlan.xlsx");
    homeUrl = "http://cms.demo.katalon.com/";

  }
  
  @AfterClass
  public void posleSihTestova() 
  {
      driver.close();
  }
}
