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

public class LoginAutomate {
	
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
    
//    WebElement hotel = driver.findElement(By.xpath("//input[@id=':rh:']"));
//    
//    hotel.sendKeys("Hyderabad, India");
    
//    WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
//    WebElement hotel = wait5.until(ExpectedConditions.visibilityOfElementLocated(
//        By.xpath("//input[@placeholder='Where are you going?']")
//    ));
//    hotel.sendKeys("Hyderabad, India");
    
   // WebElement hotel1 = driver.findElement(By.cssSelector("li[id='autocomplete-result-0'] div[class='b08850ce41 d704c15739']"));
    //hotel1.click();
   
//    
//    Thread.sleep(2000);
//    
//    WebElement checkin = driver.findElement(By.xpath("//span[@aria-label='We 10 September 2025']"));
//    
//    checkin.click();
//    
//    Thread.sleep(3000);
//    
//    WebElement checkout = driver.findElement(By.xpath("//span[@aria-label='Sa 13 September 2025']"));
//    
//    checkout.click();
//    
//    Thread.sleep(3000);
//  
//    WebElement clck = driver.findElement(By.cssSelector(".c497ee9802.c4046e13b1"));
//    
//    clck.click();
//    
//    Thread.sleep(3000);
//    
//    WebElement guests = driver.findElement(By.cssSelector("span[class='fc70cba028 d62168fff1 c2a70a5db2 bc7d708ceb'] svg"));
//    
//    guests.click();
//    
//    Thread.sleep(3000);
//    
//    WebElement guest1 = driver.findElement(By.xpath("//label[normalize-space()='Adults']"));
//    
//    guest1.click();
//    
//    Thread.sleep(3000);
//    
//    WebElement room = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
//    
//    room.click();
//    
//    Thread.sleep(3000);
//    
//    WebElement done = driver.findElement(By.cssSelector("button[class='de576f5064 b46cd7aad7 d0a01e3d83 c7a901b0e7 e4f9ca4b0c bbf83acb81 d1babacfe0 a9d40b8d51']"));
//    
//    done.click();
//    
//    Thread.sleep(3000);
//    
    WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
    
    search.click();
    
    Thread.sleep(3000);
    
    //WebElement filter = driver.findElement(By.cssSelector("label[for=':r1f:'] span[class='fc70cba028 f823b234fe ca6ff50764'] svg"));
    
    //filter.click();
    
    //Thread.sleep(3000);
    
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

//    
//    WebElement sort = driver.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1) > svg:nth-child(1)"));
//    sort.click();
//    
//    Thread.sleep(2000);
//    
//    WebElement sortbyprice = driver.findElement(By.xpath("//span[normalize-space()='Price (highest first)']"));
//    
//    sortbyprice.click();
//    
//    Thread.sleep(2000);
    
//    List<WebElement> seeAvailabilityLinks = driver.findElements(By.xpath("//div[normalize-space()='StayVista at Aaranya Villa']"));
//    if (!seeAvailabilityLinks.isEmpty()) {
//        seeAvailabilityLinks.get(0).click();
//   
//    }
 

//   // Step 1: Switch to new tab
//    String originalWindow = driver.getWindowHandle();
//    for (String handle : driver.getWindowHandles()) {
//        if (!handle.equals(originalWindow)) {
//            driver.switchTo().window(handle);
//            break;
//        }
//    }
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
    
   firstname.sendKeys("smith");
    
   Thread.sleep(2000);
   
   WebElement lastname = driver.findElement(By.name("lastname"));
   
   lastname.sendKeys("gold");
    
   Thread.sleep(2000);
   
   //WebElement email = driver.findElement(By.name("email"));
//   
//  //email.sendKeys("smithgold@gmail.com");
//    
//  //Thread.sleep(2000);
  
  WebElement phn = driver.findElement(By.name("phoneNumber"));
  
  phn.sendKeys("8457864787");
    
  Thread.sleep(2000);
  
  WebElement finish = driver.findElement(By.name("book"));
  
  finish.click();
    
  Thread.sleep(2000);
  
  //WebElement yes = driver.findElement(By.cssSelector("[data-testid=\"double-booking-modal-confirm-button\"]"));
  
  //yes.click();
    
  //Thread.sleep(2000);
 
  WebElement completebook = driver.findElement(By.name("book"));
  
  completebook.click();
    
  Thread.sleep(2000);
  
}
}