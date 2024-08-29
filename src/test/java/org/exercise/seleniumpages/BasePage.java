package org.exercise.seleniumpages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.exercise.framework.selenium.BrowserAction;
import org.exercise.framework.selenium.DriverPool;
import org.exercise.framework.selenium.ElementWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.naming.ldap.ControlFactory;

public abstract class BasePage {
    private final Logger logger;
    private final WebDriver webDriver;
    private final BrowserAction browserAction;

    private final ElementWait elementWait;

    public BasePage() {
        logger = LogManager.getLogger(this.getClass());
        this.webDriver = DriverPool.getInstance().getDriver(Thread.currentThread().getId());
        PageFactory.initElements(webDriver, this);
        this.browserAction = new BrowserAction();
        this.elementWait = new ElementWait();
    }

    public <T extends BasePage> T goToPage(Class<T> tPageClass) throws IllegalAccessException, InstantiationException {
        return tPageClass.newInstance();
    }


    public Actions getActions() {
        return new Actions(webDriver);
    }

    public Logger getLogger() {
        return logger;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public BrowserAction getBrowserActions() {
        return browserAction;
    }

    public ElementWait getElementWait() {
        return elementWait;
    }


}
