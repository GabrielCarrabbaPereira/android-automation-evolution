package org.TestCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class TestCaseBase {

    public static AndroidDriver driver;

    @BeforeEach
    public void inicializarDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setAppPackage("com.google.android.dialer")
                .setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity")
                .setPlatformName("Android")
                .setDeviceName("Emulator")
                .setAutomationName("UiAutomator2");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void fecharDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
