package org.Tasks;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CriarContatoTask {
    private final AndroidDriver driver;

    public CriarContatoTask(AndroidDriver driver) {
        this.driver = driver;
    }

    public void preencherCampoNome() {
        this.driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]"))
                .sendKeys("Gabriel");
    }

    public void preencherCampoSobrenome() {
        this.driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]"))
                .sendKeys("Pereira");
    }

    public void preencherCampoTelefone() {
        this.driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Phone\"]"))
                .sendKeys("5551999999999");
    }

    public void abrirListaTipoTelefone() {
        this.driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@content-desc=\"Mobile Phone\"]"))
                .click();
    }

    public void selecionarTipoTelefone() {
        this.driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@content-desc=\"Mobile Phone\"]"))
                .sendKeys("Home");
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
        this.driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email\"]"))
                .sendKeys("gabrie.pereira@dbserver.com.br");
    }

    public void clicarBotaoSalvar() {
        this.driver.findElement(AppiumBy.id("com.google.android.contacts:id/menu_save")).click();
    }

    private List<WebElement> obterListaContatosSalvos() {
        return driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/click_target\"]/android.widget.TextView"));
    }

    public void validarContatoFoiSalvo() {
        boolean nomeEstaNaListaDeContatosSalvos = false;
        for(WebElement elementoNome : obterListaContatosSalvos()) {
            if (elementoNome.getText().equals("Gabriel")) {
                nomeEstaNaListaDeContatosSalvos = true;
                break;
            }
        }
        Assertions.assertTrue(nomeEstaNaListaDeContatosSalvos);
    }

}
