package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation
{
  WebDriver driver;
  WebElement myAccountTab;
  WebElement CartTab;
  WebElement CheckoutTab;
  
  public MainNavigation(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getMyAccountTab()
  {
    return driver.findElement(By.linkText("MY ACCOUNT"));
  }
  
  public WebElement getCartTab()
  {
    return driver.findElement(By.linkText("CART"));
  }  
  
  public WebElement getCheckoutTab()
  {
    return driver.findElement(By.linkText("CHECKOUT"));
  }

  public void myAccountTabClick()
  {
    getMyAccountTab().click();
  }
  
  public void CartTabClick()
  {
    getCartTab().click();
  }
  
  public void checkoutTabClick()
  {
    getCheckoutTab().click();
  }
}
