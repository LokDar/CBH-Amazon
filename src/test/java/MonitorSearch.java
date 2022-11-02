import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;


public class MonitorSearch extends BaseTest {

    @Test
    public void searchMonitor() {
        String actualResult = new HomePage(getDriver()).clickHamburgerMenu()
                .clickTvCategory()
                .clickTvMenu()
                .clickBrandSamsungCheckbox()
                .clickDropDownSortBy()
                .clickSortByHighToLow()
                .clickTvSecondPosition()
                .checkTextAboutThisItem();

        Assert.assertEquals(actualResult, "About this item");

    }
}