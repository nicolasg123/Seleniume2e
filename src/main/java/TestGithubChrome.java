import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestGithubChrome {
    private static final String URL = "https://github.com/";
    private  static final String EMAIL = "nicolas.grossi@gmail.com";
    private  static final String PASSWORD = "nico140778NCG";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/test/personal/selenium/chromedriver");

// Initialize browser
        WebDriverManager.chromedriver().setup();
        final WebDriver driver = new ChromeDriver();

// Open github
        driver.get(URL);
        Thread.sleep(5000);  // Let the user actually see something!
// Maximize browser

        driver.manage().window().maximize();


        //To wait for element visible
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));
        final WebElement signIn;
        signIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu.HeaderMenu--logged-out.position-fixed.top-0.right-0.bottom-0.height-fit.position-lg-relative.d-lg-flex.flex-justify-between.flex-items-center.flex-auto > div.d-lg-flex.flex-items-center.px-3.px-lg-0.text-center.text-lg-left > div.position-relative.mr-3.d-inline-block > a")));
        signIn.click();
        final WebElement user;
        user = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("login")));
        user.sendKeys(EMAIL);
        final WebElement password;
        password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        password.sendKeys(PASSWORD);
        final WebElement logIn;
        logIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        logIn.click();
        final WebElement newRepo;
        newRepo = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#repos-container > h2 > a")));
        newRepo.click();
        final WebElement newRepoName;
        newRepoName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("repository_name")));
        newRepoName.sendKeys("hola");
        final WebElement newRepoDescription;
        newRepoDescription = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("repository_description")));
        newRepoDescription.sendKeys("hola");
        final WebElement createRepoButton;
        createRepoButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_repository\"]/div[4]/button")));
        createRepoButton.click();
        final WebElement headerLink;
        headerLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header/div[7]/details/summary")));
        headerLink.click();
        final WebElement menuItem;
        menuItem = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/a[1]")));
        menuItem.click();
        final WebElement repoSelect;
        repoSelect = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[2]/div[2]/div/div[1]/div/ol/li/div/div/div/a/span")));
        repoSelect.click();
        final WebElement repoUnwatch;
        repoUnwatch = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"repository-container-header\"]/div[1]/ul/li[1]/notifications-list-subscription-form/details/summary")));
        repoUnwatch.click();
    }
}
