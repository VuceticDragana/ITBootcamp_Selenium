package Domaci_Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Domaci_BaseTest.Base_test;

public class LogInTest extends Base_test
{
  @BeforeMethod
  public void preSvakogTesta()
  {
    driver.navigate().to(homeUrl);
    driver.manage().window().maximize();
  }

  @Test(priority = 0)
  public void logInValidCredentials() throws InterruptedException
  {
    String email = readFromExcel.getStringData("LogInTests", 4, 2);
    String password = readFromExcel.getStringData("LogInTests", 6, 2);
    String textForAssertion = readFromExcel.getStringData("LogInTests", 9, 2);
    logInFormFilling(email, password);

    WebDriverWait cekanje = new WebDriverWait(driver, 10);
    logInPage.logInButton();
    cekanje.until(ExpectedConditions.urlContains("/read"));    

    String actualTest = driver.getCurrentUrl();
    assertEquals(actualTest, textForAssertion);
  }
  
  @Test(priority = 5)
  public void logInInvalidEmailValidPassword() throws InterruptedException
  {
    String email = readFromExcel.getStringData("LogInTests", 4, 3);
    String password = readFromExcel.getStringData("LogInTests", 6, 3);
    String textForAssertion = readFromExcel.getStringData("LogInTests", 9, 3);    
    logInFormFilling(email, password);
    logInPage.logInButton();
    String actualTest = logInPage.textWrongEmailLabel();    
    assertEquals(actualTest, textForAssertion);
  }
  
  @Test(priority = 10)
  public void logInValidEmailInvalidPassword() throws InterruptedException
  {
    String email = readFromExcel.getStringData("LogInTests", 4, 4);
    String password = readFromExcel.getStringData("LogInTests", 6, 4);
    String textForAssertion = readFromExcel.getStringData("LogInTests", 9, 4);    
    logInFormFilling(email, password);
    logInPage.logInButton();
    String actualTest = logInPage.textWrongPasswordLabel();    
    assertEquals(actualTest, textForAssertion);
  }
  
  @Test(priority = 15)
  public void logInInvalidEmailInalidPassword() throws InterruptedException
  {
    String email = readFromExcel.getStringData("LogInTests", 4, 5);
    String password = readFromExcel.getStringData("LogInTests", 6, 5);
    String textForAssertion = readFromExcel.getStringData("LogInTests", 9, 5);    
    logInFormFilling(email, password);
    logInPage.logInButton();
    String actualTest = logInPage.textWrongEmailLabel();    
    assertEquals(actualTest, textForAssertion);
  }

  public void logInFormFilling(String email, String password) throws InterruptedException
  {    
    mainNavigation.logInTabClick();    
    logInPage.insertEmail(email);    
    logInPage.continueButton();
    Thread.sleep(1000);
    
    if(logInPage.getEmailField().isEnabled() == false)
    {      
      logInPage.insertPassword(password);
    }    
  }

  @AfterMethod
  public void posleSvakogTesta() throws InterruptedException
  {
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
  }
}
