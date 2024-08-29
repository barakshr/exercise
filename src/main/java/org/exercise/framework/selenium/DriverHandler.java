package org.exercise.framework.selenium;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.exercise.framework.selenium.properties.PropertiesHandler;
import org.exercise.framework.selenium.properties.Settings;

public class DriverHandler {
   Logger logger = LogManager.getLogger(this.getClass());
    public DriverHandler() {
    }

    public void startDriver() throws Exception {
      logger.info("hghfghfhfghgf");
        PropertiesHandler.readProperties();
        new WebDriverFactory().openNewWebDriver(Settings.BrowserType);
        BrowserAction browserAction = new BrowserAction();
        CdpRegistration cdpRegistration = new CdpRegistration();
        cdpRegistration.browserLogsRegistration();
        browserAction.goToUrl(Settings.AUT);
    }

    public void closeDriver() {
        DriverPool.getInstance().closeDriver(Thread.currentThread().getId());
    }

}
