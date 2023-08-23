package org.TestCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


class HistoricoTestCase {

    private AndroidDriver driver;

    //Declaração das tasks...


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

        //Inicialização das tasks declaradas...
    }

    @AfterEach
    void fecharDriver() {
        driver.quit();
    }

    @Test
    @DisplayName("Validar deletar uma entrada do histórico")
    void validarDeletarEntradaHistorico() {
        //Steps do teste...
    }

    @Test
    @DisplayName("Validar bloquear número pelo histórico")
    void validarBloquearNumeroPeloHistorico() {
        //Steps do teste...
    }

    @Test
    @DisplayName("Validar salvar número pelo histórico")
    void validarSalvarNumeroPeloHistorico() {
        //Steps do teste...
    }
}