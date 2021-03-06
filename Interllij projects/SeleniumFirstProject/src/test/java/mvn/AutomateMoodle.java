package mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AutomateMoodle {
    Logger LOGGERS = LoggerFactory.getLogger(AutomateMoodle.class);
    WebDriver webDriver;


    @BeforeClass
    public void InitiateWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/EDU/Software/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void validateLogInToMoodleWithValidCredential() {

        try {

            //Navigate to the moodle site
            webDriver.get("https://school.moodledemo.net/");
            LOGGERS.info("Navigated to moodle");
            //maximize the window
            webDriver.manage().window().maximize();
            //click on login link
            webDriver.findElement(By.linkText("Log in")).click();
            LOGGERS.info("clicked on login");
            Thread.sleep(2000);

            //login to the moodle
            webDriver.findElement(By.id("username")).sendKeys("student");
            webDriver.findElement(By.id("password")).sendKeys("moodle");
            webDriver.findElement(By.id("loginbtn")).click();
            LOGGERS.info("Entered Username, Password and Clicked Login button");
            Thread.sleep(2000);

            //logout from moodle
            WebElement dropDownLink = webDriver.findElement(By.id("action-menu-toggle-1"));
            dropDownLink.click();
            Thread.sleep(2000);

            WebElement logOutLink = webDriver.findElement(By.id("actionmenuaction-6"));
            logOutLink.click();
            LOGGERS.info("Logged out moodle site");
            Thread.sleep(5000);

        } catch (Exception e) {
            LOGGERS.info("Error occurred in closing the file: " + e.getMessage());

        }
    }
    @AfterClass
    public void CloseWebDriver() {
        webDriver.close();
        webDriver.quit();
        LOGGERS.info("Close and Quit browser successfully");
        }

    }

