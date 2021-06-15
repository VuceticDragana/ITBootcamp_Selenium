package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage
{
  WebDriver driver;
  WebElement isFoundHappyNinjaLabel;
  WebElement isFoundNothingFoundLabel;  
  
  public SearchPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getIsFoundHappyNinjaLabel()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-26\"]/header/h2/a"));
  }  
  
  public String isFoundHappyNinjaLabel()
  {    
    return getIsFoundHappyNinjaLabel().getText();
  }
  
  public WebElement getIsFoundNothingFoundLabel()
  {
    return driver.findElement(By.xpath("//*[@id=\"main\"]/section/header/h1"));
  }  
  
  public String isFoundNothingFoundLabel()
  {    
    return getIsFoundNothingFoundLabel().getText();
  }
}
