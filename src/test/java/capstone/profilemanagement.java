package capstone;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class profilemanagement {
	
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
    
    WebElement profile = driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[2]/div/div/header/div/nav[1]/div[2]/div/span/button/span/div/div[2]/div[1]"));
    
    profile.click();
    
    Thread.sleep(2000);
    
    WebElement Bookingtrips = driver.findElement(By.cssSelector("#\\:rf\\: > div > div > ul > li:nth-child(4) > a > div > div > div"));
    
    Bookingtrips.click();
    
    Thread.sleep(2000);
    
//    WebElement past = driver.findElement(By.cssSelector("#mytrips-mfe > div.f6e3a11b0d.a19a26a18c.d38ad692ea.e95943ce9b.dceb352308.cc39684d69.aec8a642f4.f7aa4721a5 > div:nth-child(2) > a > div > div.c3bdfd4ac2 > div > div.aa225776f2.ca9d921c46 > h3 > div.b87c397a13.f546354b44.cc045b173b"));
//    
//    past.click();
//    
//    Thread.sleep(2000);
//    
WebElement profile1 = driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[2]/div/div/header/div/nav[1]/div[2]/div/span/button/span/div/div[2]/div[1]"));
    
    profile1.click();
    
    Thread.sleep(2000);
	}
}