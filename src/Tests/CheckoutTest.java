package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class CheckoutTest extends BaseTests
{  
  @BeforeMethod
  public void preSvakogTesta()
  {
    driver.navigate().to(homeUrl);
    //driver.manage().window().maximize();
  }
  
//  @Test(priority = 0)
//  public void checkoutWhenLogOutTest() throws InterruptedException
//  {
//    shopPage.addFlyingNinja();
//    Thread.sleep(1000);
//    mainNavigation.checkoutTabClick();
//    checkoutPage.insertFirstName("katalon");
//  }
  
  @Test(priority = 5, dependsOnGroups = {"LogInTests.logInValidCredentials"})
  public void checkoutWhenLogInTest() throws InterruptedException
  {
    //.logInValidCredentials();
    shopPage.addFlyingNinja();
    Thread.sleep(1000);
    mainNavigation.checkoutTabClick();
    //checkoutPage.insertFirstName("katalon");
  }
  
  @AfterMethod
  public void posleSvakogTesta() throws InterruptedException
  {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
  }
}
