package org.VerificationPoints;

import io.appium.java_client.android.AndroidDriver;
import org.Pages.ContatosPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;


public class ContatosVerificationPoint {

    private final ContatosPage contatosPage;

    public ContatosVerificationPoint(AndroidDriver driver) {
        contatosPage = new ContatosPage(driver);
    }

    public void validarContatoFoiSalvo() {
        boolean nomeEstaNaListaDeContatosSalvos = false;
        for(WebElement elementoNome : contatosPage.obterListaContatos()) {
            if (elementoNome.getText().equals("Gabriel Pereira")) {
                nomeEstaNaListaDeContatosSalvos = true;
                break;
            }
        }
        Assertions.assertTrue(nomeEstaNaListaDeContatosSalvos);
    }
}
