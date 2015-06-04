package iOS_ScreenObjects;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by gosifo on 29/05/15.
 */
public class SearchCriteriaViewScreen extends AbstractPage {

    public SearchCriteriaViewScreen(AppiumDriver driver)
    {
        super(driver);
    }

    public SearchCriteriaViewScreen SearchCriteriaViewIsDisplayed()
    {
        String SearchCriteriasScrn = driver.findElement(By.name("When are you going?")).getText();
        Assert.assertEquals(SearchCriteriasScrn, "When are you going?");
        return new SearchCriteriaViewScreen(driver);
    }

    public SearchResultViewScreen NavigateToSearchResultView()
    {
        driver.findElement(By.name("SearchButton")).click();
        return new SearchResultViewScreen(driver);
    }
}


