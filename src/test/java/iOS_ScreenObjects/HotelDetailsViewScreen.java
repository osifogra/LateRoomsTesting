package iOS_ScreenObjects;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by gosifo on 29/05/15.
 */
public class HotelDetailsViewScreen extends AbstractPage {

    public HotelDetailsViewScreen(AppiumDriver driver)
    {
        super(driver);
    }

    //Check that user is on the Hotel Details Screen
    public HotelDetailsViewScreen HotelDetailsViewIsDisplayed()
    {
        boolean HotelDetailsScrn = driver.findElement(By.name("HotelDetailsView")).isDisplayed();
        Assert.assertTrue(HotelDetailsScrn);
        return new HotelDetailsViewScreen(driver);
    }


    public HotelRoomListViewScreen NavigateToHotelRoomListView()
    {
        driver.findElement(By.name("HotelChooseRoom")).click();
        return new HotelRoomListViewScreen(driver);
    }

}