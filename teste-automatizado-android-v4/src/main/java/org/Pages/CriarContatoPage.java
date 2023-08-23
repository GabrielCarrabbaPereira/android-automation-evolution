package org.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.TestCases.TestCaseBase;
import org.openqa.selenium.WebElement;

public class CriarContatoPage {
    private final AndroidDriver driver;

    public CriarContatoPage() {
        this.driver = TestCaseBase.driver;
    }

    public WebElement obterCampoNome() {
        return this.driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]"));
    }

    public WebElement obterCampoSobrenome() {
        return driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]"));
    }

    public WebElement obterCampoTelefone() {
        return driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Phone\"]"));
    }

    public WebElement obterCampoTipoTelefone() {
        return driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@content-desc=\"Mobile Phone\"]"));
    }

    public WebElement obterCampoEmail() {
        return driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email\"]"));
    }

    public WebElement obterBotaoSalvar() {
        return driver.findElement(AppiumBy.id("com.google.android.contacts:id/menu_save"));
    }
}
