package Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezba3
{

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://imgflip.com/memegenerator");
    Thread.sleep(3000);
    
    WebElement asdf = driver.findElement(By.id("mm-show-upload"));
    //WebElement asdf = driver.findElement(By.xpath("//*[@id=\"mm-show-upload\"]"));
    asdf.click();
    Thread.sleep(2000);
    //WebElement dugmeZaDodavanje = driver.findElement(By.xpath("//*[@id=\"mm-upload-file\"]"));
    WebElement dugmeZaDodavanje = driver.findElement(By.xpath("//*[@id=\"mm-upload-file-btn\"]"));
    dugmeZaDodavanje.click();//*[@id="mm-upload-file-btn"]
    //Thread.sleep(2000);
    
    
  //  dugmeZaDodavanje.sendKeys("C:\\Users\\GM\\Desktop\\5cwx89t4-1389586191.png");
  //  Thread.sleep(1000);
  }

}
