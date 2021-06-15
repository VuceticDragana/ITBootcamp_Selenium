package Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DodavanjeFajlova
{

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://crop-circle.imageonline.co/#circlecropresult");
    Thread.sleep(3000);
    
    WebElement dugmeZaDodavanje = driver.findElement(By.xpath("//*[@id=\"inputImage\"]"));
    Thread.sleep(1000);
    dugmeZaDodavanje.sendKeys("C:\\Users\\GM\\Desktop\\cvet.jpg");
  }

}
