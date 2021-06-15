package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Osnove3
{

  public static void main(String[] args) throws InterruptedException
  {
System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.navigate().to("http://cms.demo.katalon.com/");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(1000);
    WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[1]/a"));
    cartButton.click();
    
    Thread.sleep(3000);
    driver.close();    
  }

}
