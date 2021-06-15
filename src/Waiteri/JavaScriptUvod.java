package Waiteri;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUvod
{

  public static void main(String[] args) throws InterruptedException
  {
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.navigate().to("https://www.google.com/");
    
    JavascriptExecutor js = (JavascriptExecutor)driver;
    
    for (int i = 1; i < 5; i++)
    {
      js.executeScript("window.open()");
      Thread.sleep(2000);
    }
//    js.executeScript("window.open()");
//    Thread.sleep(2000);
//    js.executeScript("window.open()");
//    Thread.sleep(2000);
//    js.executeScript("window.open()");
//    Thread.sleep(2000);
//    js.executeScript("window.open()");
//    Thread.sleep(2000);
    
    driver.navigate().to("https://blog.qatestlab.com/2020/05/13/bug-busters-a-day-in-the-life-of-qa-engineer/");
    
    driver.getWindowHandles();
    ArrayList<String> lista = new ArrayList<String>(driver.getWindowHandles());
    
    for (int i = 0; i < lista.size(); i++)
    {
      System.out.println(lista.get(i));
    }
    
    driver.switchTo().window(lista.get(4));
    driver.navigate().to("https://www.google.rs/maps/@45.2458634,19.8281728,15z?hl=en");

    driver.switchTo().window(lista.get(3));
    driver.navigate().to("https://www.blic.rs/");
    
    driver.switchTo().window(lista.get(2));
    driver.navigate().to("https://promenadanovisad.rs/en/");
    
    driver.switchTo().window(lista.get(1));
    driver.navigate().to("https://www.kupujemprodajem.com/");
    
    driver.switchTo().window(lista.get(4));
    driver.close();

    driver.switchTo().window(lista.get(3));
    driver.close();
    
    driver.switchTo().window(lista.get(2));
    driver.close();
    
    driver.switchTo().window(lista.get(1));
    driver.close();
    
    driver.switchTo().window(lista.get(0));
    driver.close();
  }

}
