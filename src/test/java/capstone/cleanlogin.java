package capstone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cleanlogin {
	
	public static void main(String[] args) throws InterruptedException {

    ChromeOptions chromeoptions = new ChromeOptions();
		
	WebDriverManager.chromedriver().setup();
		
	WebDriver driver = new ChromeDriver(chromeoptions);

    driver.get("https://www.booking.com/");
        
    driver.manage().window().maximize();

    Thread.sleep(2000); 
	
	WebElement Reg = driver.findElement(By.xpath("//a[@aria-label='Sign in']//span[@class='ca2ca5203b'][normalize-space()='Sign in']"));
    
    Reg.click();
    
    Thread.sleep(2000);

    //enter email address
    
    WebElement Email = driver.findElement(By.xpath("//input[@id='username']"));
    
    Email.sendKeys("narutofanatic28@gmail.com");
    
    Thread.sleep(2000);

    // Click on continue with email
    
    WebElement con = driver.findElement(By.xpath("//button[@type='submit']"));
    
    con.click();
    
    Thread.sleep(2000);
    
    // puzzle
    
    List<WebElement> captcha = driver.findElements(By.cssSelector("div.captcha"));
    if (!captcha.isEmpty()) {
        System.out.println("CAPTCHA detected!");
    }
    System.out.println("Please solve the CAPTCHA manually...");
    
    Thread.sleep(20000);
    
    WebElement page = driver.findElement(By.xpath("//div[@class='access-container bui_font_body']"));
    
    page.click();
    
    Thread.sleep(20000);
    
    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
    
    login.click();
    
    Thread.sleep(2000);
    
//    
    WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
    
    search.click();
    
    Thread.sleep(3000);
    
   
    
 // Step 1: Click the sort/dropdown button
    WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement sortDropdown = wait6.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("button[data-testid='sorters-dropdown-trigger']"))
    );
    sortDropdown.click();

    // Step 2: Wait for and select the "Price (highest first)" option
    WebElement priceHighToLow = wait6.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("button[data-id='price_from_high_to_low']"))
    );
    priceHighToLow.click();

    WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement seeAvailability = wait7.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='StayVista at Aaranya Villa']"))
    );
    seeAvailability.click();
    
    String originalWindow = driver.getWindowHandle();
    for (String windowHandle : driver.getWindowHandles()) {
        if (!windowHandle.equals(originalWindow)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }


    // Step 2: Wait for room table
    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    
    WebElement roomTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.hprt-table")));

    // Step 3: Select first room from drop down
    
    List<WebElement> dropdowns = roomTable.findElements(By.cssSelector("select.hprt-nos-select"));
    
    Select firstDropdown = new Select(dropdowns.get(0));
    
    firstDropdown.selectByValue("1");

    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
    
    WebElement reserveButton = wait1.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-bui-component='Popover' and not(@disabled)]"))
    );
    reserveButton.click();
    
   Thread.sleep(3000);
    
   WebElement firstname = driver.findElement(By.name("firstname"));
    
   firstname.sendKeys("Alex");
    
   Thread.sleep(2000);
   
   WebElement lastname = driver.findElement(By.name("lastname"));
   
   lastname.sendKeys("Shelly");
    
   Thread.sleep(2000);
  
  
  WebElement phn = driver.findElement(By.name("phoneNumber"));
  
  phn.sendKeys("8964135787");
    
  Thread.sleep(2000);
  
  WebElement finish = driver.findElement(By.name("book"));
  
  finish.click();
    
  Thread.sleep(2000);
  
  WebElement yes = driver.findElement(By.cssSelector("[data-testid=\"double-booking-modal-confirm-button\"]"));
  
  yes.click();
    
  Thread.sleep(2000);
 
  WebElement completebook = driver.findElement(By.name("book"));
  
  completebook.click();
    
  Thread.sleep(2000);
  
}
}