package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage
{
  WebDriver driver;
  WebElement addFlyingNinja;
  WebElement flyingNinjaViewCart;
  WebElement addHappyNinja;  
  WebElement addPatientNinja;  
  WebElement searchField;
  WebElement clickSearchButton;
  
  public ShopPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getAddFlyingNinja()
  {
    return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
  }

  public WebElement getFlyingNinjaViewCart()
  {
    return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[3]"));
  }   
  
  public WebElement getSearchField()
  {
    return driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/label/input"));
  }

  public WebElement getClickSearchButton()
  {
    return driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/button/i"));
  }  

  public WebElement getAddHappyNinja()
  {
    return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/a[2]"));
  }

  public WebElement getAddPatientNinja()
  {
    return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[6]/div/a[2]"));
  }

  public void addFlyingNinja()
  {
    getAddFlyingNinja().click();
  }
  
  public void viewFlyingNinjaInCart()
  {
    getFlyingNinjaViewCart().click();
  }  
  
  public void writeInSearchField(String input)
  {
    getSearchField().sendKeys(input);
  }
  
  public void clickSearchButton()
  {
    getClickSearchButton().click();
  }
  
  public void addHappyNinja()
  {
    getAddHappyNinja().click();
  }
  
  public void addPatientNinja()
  {
    getAddPatientNinja().click();
  }
  
}
