package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.MainPage;

import java.time.Duration;


public class BaseUITest {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        new WebDriverWait(driver, Duration.ofSeconds(10));
        new MainPage(driver)
                .open()
                .acceptCookie();
    }

    @AfterClass
    public static void teatDown() {
        driver.quit();

    }

}