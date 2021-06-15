package test5tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test5pages.CartPage;
import test5pages.CheckoutPage;
import test5pages.CompletePage;
import test5pages.MainNavigationPage;
import test5pages.OverviewPage;
import test5pages.ProductsPage;

public class BaseTests
{
  WebDriver driver;
  MainNavigationPage mainNavigation;
  ProductsPage productsPage;
  CartPage cartPage;
  CheckoutPage checkoutPage;
  OverviewPage overviewPage;
  CompletePage completePage;
  String homeUrl;
  
  @BeforeClass
  public void preSihTestova() throws IOException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    mainNavigation = new MainNavigationPage(driver);
    productsPage = new ProductsPage(driver);
    cartPage = new CartPage(driver);
    checkoutPage = new CheckoutPage(driver);
    overviewPage = new OverviewPage(driver);
    completePage = new CompletePage(driver);
    homeUrl = "https://www.saucedemo.com";
  }
  
  @AfterClass
  public void posleSihTestova() 
  {
      driver.close();
  }
}
