package test5tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests
{
  @BeforeMethod
  public void preSvakogTesta()
  {
    driver.navigate().to(homeUrl);
    driver.manage().window().maximize();
  }

  @Test()
  public void logInTest()
  {
    logInFormFilling("standard_user", "standard_user");
    
    String actualText = productsPage.textProducts();
    assertEquals(actualText, "PRODUCTS");
  }

  @Test()
  public void orderingTest() throws InterruptedException
  {
    logInFormFilling("standard_user", "standard_user");
    
    productsPage.addToCart();    
    productsPage.cartButtonClick();
    
    cartPage.checkoutButtonClick();
    
    checkoutPage.insertFirstName("Pera");
    checkoutPage.insertLastName("Peric");
    checkoutPage.insertPostalCode("21000");
    
    checkoutPage.continueButton();
    
    overviewPage.finishButton();    

    String actualText = completePage.textLastPage();
    assertEquals(actualText.contains("THANK YOU FOR YOUR ORDER"), true);

  }
  
  public void logInFormFilling(String username, String password)
  {
    mainNavigation.insertUsername("standard_user");
    mainNavigation.insertPassword("secret_sauce");
    mainNavigation.logInButton();
  }

  @AfterMethod
  public void posleSvakogTesta() throws InterruptedException
  {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
  }
}
