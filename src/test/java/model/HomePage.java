package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import runner.BaseModel;

public class HomePage extends BaseModel {

    private final JavascriptExecutor js = (JavascriptExecutor) getDriver();

    @FindBy(xpath = "//i[@class = 'hm-icon nav-sprite']")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
    private WebElement tvCategory;

    @FindBy(xpath = "//a[text()='Televisions']")
    private WebElement tvMenu;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickHamburgerMenu () {
        hamburgerMenu.click();

        return new HomePage(getDriver());
    }

    public HomePage clickTvCategory() {
        getWait5().until(ExpectedConditions.visibilityOf(tvCategory));
        js.executeScript("arguments[0].scrollIntoView();", tvCategory);
        tvCategory.click();

        return new HomePage(getDriver());
    }

    public TelevisionPage clickTvMenu() {
        tvMenu.click();

        return new TelevisionPage(getDriver());
    }
}
