package Domaci_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigationPage
{
  WebDriver driver;
  WebElement logInTab;
  
  public MainNavigationPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getLogInTab()
  {
    return driver.findElement(By.linkText("Log In"));
  }
  
  public void logInTabClick()
  {
    getLogInTab().click();
  }
}
