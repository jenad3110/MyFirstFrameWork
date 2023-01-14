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
    String Url = prop.getProperty("URL", "");
    String UserName = prop.getProperty("UserName", "standard_user");
    String Password = prop.getProperty("Password", "secret_sauce");
    String maximizeBrowser = prop.getProperty("maximize.browser", "true");
    String takeScreenshot = prop.getProperty("take.screenshot", "false");
    String takeScreenshot2 = prop.getProperty("take.screenshot2", "false");
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

    public void takeScreenshot(String screenshotName) {
        DateFormat df = new SimpleDateFormat("MMddyyyyHHmma");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\screenshots\\" + screenshotName + " " + df.format(date) + ".jpeg"));
            // LOG.info("Screenshot captured");
        } catch (Exception e) {
            String path = currentDir + "/screenshots/" + screenshotName + " " + df.format(date) + ".jpeg";
            // LOG.info("Exception while taking screenshot " + e.getMessage());
        }
    }

    public void takePicture(String name) {

        DateFormat df = new SimpleDateFormat("MMddyyyyHHmma");
        Date date = new Date();
        df.format(date);

        if (takeScreenshot2.equalsIgnoreCase("true")) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\screenshotsPassedtests\\ " + name + " " + df.format(date) + ".jpeg"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    public void screenShotAfterEachTestMethod(ITestResult result) {
        if (takeScreenshot.equalsIgnoreCase("true"))
            if (result.getStatus() == ITestResult.FAILURE) {
                takeScreenshot(result.getName());
            } else if (result.getStatus() == ITestResult.SUCCESS) {
                takePicture(result.getName());
            }


    }


}