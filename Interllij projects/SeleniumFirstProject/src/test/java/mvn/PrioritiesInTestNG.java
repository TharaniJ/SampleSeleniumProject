package mvn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PrioritiesInTestNG {

    WebDriver webDriver;
    Logger LOGGERS = LoggerFactory.getLogger(PrioritiesInTestNG.class);

    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/EDU/Software/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Method 2: Launch Google.com
    @Test
    public void launchGoogle() {
        webDriver.get("http://www.google.co.in");
    }

    // Method 3: Perform a search using "Facebook"
    @Test
    public void peformSeachAndClick1stLink() {
        try {
        webDriver.findElement(By.name("q")).sendKeys("Facebook");
        Assert.assertTrue(false, "Purposefully failing it");
        } catch (Exception e) {
            LOGGERS.info("Error occurred: " + e.getMessage());
        }
    }

    // Method 4: Verify Google search page title.
    @Test
    public void FaceBookPageTitleVerification() {
        try {
            webDriver.findElement(By.xpath(".//*[@value='Search']")).click();
            Thread.sleep(3000);
            Assert.assertEquals(webDriver.getTitle().contains("Facebook - Google Search"), true);
        } catch (Exception e) {
            LOGGERS.info("Error occurred: " + e.getMessage());
        }
    }

    @AfterClass
    public void CloseWebDriver() {
        webDriver.close();
        webDriver.quit();
        LOGGERS.info("Close and Quit browser successfully");
    }
}
