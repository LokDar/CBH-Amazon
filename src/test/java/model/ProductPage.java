package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.BaseModel;

public class ProductPage extends BaseModel {

    @FindBy(xpath = "//div[@id='feature-bullets']//h1")
    private WebElement aboutThisItem;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String checkTextAboutThisItem() {
        return aboutThisItem.getText();
    }
}
