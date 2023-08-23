package org.TestCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.Tasks.ContatosTask;
import org.Tasks.CriarContatoTask;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


class ExemploTestCase {

    private AndroidDriver driver;
    private ContatosTask contatosTask;
    private CriarContatoTask criarContatoTask;


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
        contatosTask = new ContatosTask(driver);
        criarContatoTask = new CriarContatoTask(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterEach
    void fecharDriver() {
        driver.quit();
    }

    @Test
    void validarCriacaoNovoContato() {
        contatosTask.clicarBotaoContatos();
        contatosTask.clicarBotaoCriarNovoContato();
        criarContatoTask.preencherCampoNome();
        criarContatoTask.preencherCampoSobrenome();
        criarContatoTask.preencherCampoTelefone();
        criarContatoTask.abrirListaTipoTelefone();
        criarContatoTask.selecionarTipoTelefone();
        criarContatoTask.descerTela();
        criarContatoTask.preencherCampoEmail();
        criarContatoTask.clicarBotaoSalvar();
        criarContatoTask.validarContatoFoiSalvo();
    }
}