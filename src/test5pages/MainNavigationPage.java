package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigationPage
{
  WebDriver driver;
  WebElement username;
  WebElement password;
  WebElement logInButton;
  
  public MainNavigationPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getUsername()
  {
    return driver.findElement(By.id("user-name"));
  }

  public WebElement getPassword()
  {
    return driver.findElement(By.id("password"));
  }

  public WebElement getLogInButton()
  {
    return driver.findElement(By.id("login-button"));
  }
  
  public void insertUsername(String username)
  {
    getUsername().clear();
    getUsername().sendKeys(username);
  }
  
  public void insertPassword(String password)
  {
    getPassword().clear();
    getPassword().sendKeys(password);
  }
  
  public void logInButton()
  {
    getLogInButton().click();
  }
}
