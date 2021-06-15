package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage
{
  WebDriver driver;
  WebElement firstName;
  WebElement lastName;
  WebElement postalCode;
  WebElement continueButton;
  
  public CheckoutPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getFirstName()
  {
    return driver.findElement(By.id("first-name"));
  }

  public WebElement getLastName()
  {
    return driver.findElement(By.id("last-name"));
  }

  public WebElement getPostalCode()
  {
    return driver.findElement(By.id("postal-code"));
  }

  public WebElement getContinueButton()
  {
    return driver.findElement(By.id("continue"));
  }
  
  public void insertFirstName(String fn)
  {
    getFirstName().clear();
    getFirstName().sendKeys(fn);
  }
  
  public void insertLastName(String ln)
  {
    getLastName().clear();
    getLastName().sendKeys(ln);
  }
  
  public void insertPostalCode(String pc)
  {
    getPostalCode().clear();
    getPostalCode().sendKeys(pc);
  }
  
  public void continueButton()
  {
    getContinueButton().click();
  }
}
