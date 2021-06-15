package Tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopTest extends BaseTests
{
  @BeforeMethod
  public void preSvakogTesta()
  {
    driver.navigate().to("http://cms.demo.katalon.com/");
    driver.manage().window().maximize();
  }

  @Test(priority = 5)
  public void searchingForHappyNinja ()
  {
    shopPage.writeInSearchField("Happy Ninja");
    shopPage.clickSearchButton();
    String actualText = searchPage.isFoundHappyNinjaLabel();
    assertEquals(actualText, "Happy Ninja");
  }
  
  @Test(priority = 10)
  public void searchForNotExistingItem ()
  {
    shopPage.writeInSearchField("asdf");
    shopPage.clickSearchButton();
    String actualText = searchPage.isFoundNothingFoundLabel();
    assertEquals(actualText, "Nothing Found");
  }

  @AfterMethod
  public void posleSvakogTesta() throws InterruptedException
  {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
  }
}
