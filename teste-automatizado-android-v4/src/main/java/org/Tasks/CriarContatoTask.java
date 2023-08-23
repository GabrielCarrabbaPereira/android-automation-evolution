package org.Tasks;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.Pages.CriarContatoPage;
import org.TestCases.TestCaseBase;
import org.openqa.selenium.Dimension;


public class CriarContatoTask {
    private final CriarContatoPage criarContatoPage;

    public CriarContatoTask() {
        criarContatoPage = new CriarContatoPage();
    }

    public void preencherCampoNome(String nome) {
        criarContatoPage.obterCampoNome().sendKeys(nome);
    }

    public void preencherCampoSobrenome(String sobrenome) {
        criarContatoPage.obterCampoSobrenome().sendKeys(sobrenome);
    }

    public void preencherCampoTelefone(String telefone) {
        criarContatoPage.obterCampoTelefone().sendKeys(telefone);
    }

    public void abrirListaTipoTelefone() {
        criarContatoPage.obterCampoTipoTelefone().click();
    }

    public void selecionarTipoTelefone(String tipoTelefone) {
        criarContatoPage.obterCampoTipoTelefone().sendKeys(tipoTelefone);
    }

    public void descerTela() {
        Dimension windowSize = TestCaseBase.driver.manage().window().getSize();
        TestCaseBase.driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", (windowSize.getWidth() * 3) / 4, "top", windowSize.getWidth() / 2, "width", 50, "height", 500,
                "direction", "up",
                "percent", 1.0
        ));
    }

    public void preencherCampoEmail(String email) {
        criarContatoPage.obterCampoEmail().sendKeys(email);
    }

    public void clicarBotaoSalvar() {
        criarContatoPage.obterBotaoSalvar().click();
    }
}
