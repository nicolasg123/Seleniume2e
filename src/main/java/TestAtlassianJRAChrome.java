import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestAtlassianJRAChrome {
    private static final String URL = "https://jira.atlassian.com/";
    private  static final String EMAIL = "nicolas.grossi@gmail.com";
   private  static final String PASSWORD = "NicolasGrossi140778RM";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/test/personal/selenium/chromedriver");

// Initialize browser
        WebDriver driver = new ChromeDriver();
// Open URL
        driver.get(URL);
// Maximize browser
        driver.manage().window().maximize();
        //To wait for element visible
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));
        final WebElement tr;
        tr = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='/secure/Dashboard.jspa']")));
        tr.click();
//        <a href="/secure/Dashboard.jspa">Click here</a>
        final WebElement buyNow;
        buyNow = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log In")));
        buyNow.click();
        final WebElement login;
        login = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("google-signin-button")));
        login.click();
        Thread.sleep(1000);
        final WebElement support;
        support = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        support.click();
        support.sendKeys(EMAIL);
        final WebElement forTeams;
        forTeams = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[jsname='LgbsSe']")));
        forTeams.click();
        final WebElement products;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20), Duration.ofMillis(100));
        products = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='password']")));
        products.click();
        products.sendKeys(PASSWORD);
        final WebElement button;
        button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[jsname='LgbsSe']")));
        button.click();
        final WebElement is;
        is = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='https://jira.atlassian.com/issues/?filter=18961']")));
        is.click();
    }
}
