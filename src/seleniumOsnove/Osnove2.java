package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Osnove2
{

  public static void main(String[] args) throws InterruptedException
  {
System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.navigate().to("https://www.google.com/");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(1000);
    
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("it bootcamp");;
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
    
    driver.findElement(By.name("q")).sendKeys("it bootcamp");
    Thread.sleep(3000);
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
    Thread.sleep(1000);
    driver.close();
  }

}
