package org.TestCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.Utils.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class TestCaseBase {
    @BeforeEach
    public void inicializarDriver() throws MalformedURLException {
        DriverManager.montarCapabilitiesPadrao();
        DriverManager.iniciarDriver();
        DriverManager.obterDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void fecharDriver() {
        DriverManager.fecharDriver();
    }
}
