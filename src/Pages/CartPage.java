package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage
{
  WebDriver driver;
  WebElement itemName;
  WebElement item2Name;
  WebElement item3Name;
  WebElement removeItem;
  WebElement emptyCartLabel;
  WebElement numberOfItems;

  public CartPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getItemName()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
  }

  public WebElement getRemoveItem()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[1]/a"));
  }

  public WebElement getEmptyCartLabel()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/p"));
  }  

  public WebElement getNumberOfItems()
  {   
    return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/main/article/div/div/form/table/tbody/tr[1]/td[5]/div/input"));
  }  

  public WebElement getItem2Name()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[3]/a"));
  }

  public WebElement getItem3Name()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[3]/a"));
  }

  public String textFromitemName()
  {
    return getItemName().getText();
  }

  public void removeItemButtonClick()
  {
    this.getRemoveItem().click();
  }

  public String textFromEmptyCartLabel()
  {
    return getEmptyCartLabel().getText();
  }
  
  public String numberOfItems()
  {
    return getNumberOfItems().getAttribute("value");
  }
  
  public String textFromitem2Name()
  {
    return getItem2Name().getText();
  }
  
  public String textFromitem3Name()
  {
    return getItem3Name().getText();
  }
}
