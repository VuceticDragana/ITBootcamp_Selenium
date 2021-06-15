package Domaci_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage
{
  WebDriver driver;
  WebElement emailField;
  WebElement continueButton;
  WebElement passwordField;
  WebElement logInButton;
  WebElement wrongEmailLabel;
  WebElement wrongPasswordLabel;

  public LogInPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getEmailField()
  {    
    return driver.findElement(By.id("usernameOrEmail"));   
  }

  public WebElement getContinueButton()
  {
    return driver.findElement(By.className("is-primary"));
  }

  public WebElement getPasswordField()
  {
    return driver.findElement(By.id("password"));
  }

  public WebElement getLogInButton()
  {
    return driver.findElement(By.className("is-primary"));
  }  
  
  public WebElement getWrongEmailLabel()
  {
    return driver.findElement(By.className("form-input-validation"));
  }  

  public WebElement getWrongPasswordLabel()
  {
    return driver.findElement(By.className("form-input-validation"));
  }

  public void insertEmail(String email)
  {
    getEmailField().clear();
    getEmailField().sendKeys(email);
  }
  
  public void continueButton()
  {
    getContinueButton().click();
  }
  
  public void insertPassword(String password)
  {
    getPasswordField().clear();
    getPasswordField().sendKeys(password);
  }
  
  public void logInButton()
  {
    getLogInButton().click();
  }
  
  public String textWrongEmailLabel()
  {
    return getWrongEmailLabel().getText();
  }
  
  public String textWrongPasswordLabel()
  {
    return getWrongPasswordLabel().getText();
  }
}
