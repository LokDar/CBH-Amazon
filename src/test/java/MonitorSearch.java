import io.github.bonigarcia.wdm.WebDriverManager;
import model.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MonitorSearch {

    @Test
    public void searchMonitor(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        new HomePage(driver).clickHamburgerMenu();

    }
}
