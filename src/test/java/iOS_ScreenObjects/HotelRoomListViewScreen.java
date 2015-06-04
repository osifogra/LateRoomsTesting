package iOS_ScreenObjects;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by gosifo on 29/05/15.
 */
public class HotelRoomListViewScreen extends AbstractPage {

    public HotelRoomListViewScreen(AppiumDriver driver)
    {
        super(driver);
    }

    //Check that user is on the Hotel Room List  Screen
    public HotelRoomListViewScreen HotelRoomListViewIsDisplayed()
    {
        boolean HotelRoomListScrn = driver.findElement(By.name("HotelRoomListView")).isDisplayed();
        Assert.assertTrue(HotelRoomListScrn);
        return new HotelRoomListViewScreen(driver);
    }

    public HotelRoomListViewScreen HotelRoomIsAdded()
    {
        driver.findElement(By.name("HotelRoomTableHeaderAddRemoveButton")).click();
        return new HotelRoomListViewScreen(driver);
    }

    public ContactDetailsViewScreen NavigateToContactDetailsView()
    {
        driver.findElement(By.name("BasketBarBookButton")).click();
        return new ContactDetailsViewScreen(driver);
    }

}
