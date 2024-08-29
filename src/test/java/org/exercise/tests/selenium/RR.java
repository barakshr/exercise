package org.exercise.tests.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class RR {
    @Test
    public void testName() {
        Logger logger=  LogManager.getLogger(this.getClass());
        logger.info("2");
        logger.info("3");
    }
}
