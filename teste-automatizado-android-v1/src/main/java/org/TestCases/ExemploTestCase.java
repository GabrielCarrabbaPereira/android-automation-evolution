package org.TestCases;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;


class ExemploTestCase {

    private AndroidDriver driver;

    @BeforeEach
    void prepararTeste() throws MalformedURLException {
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
        driver.quit();
    }

    @Test
    void validarCriacaoNovoContato() {
        driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Contacts\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create new contact\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]"))
                .sendKeys("Gabriel");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]"))
                .sendKeys("Pereira");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Phone\"]"))
                .sendKeys("5551999999999");
        driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@content-desc=\"Mobile Phone\"]"))
                .click();
        driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@content-desc=\"Mobile Phone\"]"))
                .sendKeys("Home");

        Dimension windowSize = driver.manage().window().getSize();
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", (windowSize.getWidth() * 3) / 4, "top", windowSize.getWidth() / 2, "width", 50, "height", 500,
                "direction", "up",
                "percent", 1.0
        ));

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email\"]"))
                .sendKeys("gabrie.pereira@dbserver.com.br");
        driver.findElement(AppiumBy.id("com.google.android.contacts:id/menu_save")).click();

        List<WebElement> listaContatosSalvos = driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/click_target\"]/android.widget.TextView"));
        boolean nomeEstaNaListaDeContatosSalvos = false;
        for(WebElement elementoNome : listaContatosSalvos) {
            if (elementoNome.getText().equals("Gabriel")) {
                nomeEstaNaListaDeContatosSalvos = true;
                break;
            }
        }
        Assertions.assertTrue(nomeEstaNaListaDeContatosSalvos);
    }
}