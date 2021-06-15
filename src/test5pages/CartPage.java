package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage
{
  WebDriver driver;
  WebElement checkoutButton;
  
  public CartPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getCheckoutButton()
  {
    return driver.findElement(By.id("checkout"));
  }
  
  public void checkoutButtonClick()
  {
    getCheckoutButton().click();
  }
}
