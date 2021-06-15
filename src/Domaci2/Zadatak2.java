package Domaci2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Otici na ovaj URL - https://demoqa.com/
//Kliknuti na dugme Elements sa leve strane
//Kliknuti na Text Box sa leve strane
//Popuniti sva 4 polja, kliknuti na Submit i proveriti da li se resenje pojavilo ispod (ko zeli tezu varijatnu
//neka proveri da li je dobar ispis u smislu da li se ispisalo ime koje se unelo)
//Kliknuti na Check Box sa leve strane, cekirati Home i proveriti da li se izvrsilo cekiranje
//Kliknuti na Radio Button sa leve strane, kliknuti na Yes i proveriti da li se izvrsilo biranje radio buttona
//Kada kazem proveriti mislim da koristite if funkciju i da se ispise neki print

//Nadovezuje se na domaci koji sam dao juce tako da necete praviti novu klasu nego 
//cete samo dopuniti sta ste juce radili. Treba da promenite svaki threadsleep u wdwait, 
//da na pocetku pre klika na "Elements" otvorite 2 taba, u ta dva taba da otvorite 
//Facebook i Youtube, posle toga je potrebno zatvoriti samo Facebook tab. 
//Nakon toga se nastavlja izvrsavanje koda od juce sta sam dao.

public class Zadatak2
{

  public static void main(String[] args) throws InterruptedException
  {    
    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    WebDriverWait wait = new WebDriverWait(driver, 5);

    driver.navigate().to("https://demoqa.com/");

    JavascriptExecutor js = (JavascriptExecutor) driver;

    for (int i = 1; i < 3; i++)
    {
      js.executeScript("window.open()");
      Thread.sleep(2000);
    }
    
    driver.getWindowHandles();
    ArrayList<String> lista = new ArrayList<String>(driver.getWindowHandles());
    
    for (int i = 0; i < lista.size(); i++)
    {
      System.out.println(lista.get(i));
    }
    
    driver.switchTo().window(lista.get(2));
    driver.navigate().to("https://www.facebook.com/");
    
    driver.switchTo().window(lista.get(1));
    driver.navigate().to("https://www.youtube.com/");
    
    driver.switchTo().window(lista.get(2));
    driver.close();
    
    driver.switchTo().window(lista.get(0));

    WebElement elements = driver.findElement(By.className("card-up"));
    elements = wait.until(ExpectedConditions.visibilityOf(elements));
    elements.click();

    WebElement textBox = driver.findElement(By.id("item-0"));
    textBox = wait.until(ExpectedConditions.visibilityOf(textBox));
    textBox.click();

    WebElement fullName = driver.findElement(By.id("userName"));
    fullName = wait.until(ExpectedConditions.visibilityOf(fullName));
    fullName.clear();
    fullName.sendKeys("Pera Peric");

    WebElement email = driver.findElement(By.id("userEmail"));
    email = wait.until(ExpectedConditions.visibilityOf(email));
    email.sendKeys("pera.peric@gmail.com");

    WebElement currentAddress = driver.findElement(By.id("currentAddress"));
    currentAddress = wait.until(ExpectedConditions.visibilityOf(currentAddress));
    currentAddress.sendKeys("Novi Sad1");

    WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
    permanentAddress = wait.until(ExpectedConditions.visibilityOf(permanentAddress));
    permanentAddress.sendKeys("Novi Sad2");

    WebElement submit = driver.findElement(By.id("submit"));
    submit = wait.until(ExpectedConditions.visibilityOf(submit));
    submit.click();

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
    chechBox = wait.until(ExpectedConditions.visibilityOf(chechBox));
    chechBox.click();

    WebElement home = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label"));
    home = wait.until(ExpectedConditions.visibilityOf(home));
    home.click();

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
    radioButton = wait.until(ExpectedConditions.visibilityOf(radioButton));
    radioButton.click();

    WebElement yesRadio = driver.findElement(By.className("custom-control-label"));
    yesRadio = wait.until(ExpectedConditions.visibilityOf(yesRadio));
    yesRadio.click();

    WebElement yes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p/span"));

    if (yes.getText().equals("Yes"))
    {
      System.out.println("yes - OK");
    }
    else
    {
      System.out.println("yes - NOT OK");
    }    
    
    driver.quit();
    

  }

}
