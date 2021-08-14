import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCarefulChrome {
    private static final String URL = "https://www.getcarefull.com/";
    private  static final String EMAIL = "nicolas.grossi@gmail.com";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/test/personal/selenium/chromedriver");

// Initialize browser
        final WebDriver driver = new ChromeDriver();

// Open facebook
        driver.get(URL);

// Maximize browser
        driver.manage().window().maximize();
        //To wait for element visible
        final WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));
        final WebElement storyField;
        storyField = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='/our-story']")));
        storyField.click();
        final WebElement articles = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='/takecare']")));
        articles.click();
        final WebElement joinBeta = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='#']")));
        joinBeta.click();
        final WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='email']")));
        email.sendKeys(EMAIL);
        final WebElement submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='submit']")));
        submit.click();
        final WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='button circle']")));
        close.click();
        final WebElement continueReading =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='button primary']")));
        continueReading.click();
        final WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("EMAIL-3")));
        emailElement.click();
        emailElement.sendKeys(EMAIL);
        final WebElement submitEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='GET TIPS']")));
        submitEmail.click();
    }
}
