package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage
{
  WebDriver driver;
  WebElement lastPage;
  
  public CompletePage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getLastPage()
  {
    return driver.findElement(By.id("checkout_complete_container"));
  }
  
  public String textLastPage()
  {
    return getLastPage().getText();
  }
  
}
