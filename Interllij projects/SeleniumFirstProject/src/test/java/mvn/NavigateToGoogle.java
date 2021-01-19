package mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class NavigateToGoogle {
    Logger LOGGERS = LoggerFactory.getLogger(NavigateToGoogle.class);
    WebDriver webDriver;


    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver","C:/Tharani/Chrome Driver/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void SearchGoogle() {
        try {

            webDriver.get("https://www.google.com/");
            webDriver.manage().window().maximize();
            LOGGERS.info("Navigate to Google");
            // Find the search box
            WebElement searchTextbox = webDriver.findElement(By.name("q"));
            searchTextbox.sendKeys("Sri Lanka");
            LOGGERS.info("Entered Srilanka");
            Thread.sleep(1000);
            searchTextbox.clear();
            searchTextbox.sendKeys("Canada");
            LOGGERS.info("Entered Canada");
            Thread.sleep(3000);
            searchTextbox.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            LOGGERS.info("Error occurred: " + e.getMessage());
        }
    }


    @Test(priority = 3)
    public void HelloWorld(){

        LOGGERS.info("Hello world!");

    }
    @AfterClass
    public void CloseWebDriver() {
        webDriver.close();
        webDriver.quit();
        LOGGERS.info("Close and Quit browser successfully");
    }
}

