package org.Tasks;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.Pages.CriarContatoPage;
import org.TestCases.TestCaseBase;
import org.Utils.DriverManager;
import org.Utils.Enums.Contato;
import org.openqa.selenium.Dimension;


public class CriarContatoTask {
    private final CriarContatoPage criarContatoPage;

    public CriarContatoTask() {
        criarContatoPage = new CriarContatoPage();
    }

    public void preencherCampoNome(Contato nome) {
        criarContatoPage.obterCampoNome().sendKeys(nome.toString());
    }

    public void preencherCampoSobrenome(Contato sobrenome) {
        criarContatoPage.obterCampoSobrenome().sendKeys(sobrenome.toString());
    }

    public void preencherCampoTelefone(Contato telefone) {
        criarContatoPage.obterCampoTelefone().sendKeys(telefone.toString());
    }

    public void abrirListaTipoTelefone() {
        criarContatoPage.obterCampoTipoTelefone().click();
    }

    public void selecionarTipoTelefone(Contato tipoTelefone) {
        criarContatoPage.obterCampoTipoTelefone().sendKeys(tipoTelefone.toString());
    }

    public void descerTela() {
        AndroidDriver driver = DriverManager.obterDriver();
        Dimension windowSize = driver.manage().window().getSize();
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", (windowSize.getWidth() * 3) / 4, "top", windowSize.getWidth() / 2, "width", 50, "height", 500,
                "direction", "up",
                "percent", 1.0
        ));
    }

    public void preencherCampoEmail(Contato email) {
        criarContatoPage.obterCampoEmail().sendKeys(email.toString());
    }

    public void clicarBotaoSalvar() {
        criarContatoPage.obterBotaoSalvar().click();
    }
}
