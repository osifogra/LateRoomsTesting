package ScreenObjects;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by gosifo on 29/05/15.
 */
public class BookingConfirmationViewScreen  extends AbstractPage {

    public BookingConfirmationViewScreen(AppiumDriver driver)
    {
        super(driver);
    }



    //Check that user is on the Booking Confirmation Screen
    public BookingConfirmationViewScreen BookingConfirmationViewIsDisplayed()
    {
        boolean BookingConfirmationScrn = driver.findElement(By.name("BookingConfirmationView")).isDisplayed();
        Assert.assertTrue(BookingConfirmationScrn);
        return new BookingConfirmationViewScreen(driver);
    }

}
