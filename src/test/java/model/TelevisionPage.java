package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.BaseModel;

import java.util.ArrayList;

public class TelevisionPage extends BaseModel {

    @FindBy(xpath = "//a[@class='a-link-normal' and ./span/text()='Samsung']")
    private WebElement brandSamsungCheckbox;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    private WebElement dropDownSortBy;

    @FindBy(xpath = "//a[@id='s-result-sort-select_2']")
    private WebElement sortByHighToLow;

    @FindBy(xpath = "//div[@data-index='2']//span[@data-component-type='s-product-image']//a")
    private WebElement tvSecondPosition;

    public TelevisionPage(WebDriver driver) {
        super(driver);
    }

    public TelevisionPage clickBrandSamsungCheckbox() {
        brandSamsungCheckbox.click();

        return new TelevisionPage(getDriver());
    }

    public TelevisionPage clickDropDownSortBy() {
        dropDownSortBy.click();

        return new TelevisionPage(getDriver());
    }

    public TelevisionPage clickSortByHighToLow() {
        sortByHighToLow.click();

        return new TelevisionPage(getDriver());
    }

    public ProductPage clickTvSecondPosition() {
        tvSecondPosition.click();
        ArrayList<String> newTab = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTab.get(1));

        return new ProductPage(getDriver());
    }
}
