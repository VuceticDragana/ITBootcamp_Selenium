package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//otici na https://www.sportvision.rs/patike/69812591-champion-johnny 
//odabrati velicinu patika i dodati u korpu i potom obrisati sve kolace i 
//proveriti dal je korpa prazna

public class Cookie2
{

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://www.sportvision.rs/patike/69812591-champion-johnny\r\n");
    Thread.sleep(3000);
    
//    WebElement sizeButton = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div[1]/div[1]/div/div[2]/div[4]/ul/li[4]"));
//    sizeButton.click();     
    
    driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[1]/div/div[2]/div[4]/ul/li[4]")).click();
    Thread.sleep(3000);
    
    WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"nb_addToCartButton\"]"));
    addToCart.click();
    Thread.sleep(3000);
    
    driver.manage().deleteAllCookies();
    Thread.sleep(2000);
    
    driver.navigate().refresh();
    Thread.sleep(2000);

  }

}
