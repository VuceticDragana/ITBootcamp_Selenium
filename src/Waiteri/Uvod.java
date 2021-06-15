package Waiteri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Idite na sajt promenade https://promenadanovisad.rs/en/
//Obrisite kolace
//Kliknite refresh
//Sacekajte dok se ne pojavi pop-up
//Na pop-upu kliknite x(close) dugme

public class Uvod
{

  public static void main(String[] args) throws InterruptedException
  {
    int x = 1000;
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.navigate().to("https://promenadanovisad.rs/en/");
    Thread.sleep(x);

    driver.manage().deleteAllCookies();
    Thread.sleep(x);

    driver.navigate().refresh();
    //Thread.sleep(10000);
    
    WebDriverWait cekanje = new WebDriverWait(driver, 10);
    WebElement addToCart = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page\"]/div/footer/div[2]/div[2]/span")));

//    WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"page\"]/div/footer/div[2]/div[2]/span"));
    addToCart.click();
    Thread.sleep(x);
    
    System.out.println("Kraj programa");

  }

}
