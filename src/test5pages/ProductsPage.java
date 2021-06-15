package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage
{
  WebDriver driver;
  WebElement addToCartButton;
  WebElement cartButton;
  WebElement products;
  
  public ProductsPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getAddToCartButton()
  {
    return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
  }

  public WebElement getCartButton()
  {
    return driver.findElement(By.id("shopping_cart_container"));
  }  
  
  public WebElement getProducts()
  {
    return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
  }

  public void addToCart()
  {
    getAddToCartButton().click();
  }
  
  public void cartButtonClick()
  {
    getCartButton().click();
  }
  
  public String textProducts()
  {
    return getProducts().getText();
  }
  
}
