package org.exercise.tests.selenium;

import org.apache.commons.io.FileUtils;
import org.exercise.framework.selenium.DriverPool;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.io.File;

public class SeleniumListener implements ITestListener {


    public void onTestFailure(ITestResult result) {
        WebDriver webDriver = DriverPool.getInstance().getDriver(Thread.currentThread().getId());

        try {
            takeSnapShot(webDriver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            DriverPool.getInstance().closeDriver(Thread.currentThread().getId());
        }

    }

    private void takeSnapShot(WebDriver webdriver) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File( System.getProperty("user.dir")+"/logs/result.png"));
    }

}
