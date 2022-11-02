package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    protected void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    protected void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }



}
