package seleniumOsnove;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Osnove1
{

  public static void main(String[] args) throws InterruptedException
  {    
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.navigate().to("https://www.google.com/");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.navigate().to("https://itbootcamp.rs/");
    Thread.sleep(2000);
    driver.navigate().back();
  }

}
