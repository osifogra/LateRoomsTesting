package ScreenObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by gosifo on 29/05/15.
 */
public class AbstractPage {

    protected AppiumDriver driver;

    public AbstractPage (AppiumDriver driver)
    {
        this.driver = driver;
    }

    public AbstractPage NavigateToApp() throws MalformedURLException
    {
        File app = new File("/Users/gosifo/Documents/AppFiles/laterooms.app.zip");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.3");
        capabilities.setCapability("deviceName", "iPhone 6");
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return new OnboardingViewScreen(driver);
    }

}
