package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTests
{
  @BeforeMethod
  public void preSvakogTesta()
  {
    driver.navigate().to(homeUrl);
    driver.manage().window().maximize();
  }

  @Test(priority = 0)
  public void addProductToCartTest()
  {
    shopPage.addFlyingNinja();
    shopPage.addHappyNinja();
    shopPage.addPatientNinja();
    shopPage.viewFlyingNinjaInCart();
    cartPage.getItemName();
    String actualText = cartPage.textFromitemName();
    String actualText2 = cartPage.textFromitem2Name();
    String actualText3 = cartPage.textFromitem3Name();
    assertEquals(actualText, "Flying Ninja");
    assertEquals(actualText2, "Happy Ninja");
    assertEquals(actualText3, "Patient Ninja");
  }

//  @Test(priority = 5)
//  public void removeProductFromCartTest()
//  {
//    addProductToCartTest();
//    cartPage.removeItemButtonClick();
//    String actualText = cartPage.textFromEmptyCartLabel();
//    assertEquals(actualText, "Your cart is currently empty.");
//  }

//  @Test(priority = 10)
//  public void addProductTCard10Times() throws InterruptedException
//  {
//    for (int i = 0; i < 10; i++)
//    {
//      shopPage.addFlyingNinja();
//      Thread.sleep(200);
//    }
//
//    shopPage.viewFlyingNinjaInCart();
//    String actualText = cartPage.numberOfItems();
//    assertEquals(actualText, "10");
//  }

  @AfterMethod
  public void posleSvakogTesta() throws InterruptedException
  {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
  }
}
