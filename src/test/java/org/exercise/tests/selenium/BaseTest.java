package org.exercise.tests.selenium;

import org.exercise.framework.selenium.DriverHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(SeleniumListener.class)
public class BaseTest {

    private DriverHandler driverHandler;

    @BeforeMethod
    public void setUp() throws Exception {
        driverHandler = new DriverHandler();
        driverHandler.startDriver();
    }



    @AfterMethod
    public void tearDown() {
        driverHandler.closeDriver();
    }

}
