import com.apple.eawt.AppReOpenedListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class TestClarinChrome {
    private static final String URL = "https://clarin.com/";
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
        Thread.sleep(15000);
        //To wait for element visible
        final WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));
        final WebElement noGracias;
        noGracias = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".sw .btnSi")));
        noGracias.click();
//        final WebElement popUp;
//        popUp = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(("img[src='https://images.clarin.com/collections/static/logo_clarin.svg']"))));
//        popUp.click();
        final WebElement ultimoMomento;
        ultimoMomento = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(("Último Momento"))));
        ultimoMomento.click();
        Thread.sleep(3000);
        final WebElement politica;
        politica = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(("Política"))));
        politica.click();
        Thread.sleep(3000);
        final WebElement economia;
        economia = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(("Economía"))));
        economia.click();
        Thread.sleep(3000);
        final WebElement sociedad;
        sociedad = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(("Sociedad"))));
        sociedad.click();
        Thread.sleep(3000);
//
//        final WebElement joinBeta = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='#']")));
//        joinBeta.click();
//
//        final WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='email']")));
//        email.sendKeys(EMAIL);
//        final WebElement submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='submit']")));
//        submit.click();
//        final WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='button circle']")));
//        close.click();
//        final WebElement continueReading =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='button primary']")));
//        continueReading.click();
//
//        final WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='email']")));
//        emailElement.sendKeys(EMAIL);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//
//        final WebElement submitEmail =   wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='submit']")));
//        submitEmail.click();
    }
}
