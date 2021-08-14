import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Hola {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/test/personal/selenium/chromedriver");

// Initialize browser
        final WebDriver driver = new ChromeDriver();

// Open facebook
        driver.get("http://qax.anypoint.mulesoft.com");

// Maximize browser

        driver.manage().window().maximize();

        //To wait for element visible
        final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));
        final WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[data-test-id='SignIn-Username']")));
        usernameField.click();
        usernameField.sendKeys("E2euser");
        final WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[data-test-id='SignIn-Password']")));
        passwordField.click();
        passwordField.sendKeys("E2euserpassword1");
        WebElement signInButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[data-test-id='SignIn-Submit']")));
        signInButton.click();
        WebElement monitoring = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[data-name='monitoring_center']")));
        monitoring.click();
        WebElement anypointMonitoring = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='#/apitesting/ui']")));
        anypointMonitoring.click();
        driver.switchTo().frame("functional-monitoring-iframe");
        WebElement createButton = wait.until(ExpectedConditions.presenceOfElementLocated(By. cssSelector("button[data-test-id='sidebar-create-monitor']")));
        createButton.click();
        final String title = driver.getTitle();
        Assert.assertEquals(title, "Anypoint Monitoring");


    }
}
