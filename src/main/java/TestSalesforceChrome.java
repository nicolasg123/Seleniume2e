import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSalesforceChrome {
    private static final String URL = "https://www.salesforce.com/";
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
        final WebElement tr;
        tr = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler")));
        tr.click();
        Thread.sleep(100);
        final WebElement buyNow;
        buyNow = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("products_menu_item")));
        buyNow.click();
        Thread.sleep(100);
        final WebElement sol;
        sol = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("solutions_menu_item")));
        sol.click();
        Thread.sleep(100);
        final WebElement sop;
        sop = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("support-service_menu_item")));
        sop.click();
        Thread.sleep(100);
//        final WebElement login;
//        login = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gray_link")));
//        login.click();
//        Thread.sleep(10000);
//        driver.get(URL);
//        final WebElement support;
//        support = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Support")));
//        support.click();
//        final WebElement forTeams;
//        forTeams = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("For teams")));
//        forTeams.click();
//        final WebElement products;
//        products = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Products")));
//        products.click();
//
//
//
//
////
////        final WebElement joinBeta = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='#']")));
////        joinBeta.click();
////
////        final WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='email']")));
////        email.sendKeys(EMAIL);
////        final WebElement submit = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='submit']")));
////        submit.click();
////        final WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='button circle']")));
////        close.click();
////        final WebElement continueReading =  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='button primary']")));
////        continueReading.click();
////
////        final WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='email']")));
////        emailElement.sendKeys(EMAIL);
////
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
////
////        final WebElement submitEmail =   wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='submit']")));
////        submitEmail.click();
//
//
//
//

    }
}
