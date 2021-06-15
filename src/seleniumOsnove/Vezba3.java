package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezba3
{

  public static void main(String[] args) throws InterruptedException
  {
    int x = 3000;
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("http://cms.demo.katalon.com/");
    Thread.sleep(x);
    
    driver.manage().window().maximize();
    Thread.sleep(x);
    
    WebElement aButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
    aButton.click();
    Thread.sleep(x);
    
    WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[1]/a"));
    cartButton.click();
    Thread.sleep(x);
    
    driver.close();
  }

}
