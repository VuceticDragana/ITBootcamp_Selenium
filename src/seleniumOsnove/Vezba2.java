package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Napisati program koji:
//●     Ucitava stranicu http://cms.demo.katalon.com/
//●     Maksimizuje stranicu
//●     Odlazi na stranicu za login tako sto klikne na My Account link iz navigacije
//●     Popunjava username i password (customer/123456789)
//●     Loguje se na stranicu pristiskom na Login dugme
//●     Odjavljuje se sa stranice klikom na link Logout
//●     Na kraju programa zatvorite stranicu.

public class Vezba2
{

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("http://cms.demo.katalon.com/");
    Thread.sleep(3000);
    
    driver.manage().window().maximize();
    Thread.sleep(1000);
    
    // WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
    WebElement cartButton = driver.findElement(By.id("primary-menu"));
    cartButton.click();
    Thread.sleep(3000);
    
    driver.findElement(By.id("username")).sendKeys("customer");
    Thread.sleep(2000);
    driver.findElement(By.id("password")).sendKeys("123456789");
    Thread.sleep(2000);
    
    WebElement rememberButton = driver.findElement(By.id("rememberme"));
    rememberButton.click();
    Thread.sleep(3000);
    
    WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"));
    logInButton.click();
    Thread.sleep(3000);
    
    driver.manage().deleteCookieNamed("wordpress_logged_in_4d8a854e0c8bd1c7f0585d2f4b3a");
    Thread.sleep(2000);
    driver.navigate().refresh();
    Thread.sleep(2000);
    
//    WebElement logOutButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/nav/ul/li[6]/a"));
//    logOutButton.click();
//    Thread.sleep(3000);    
    
    driver.close();

    
  }

}
