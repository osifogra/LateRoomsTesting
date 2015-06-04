package iOS_ScreenObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * Created by gosifo on 29/05/15.
 */
public class OnboardingViewScreen extends AbstractPage {

    public OnboardingViewScreen(AppiumDriver driver)
    {
        super(driver);
    }

    public SearchViewScreen NavigateToSearchView()
    {
        driver.findElement(By.name("CurrencyOnboardingContinueButton")).click();
        driver.findElement(By.name("WalkthroughCloseButton")).click();
        driver.findElement(By.name("Allow")).click();
        driver.findElement(By.name("OK")).click();
        return new SearchViewScreen(driver);
    }

}