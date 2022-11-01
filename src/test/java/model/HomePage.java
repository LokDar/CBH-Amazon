package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.BaseModel;

public class HomePage extends BaseModel {

    @FindBy(xpath = "//i[@class = 'hm-icon nav-sprite']")
    private WebElement hamburgerMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickHamburgerMenu () {
        hamburgerMenu.click();

        return new HomePage(getDriver());
    }

}
