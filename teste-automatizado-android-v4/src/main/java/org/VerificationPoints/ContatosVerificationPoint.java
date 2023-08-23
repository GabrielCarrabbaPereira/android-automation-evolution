package org.VerificationPoints;

import org.Pages.ContatosPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;


public class ContatosVerificationPoint {

    private final ContatosPage contatosPage;

    public ContatosVerificationPoint() {
        contatosPage = new ContatosPage();
    }

    public void validarContatoFoiSalvo(String contato) {
        boolean nomeEstaNaListaDeContatosSalvos = false;
        for(WebElement elementoNome : contatosPage.obterListaContatos()) {
            if (elementoNome.getText().equals(contato)) {
                nomeEstaNaListaDeContatosSalvos = true;
                break;
            }
        }
        Assertions.assertTrue(nomeEstaNaListaDeContatosSalvos);
    }
}
