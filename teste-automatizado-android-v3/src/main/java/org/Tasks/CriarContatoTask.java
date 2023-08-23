package org.Tasks;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.Pages.CriarContatoPage;
import org.openqa.selenium.Dimension;


public class CriarContatoTask {
    private final CriarContatoPage criarContatoPage;
    private final AndroidDriver driver;

    public CriarContatoTask(AndroidDriver driver) {
        this.driver = driver;
        criarContatoPage = new CriarContatoPage(this.driver);
    }

    public void preencherCampoNome() {
        criarContatoPage.obterCampoNome().sendKeys("Gabriel");
    }

    public void preencherCampoSobrenome() {
        criarContatoPage.obterCampoSobrenome().sendKeys("Pereira");
    }

    public void preencherCampoTelefone() {
        criarContatoPage.obterCampoTelefone().sendKeys("5551999999999");
    }

    public void abrirListaTipoTelefone() {
        criarContatoPage.obterCampoTipoTelefone().click();
    }

    public void selecionarTipoTelefone() {
        criarContatoPage.obterCampoTipoTelefone().sendKeys("Home");
    }

    public void descerTela() {
        Dimension windowSize = driver.manage().window().getSize();
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", (windowSize.getWidth() * 3) / 4, "top", windowSize.getWidth() / 2, "width", 50, "height", 500,
                "direction", "up",
                "percent", 1.0
        ));
    }

    public void preencherCampoEmail() {
        criarContatoPage.obterCampoEmail().sendKeys("gabrie.pereira@dbserver.com.br");
    }

    public void clicarBotaoSalvar() {
        criarContatoPage.obterBotaoSalvar().click();
    }
}
