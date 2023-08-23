package org.Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AndroidDriver driver;
    private static UiAutomator2Options options;

    private DriverManager() {}

    public static void montarCapabilitiesPadrao() {
        options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setAppPackage("com.google.android.dialer")
                .setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity")
                .setPlatformName("Android")
                .setDeviceName("Emulator")
                .setAutomationName("UiAutomator2");
    }

    public static void montarCapabilitiesAndroid5() {
        options = new UiAutomator2Options()
                .setUdid("362781321gheh21e78210")
                .setAppPackage("com.google.android.dialer")
                .setAppActivity("com.google.android.dialer.dsadawa.GoogleDialtactsActivity")
                .setPlatformName("Ios")
                .setDeviceName("Emulator")
                .setAutomationName("XCUITest")
                .setPlatformVersion("5.0");
    }

    public static void iniciarDriver() throws MalformedURLException {
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);
    }

    public static AndroidDriver obterDriver() {
        return driver;
    }

    public static void fecharDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
