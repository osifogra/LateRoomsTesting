package iOS_ScreenObjects;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchResultViewScreen extends AbstractPage {

    public SearchResultViewScreen(AppiumDriver driver)
    {
        super(driver);
    }


    public SearchResultViewScreen SearchResultsScreenIsDisplayed()
    {
        Boolean SearchResultsScrn = driver.findElement(By.name("SearchResultView")).isDisplayed();
        Assert.assertTrue(SearchResultsScrn);
        return new SearchResultViewScreen(driver);
    }

    public HotelDetailsViewScreen NavigateHotelDetailsView()
    {
        //This pick the first option (get(0) pick the first option in the array) returned from the search
        driver.findElements(By.className("UIATableCell")).get(0).click();
        return new HotelDetailsViewScreen(driver);
    }

}
