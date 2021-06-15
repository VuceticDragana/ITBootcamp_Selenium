package Waiteri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vezba1
{

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    

    driver.navigate().to("https://blog.qatestlab.com/2020/05/13/bug-busters-a-day-in-the-life-of-qa-engineer/\r\n");
    Thread.sleep(3000);
    
    WebDriverWait cekanje = new WebDriverWait(driver, 20);
    WebElement addToCart = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"jivo_close_button\"]/jdiv")));
    
    addToCart.click();
    
    System.out.println("Kraj programa");

  }

}
