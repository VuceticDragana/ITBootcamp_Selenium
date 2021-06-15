package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage
{
  WebDriver driver;
  WebElement firstName;
  WebElement lastName;
  WebElement companyName;
  WebElement country;
  WebElement streetAddress;
  WebElement postcode;
  WebElement city;
  WebElement phone;
  WebElement email;
  
  public CheckoutPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getFirstName()
  {
    return driver.findElement(By.id("billing_first_name"));
  }

  public WebElement getLastName()
  {
    return driver.findElement(By.id("billing_last_name"));
  }

  public WebElement getCompanyName()
  {
    return driver.findElement(By.id("billing_company"));
  }

  public WebElement getCountry()
  {
    return driver.findElement(By.id("select2-billing_country-container"));
  }

  public WebElement getStreetAddress()
  {
    return driver.findElement(By.id("billing_address_1"));
  }

  public WebElement getPostcode()
  {
    return driver.findElement(By.id("billing_postcode"));
  }

  public WebElement getCity()
  {
    return driver.findElement(By.id("billing_city"));
  }

  public WebElement getPhone()
  {
    return driver.findElement(By.id("billing_phone"));
  }

  public WebElement getEmail()
  {
    return driver.findElement(By.id("billing_email"));
  }
  
  public void insertFirstName(String firstName)
  {
    getFirstName().clear();
    getFirstName().sendKeys(firstName);
  }
}
