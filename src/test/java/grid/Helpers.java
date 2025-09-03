package grid;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Helpers {

    // Thread-local RemoteWebDriver for parallel execution
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

    public static String remote_url = " http://192.168.29.222:4444"; 

    @BeforeMethod
    public void setDriver() throws MalformedURLException {

        // 1. Chrome RemoteWebDriver setup
        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options));
        driver.get().get("https://www.booking.com/");
        driver.get().manage().window().maximize();

        FirefoxOptions options1 = new FirefoxOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options1));
        driver.get().get("https://www.booking.com/");
        driver.get().manage().window().maximize();

    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void closeBrowser() {
        // Uncomment these when you're ready to close drivers after tests
        // driver.get().quit();
        // driver.remove();
    }
}