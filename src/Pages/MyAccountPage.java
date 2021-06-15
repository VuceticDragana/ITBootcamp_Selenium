package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage
{
  WebDriver driver;
  WebElement usernameInputField;
  WebElement passwordInputField;
  WebElement rememberMeCheckBox;
  WebElement logInButton;
  WebElement logOutButton;
  WebElement wrongUsernameLabel;
  WebElement emptyUsernameLabel;

  public MyAccountPage(WebDriver driver)
  {
    super();
    this.driver = driver;
  }

  public WebElement getUsernameInputField()
  {
    return driver.findElement(By.id("username"));
  }

  public WebElement getPasswordInputField()
  {
    return driver.findElement(By.id("password"));
  }

  public WebElement getRememberMeCheckBox()
  {
    return driver.findElement(By.id("rememberme"));
  }

  public WebElement getLogInButton()
  {
    return driver.findElement((By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")));
  }

  public WebElement getLogOutButton()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
  }

  public WebElement getWrongUsernameLabel()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li"));
  }

  public WebElement getEmptyUsernameLabel()
  {
    return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li"));
  }

  public void insertUsername(String username)
  {
    getUsernameInputField().clear();
    getUsernameInputField().sendKeys(username);
  }

  public void insertPassword(String password)
  {
    getPasswordInputField().clear();
    getPasswordInputField().sendKeys(password);
  }

  public void rememberMeCheckBox()
  {
    getRememberMeCheckBox().click();
  }

  public void logInButton()
  {
    getLogInButton().click();
  }
  
  public void logOutButton()
  {
    getLogOutButton().click();
  }

  public String textFromLogOutButton()
  {
    return getLogOutButton().getText();
  }

  public String textWrongUsernameLabel()
  {
    return this.getWrongUsernameLabel().getText();
  }

  public String textEmptyUsernameLabel()
  {
    return this.getEmptyUsernameLabel().getText();
  }

  public String textFromLogInButton()
  {
    return this.getLogInButton().getText();
  }
}
