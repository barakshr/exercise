package org.exercise.framework.selenium.properties;






import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.exercise.framework.selenium.BrowserType;

public class PropertiesHandler {

    public static void readProperties() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("globalconfig.properties");
        properties.load(inputStream);
        Settings.AUTConnectionString = properties.getProperty("AUTConnectionString");
        Settings.ReportingConnectionString = properties.getProperty("ReportingConnectionString");
        Settings.LogPath = properties.getProperty("LogPath");
        Settings.DriverType = properties.getProperty("DriverType");
        Settings.ExcelSheetPath = properties.getProperty("ExcelSheetPath");
        Settings.AUT = properties.getProperty("AUT");
        Settings.BrowserType = BrowserType.valueOf(properties.getProperty("Browser"));
        Settings.DataFilePath = properties.getProperty("DataFilePath") ;
    }
}
