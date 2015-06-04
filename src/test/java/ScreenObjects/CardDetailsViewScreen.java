package ScreenObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CardDetailsViewScreen extends AbstractPage {

    public CardDetailsViewScreen(AppiumDriver driver)
    {
        super(driver);
    }


    public CardDetailsViewScreen ContactDetailsViewIsDisplayed()
    {
        boolean CardDetailsScrn = driver.findElement(By.name("CardDetailsView")).isDisplayed();
        Assert.assertTrue(CardDetailsScrn);
        return new CardDetailsViewScreen(driver);
    }


    public CardDetailsViewScreen ChooseFirstTimePaymentCard(String CardType)
    {
        driver.findElement(By.name("CardDetailsCardType")).click();
        driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(CardType);
        return new CardDetailsViewScreen(driver);
    }


    public void EnterCardNumber(String CardNumber) {
        ((IOSElement) driver.findElement(By.name("CardDetailsCardNumber"))).setValue(CardNumber);
    }

    public void EnterExpiryDate(String ExpiryDate) {
        ((IOSElement) driver.findElement(By.name("CardDetailsExpiryDate"))).setValue(ExpiryDate);
    }

    public void EnterCardSecurityNumber(String CardSecurityNo)
    {
        ((IOSElement) driver.findElement(By.name("CardDetailsSecurityNumber"))).setValue(CardSecurityNo);
    }


    public CardDetailsViewScreen EnterCardAddressCountry(String CardAddressCountry)
    {
        driver.findElement(By.name("CardAddressCountry")).click();
        driver.findElement(By.name(CardAddressCountry)).click();
        return new CardDetailsViewScreen(driver);
    }

    public CardDetailsViewScreen EnterCardAddress1(String CardAddress1)
    {
        ((IOSElement) driver.findElement(By.name("CardAddress1"))).setValue(CardAddress1);
        return new CardDetailsViewScreen(driver);
    }


    public CardDetailsViewScreen EnterCardAddressCity(String CardAddressCity)
    {
        ((IOSElement) driver.findElement(By.name("CardAddressCity"))).setValue(CardAddressCity);
        return new CardDetailsViewScreen(driver);
    }

    public CardDetailsViewScreen EnterCardAddressPostcode (String CardAddressPostcode)
    {
        ((IOSElement) driver.findElement(By.name("CardAddressPostcode"))).setValue(CardAddressPostcode);
        return new CardDetailsViewScreen(driver);
    }


    public BookingConfirmationViewScreen NavigateToBookingConfirmationView()
    {
        driver.findElement(By.name("ContactDetailsContinueButton")).click();
        return new BookingConfirmationViewScreen(driver);
    }

}
