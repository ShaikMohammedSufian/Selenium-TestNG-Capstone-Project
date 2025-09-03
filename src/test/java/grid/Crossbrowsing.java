package grid;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crossbrowsing extends Helpers {
		
        @Test
		public void book()throws InterruptedException {
        	
        	Thread.sleep(2000);
	        
	        WebElement hotel = getDriver().findElement(By.xpath("//input[@id=':rh:']"));
	        
	        hotel.sendKeys("Hyderabad, India");
	        
	        WebElement hotel1 = getDriver().findElement(By.cssSelector("li[id='autocomplete-result-0'] div[class='b08850ce41 d704c15739']"));
	        
	        hotel1.click();
	        
	        Thread.sleep(2000);
	        
            WebElement checkin = getDriver().findElement(By.xpath("//span[@aria-label='We 10 September 2025']"));
	        
            checkin.click();
            
            Thread.sleep(3000);
            
            WebElement checkout = getDriver().findElement(By.xpath("//span[@aria-label='Sa 13 September 2025']"));
	        
            checkout.click();
            
            Thread.sleep(3000);
          
            WebElement clck = getDriver().findElement(By.cssSelector(".c497ee9802.c4046e13b1"));
	        
            clck.click();
            
            Thread.sleep(3000);
            
            WebElement guests = getDriver().findElement(By.cssSelector("span[class='fc70cba028 d62168fff1 c2a70a5db2 bc7d708ceb'] svg"));
	        
            guests.click();
            
            Thread.sleep(3000);
            
            WebElement guest1 = getDriver().findElement(By.xpath("//label[normalize-space()='Adults']"));
	        
            guest1.click();
            
            Thread.sleep(3000);
            
            WebElement room = getDriver().findElement(By.xpath("(//button[@type='button'])[7]"));
	        
            room.click();
            
            Thread.sleep(3000);
            
            WebElement done = getDriver().findElement(By.cssSelector("button[class='de576f5064 b46cd7aad7 d0a01e3d83 c7a901b0e7 e4f9ca4b0c bbf83acb81 d1babacfe0 a9d40b8d51']"));
	        
            done.click();
            
            Thread.sleep(3000);
            
            WebElement search = getDriver().findElement(By.xpath("//button[@type='submit']"));
	        
            search.click();
            
            Thread.sleep(3000);
            
            //WebElement filter = driver.findElement(By.cssSelector("label[for=':r1f:'] span[class='fc70cba028 f823b234fe ca6ff50764'] svg"));
	        
            //filter.click();
            
            //Thread.sleep(3000);
            
            WebElement sort = getDriver().findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1) > svg:nth-child(1)"));
            sort.click();
            
            Thread.sleep(2000);
            
            WebElement sortbyprice = getDriver().findElement(By.xpath("//span[normalize-space()='Price (highest first)']"));
            
            sortbyprice.click();
            
            Thread.sleep(2000);
            
            List<WebElement> seeAvailabilityLinks = getDriver().findElements(By.xpath("//div[normalize-space()='StayVista at Aaranya Villa']"));
            if (!seeAvailabilityLinks.isEmpty()) {
                seeAvailabilityLinks.get(0).click();
           
            }
            
           // Step 1: Switch to new tab
            String originalWindow = getDriver().getWindowHandle();
            for (String handle : getDriver().getWindowHandles()) {
                if (!handle.equals(originalWindow)) {
                	getDriver().switchTo().window(handle);
                    break;
                }
            }

            // Step 2: Wait for room table
            
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
            
            WebElement roomTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.hprt-table")));

            // Step 3: Select first room from drop down
            
            List<WebElement> dropdowns = roomTable.findElements(By.cssSelector("select.hprt-nos-select"));
            
            Select firstDropdown = new Select(dropdowns.get(0));
            
            firstDropdown.selectByValue("1");

            WebDriverWait wait1 = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
            
            WebElement reserveButton = wait1.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-bui-component='Popover' and not(@disabled)]"))
            );
            reserveButton.click();
            
           Thread.sleep(3000);
            
           WebElement firstname = getDriver().findElement(By.name("firstname"));
            
           firstname.sendKeys("smith");
            
           Thread.sleep(2000);
           
           WebElement lastname = getDriver().findElement(By.name("lastname"));
           
           lastname.sendKeys("gold");
            
           Thread.sleep(2000);
           
          WebElement email = getDriver().findElement(By.name("email"));
           
          email.sendKeys("smithgold@gmail.com");
            
          Thread.sleep(2000);
          
          WebElement phn = getDriver().findElement(By.name("phoneNumber"));
          
          phn.sendKeys("8457864787");
            
          Thread.sleep(2000);
          
          WebElement finish = getDriver().findElement(By.name("book"));
          
          finish.click();
            
          Thread.sleep(2000);
          
          WebElement yes = getDriver().findElement(By.cssSelector("[data-testid=\"double-booking-modal-confirm-button\"]"));
          
          yes.click();
            
          Thread.sleep(2000);
         
          WebElement completebook = getDriver().findElement(By.name("book"));
          
          completebook.click();
            
          Thread.sleep(2000);
          
	    }
}