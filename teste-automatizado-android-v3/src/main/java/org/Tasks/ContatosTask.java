package org.Tasks;

import io.appium.java_client.android.AndroidDriver;
import org.Pages.ContatosPage;


public class ContatosTask {
    private final ContatosPage contatosPage;
    public ContatosTask(AndroidDriver driver) {
        contatosPage = new ContatosPage(driver);
    }

    public void clicarBotaoContatos() {
        contatosPage.obterBotaoContatos().click();
    }

    public void clicarBotaoCriarNovoContato() {
        contatosPage.obterBotaoCriarNovoContato().click();
    }
}
