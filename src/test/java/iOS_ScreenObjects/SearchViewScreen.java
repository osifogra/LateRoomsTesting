package iOS_ScreenObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;

public class SearchViewScreen extends AbstractPage {

    public SearchViewScreen(AppiumDriver driver)
    {
        super(driver);
    }

    public SearchViewScreen EnterCharactersIntoSearchField(String text)
    {
        ((IOSElement) driver.findElement(By.name("SearchViewSearchTextField"))).setValue(text);
        return new SearchViewScreen(driver);
    }

    public SearchCriteriaViewScreen NavigateToSearchCriteriaView()
    {
        driver.findElement(By.name("SearchListCellView")).click();
        return new SearchCriteriaViewScreen(driver);
    }


}
