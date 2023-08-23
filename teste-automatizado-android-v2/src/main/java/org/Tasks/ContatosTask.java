package org.Tasks;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ContatosTask {

    private final AndroidDriver driver;

    public ContatosTask(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clicarBotaoContatos() {
        this.driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Contacts\"]")).click();
    }

    public void clicarBotaoCriarNovoContato() {
        this.driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create new contact\"]")).click();
    }
}
