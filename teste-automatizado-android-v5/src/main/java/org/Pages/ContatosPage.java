package org.Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.TestCases.TestCaseBase;
import org.Utils.DriverManager;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContatosPage {
    private final AndroidDriver driver;

    public ContatosPage() {
        this.driver = DriverManager.obterDriver();
    }

    public WebElement obterBotaoContatos() {
        return driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Contacts\"]"));
    }

    public WebElement obterBotaoCriarNovoContato() {
        return driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create new contact\"]"));
    }

    public List<WebElement> obterListaContatos() {
        return driver.findElements(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.google.android.dialer:id/click_target\"]/android.widget.TextView"));
    }
}
