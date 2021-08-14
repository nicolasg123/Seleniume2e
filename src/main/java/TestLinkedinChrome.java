import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestLinkedinChrome {
    private static final String URL = "https://www.linkedin.com/home";
    private  static final String EMAIL = "nicolas.grossi@gmail.com";
    private  static final String TEXT = "Playing w/ Selenium 4 (beta 3) --- automated, hola LINKEDin";

    private  static final String PWD = "140778Nico";


    public static void main(String[] args) throws InterruptedException {
//       driver file location

        System.setProperty("webdriver.chrome.driver", "/Users/test/personal/selenium/chromedriver");

// Initialize browser
        WebDriver driver = new ChromeDriver();

// Open facebook
        driver.get(URL);

// Maximize browser

        driver.manage().window().maximize();

        //To wait for element visible
        final WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));
        final WebElement li;
        li = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign in")));
        li.click();
        final WebElement un;
        un = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        un.click();
        un.sendKeys(EMAIL);
        final WebElement pwd;
        pwd = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        pwd.click();
        pwd.sendKeys(PWD);
        final WebElement si;
        si = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[type='submit']")));
        si.click();
        final WebElement pst;
        pst = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[id='ember42']")));
        pst.click();
        final WebElement pstText;
        pstText = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[data-test-ql-editor-contenteditable='true']")));
        pstText.click();
        pstText.sendKeys(TEXT);
        Thread.sleep(1000);
        final WebElement pstB;
        pstB = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class='share-actions__primary-action artdeco-button artdeco-button--2 artdeco-button--primary ember-view']")));
        pstB.click();

    }
}
