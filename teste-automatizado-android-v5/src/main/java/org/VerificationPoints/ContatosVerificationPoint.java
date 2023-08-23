package org.VerificationPoints;

import org.Pages.ContatosPage;
import org.Utils.Enums.Contato;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;


public class ContatosVerificationPoint {

    private final ContatosPage contatosPage;

    public ContatosVerificationPoint() {
        contatosPage = new ContatosPage();
    }

    public void validarContatoFoiSalvo(Contato nome, Contato sobrenome) {
        boolean nomeEstaNaListaDeContatosSalvos = false;
        for(WebElement elementoNome : contatosPage.obterListaContatos()) {
            if (elementoNome.getText().equals(nome.toString() + " " + sobrenome.toString())) {
                nomeEstaNaListaDeContatosSalvos = true;
                break;
            }
        }
        Assertions.assertTrue(nomeEstaNaListaDeContatosSalvos);
    }
}
