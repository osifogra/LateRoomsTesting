package iOS_ScreenObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ContactDetailsViewScreen extends AbstractPage {

    public ContactDetailsViewScreen(AppiumDriver driver)
    {
        super(driver);
    }

    //Check that user is on the Contact Details View
    public ContactDetailsViewScreen ContactDetailsViewIsDisplayed()
    {
        boolean ContactDetailsScrn = driver.findElement(By.name("ContactDetailsView")).isDisplayed();
        Assert.assertTrue(ContactDetailsScrn);
        return new ContactDetailsViewScreen(driver);
    }


    public ContactDetailsViewScreen ExpandLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.name("BookingLoginExpandContractButton")).click();
        return new ContactDetailsViewScreen(driver);
    }

    public ContactDetailsViewScreen EnterEmail(String EnterEmail)
    {
        ((IOSElement) driver.findElement(By.name("LoginEmailTextField"))).setValue(EnterEmail);
        return new ContactDetailsViewScreen(driver);
    }

    public ContactDetailsViewScreen EnterPassword(String EnterPasswordI)
    {
        ((IOSElement) driver.findElement(By.name("LoginPasswordTextField"))).setValue(EnterPasswordI);
        return new ContactDetailsViewScreen(driver);
    }

    public ContactDetailsViewScreen ClickLogIn()
    {
        driver.findElement(By.name("LoginLoginButton")).click();
        return new ContactDetailsViewScreen(driver);
    }



    public ContactDetailsViewScreen EnterGuestTitle(String Title)
    {
        driver.findElement(By.name("ContactDetailsTitleTextField")).click();
        driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(Title);
        return new ContactDetailsViewScreen(driver);

    }

    public ContactDetailsViewScreen EnterGuestFirstName(String GuestFirstName)
    {
        ((IOSElement) driver.findElement(By.name("ContactDetailsFirstNameTextField"))).setValue(GuestFirstName);
        return new ContactDetailsViewScreen(driver);
    }

    public ContactDetailsViewScreen EnterGuestSurname(String GuestLastName)
    {
        driver.findElement(By.name("ContactDetailsLastNameTextField")).sendKeys(GuestLastName);
        driver.findElement(By.name("PickerButton")).click();
        return new ContactDetailsViewScreen(driver);
    }


    public ContactDetailsViewScreen EnterGuestEmail(String GuestEmail)
    {
        driver.findElements(By.className("UIATextField")).get(0).sendKeys(GuestEmail);
        driver.findElement(By.name("PickerButton")).click();
        return new ContactDetailsViewScreen(driver);
    }

    public ContactDetailsViewScreen EnterGuestPhoneNo(String GuestPhoneNo)
    {
        driver.findElements(By.className("UIATextField")).get(0).sendKeys(GuestPhoneNo);
        driver.findElement(By.name("Done")).click();
        return new ContactDetailsViewScreen(driver);
    }

    public ContactDetailsViewScreen ChooseLeisureOption()
    {
        driver.findElement(By.name("ContactDetailsReasonTypeLeisureButton")).click();
        return new ContactDetailsViewScreen(driver);
    }


    public CardDetailsViewScreen NavigateToCardDetailsView()
    {
        driver.findElement(By.name("ContactDetailsContinueButton")).click();
        return new CardDetailsViewScreen(driver);
    }

}

