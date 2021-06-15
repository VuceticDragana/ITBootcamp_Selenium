package Domaci2;

//Nadovezuje se na domaci koji sam dao juce tako da necete praviti novu klasu nego 
//cete samo dopuniti sta ste juce radili. Treba da promenite svaki threadsleep u wdwait, 
//da na pocetku pre klika na "Elements" otvorite 2 taba, u ta dva taba da otvorite 
//Facebook i Youtube, posle toga je potrebno zatvoriti samo Facebook tab. 
//Nakon toga se nastavlja izvrsavanje koda od juce sta sam dao.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak3
{

  public static void main(String[] args) throws InterruptedException
  {
    int x = 2000;
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.navigate().to("https://demoqa.com/");
    Thread.sleep(x);

    WebElement elements = driver.findElement(By.className("card-up"));
    elements.click();
    Thread.sleep(x);

    WebElement textBox = driver.findElement(By.id("item-0"));
    textBox.click();
    Thread.sleep(x);

    WebElement fullName = driver.findElement(By.id("userName"));
    fullName.clear();
    fullName.sendKeys("Pera Peric");
    Thread.sleep(x);

    WebElement email = driver.findElement(By.id("userEmail"));
    email.sendKeys("pera.peric@gmail.com");
    Thread.sleep(x);

    WebElement currentAddress = driver.findElement(By.id("currentAddress"));
    currentAddress.sendKeys("Novi Sad1");
    Thread.sleep(x);

    WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
    permanentAddress.sendKeys("Novi Sad2");
    Thread.sleep(x);

    WebElement submit = driver.findElement(By.id("submit"));
    submit.click();
    Thread.sleep(x);    
    
    WebElement name = driver.findElement(By.id("name"));

    if (name.getText().contains("Pera Peric"))
    {
      System.out.println("name - OK");
    }
    else
    {
      System.out.println("name - NOT OK");
    }
    
    WebElement email2 = driver.findElement(By.id("email"));

    if (email2.getText().contains("pera.peric@gmail.com"))
    {
      System.out.println("email - OK");
    }
    else
    {
      System.out.println("email - NOT OK");
    }
    
    
    WebElement currentAddress2 = driver.findElement(By.id("currentAddress"));    

    if (currentAddress2.getAttribute("value").contains("Novi Sad1"))
    {
      System.out.println("Current Address - OK");
    }
    else
    {
      System.out.println("Current Address - NOT OK");
    }        
    
    WebElement permanentAddress2 = driver.findElement(By.id("permanentAddress"));
    
    if (permanentAddress2.getAttribute("value").contains("Novi Sad2"))
    {
      System.out.println("Permanent Address - OK");
    }
    else
    {
      System.out.println("Permanent Address - NOT OK");
    }

    WebElement chechBox = driver.findElement(By.id("item-1"));
    chechBox.click();
    Thread.sleep(x);
    
    WebElement home = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label"));
    home.click(); 
    Thread.sleep(x);
    
    WebElement select = driver.findElement(By.xpath("//*[@id=\"result\"]/span[1]"));
    
        if (select.getText().equals("You have selected :"))
        {
          System.out.println("select - OK");
        }
        else
        {
          System.out.println("select - NOT OK");
        }   
        

    WebElement radioButton = driver.findElement(By.id("item-2"));
    radioButton.click();
    Thread.sleep(x);
    
    WebElement yesRadio = driver.findElement(By.className("custom-control-label"));
    yesRadio.click();    
    Thread.sleep(x);
    
    WebElement yes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p/span"));
  
      if (yes.getText().equals("Yes"))
      {
        System.out.println("yes - OK");
      }
      else
      {
        System.out.println("yes - NOT OK");
      }    

    driver.close();
  }

}
