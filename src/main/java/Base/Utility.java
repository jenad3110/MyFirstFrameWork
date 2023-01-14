package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {

    public static String currentDir = System.getProperty("user.dir");
    WebDriver driver;
    Properties prop = loadProperties();

    String setUrl = prop.getProperty("set.url", "false");
    String Url = prop.getProperty("URL", "https://www.saucedemo.com/");
    String UserName = prop.getProperty("UserName", "standard_user");
    String Password = prop.getProperty("Password", "secret_sauce");
    String maximizeBrowser = prop.getProperty("maximize.browser", "true");
    String takeScreenshot = prop.getProperty("take.screenshot", "false");
    String takeScreenshot2 = prop.getProperty("take.screenshot2", "false");
    String takeScreenshot3 = prop.getProperty("take.screenshot3", "false");
    String duration = prop.getProperty("implicit.wait", "10");

    public static Properties loadProperties() {

        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(currentDir + "/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


    public void ScreenShot(ITestResult result) {

        String name = result.getName();

        DateFormat df = new SimpleDateFormat("MMddyyyyHHmma");
        Date date = new Date();
        df.format(date);
        File file;
        if (takeScreenshot.equalsIgnoreCase("true"))
            if (result.getStatus() == ITestResult.FAILURE) {
                file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\screenshots\\screenshotsFailedTest\\ " + name + " " + df.format(date) + ".jpeg"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            } else if (takeScreenshot2.equalsIgnoreCase("true"))
                if (result.getStatus() == ITestResult.SUCCESS) {
                    file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                    try {
                        FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\screenshots\\screenshotsPassedTest\\ " + name + " " + df.format(date) + ".jpeg"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                } else if (takeScreenshot3.equalsIgnoreCase("true"))
                    if (result.getStatus() == ITestResult.SKIP) {
                        file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                        try {
                            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\screenshots\\screenshotsSkippedTest\\ " + name + " " + df.format(date) + ".jpeg"));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }

    }


}


