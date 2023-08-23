package org.Tasks;

import org.Pages.ContatosPage;


public class HistoricoTask {
    private final ContatosPage contatosPage;
    public HistoricoTask() {
        contatosPage = new ContatosPage();
    }

    public void clicarBotaoContatos() {
        contatosPage.obterBotaoContatos().click();
    }

    public void clicarBotaoCriarNovoContato() {
        contatosPage.obterBotaoCriarNovoContato().click();
    }
}
