package Tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTests
{
  @BeforeMethod
  public void preSvakogTesta()
  {
    driver.navigate().to(homeUrl);
    driver.manage().window().maximize();
  }

  @Test(priority = 0, groups= {"LogInTests.logInValidCredentials"})
  public void logInValidCredentials() throws InterruptedException
  {
    String username = citacIzExcela.getStringData("LogInTests", 4, 2);
    String password = citacIzExcela.getStringData("LogInTests", 5, 2);
    String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 2);
    //String password = String.valueOf(citacIzExcela.getIntegerData("LogInTests", 5, 2));
    logInFormFilling(username, password);
    String actualText = myAccountPage.textFromLogOutButton();
    assertEquals(actualText, textForAssertion);
    
//    logInFormFilling("customer", "123456789");
//    String actualText = myAccountPage.textFromLogOutButton();
//    assertEquals(actualText, "Log out");
  }

  @Test(priority = 5)
  public void logInWrongCredentials() throws InterruptedException
  {
    String username = citacIzExcela.getStringData("LogInTests", 4, 3);
    String password = citacIzExcela.getStringData("LogInTests", 5, 3);
    String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 3);
    logInFormFilling(username, password);
    String actualText = myAccountPage.textWrongUsernameLabel();
    assertEquals(actualText, textForAssertion);
  }

  @Test(priority = 10)
  public void logInEmptyCredentials() throws InterruptedException
  {
    logInFormFilling("", "");
    String actualText = myAccountPage.textWrongUsernameLabel();
    assertEquals(actualText, "Error: Username is required.");
  }

  @Test(priority = 15)
  public void logOut() throws InterruptedException
  {
    logInValidCredentials();
    myAccountPage.logOutButton();
    String actualText = myAccountPage.textFromLogInButton();
    assertEquals(actualText, "LOG IN");
  }

  public void logInFormFilling(String username, String password)
  {
    mainNavigation.myAccountTabClick();
    myAccountPage.insertUsername(username);
    myAccountPage.insertPassword(password);
    myAccountPage.rememberMeCheckBox();
    myAccountPage.logInButton();
  }

  @AfterMethod
  public void posleSvakogTesta() throws InterruptedException
  {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
  }
}
