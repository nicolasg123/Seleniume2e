import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestNubankChrome {
    private static final int time = 2000;
    private static final String URL = "https://nubank.com.br/en/";
    private  static final String EMAIL = "nicolas.grossi@gmail.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/test/personal/selenium/chromedriver");

// Initialize browser
        WebDriver driver = new ChromeDriver();

// Open facebook
        driver.get(URL);

// Maximize browser

        driver.manage().window().maximize();


        //To wait for element visible
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));
        final WebElement joinBeta = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home")));
        joinBeta.click();
        Thread.sleep(time);

        final WebElement buyNow;
        buyNow = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Digital account")));
        buyNow.click();
        Thread.sleep(time);
        final WebElement cc;
        cc = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Credit card")));
        cc.click();
        Thread.sleep(time);
        final WebElement r;
        r = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Rewards")));
        r.click();
        Thread.sleep(time);
        final WebElement l;
        l = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Loans")));
        l.click();
        Thread.sleep(time);
        final WebElement ba;
        ba = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Business account")));
        ba.click();
        Thread.sleep(time);
        final WebElement au;
        au = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("About us")));
        au.click();
        Thread.sleep(time);
        final WebElement c;
        c = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Careers")));
        c.click();
        Thread.sleep(time);
    }
}
