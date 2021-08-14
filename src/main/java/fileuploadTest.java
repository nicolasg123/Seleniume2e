import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class fileuploadTest {
    private static final String URL = "https://files.fm/?utm_source=ads-world&utm_medium=textad&utm_campaign=first-page&utm_term=ads-world&source=ads-world&utm_content=Free-file-upload&gclid=CjwKCAiA8ov_BRAoEiwAOZogwclg0zoDH7oaDbHum3hUcam2bnIxipT9zyX5u_0kbGJP4uWFGUMh3xoC9t4QAvD_BwE";
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
        final WebElement fileU;
        fileU = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("file_upload[]")));
        fileU.sendKeys("/Users/test/Desktop/Screen Shot 2020-12-16 at 13.43.34.png");

    }
}
