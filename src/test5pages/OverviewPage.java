package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage
{
  WebDriver driver;
  WebElement finishButon;
  
  public OverviewPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getFinishButon()
  {
    return driver.findElement(By.id("finish"));
  }
  
  public void finishButton()
  {
    getFinishButon().click();
  }
}
