package Base;

import org.apache.commons.io.FileUtils;
import org.asynchttpclient.util.HttpConstants;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {

    static int number=0;
    int sum=0;
    WebDriver driver;

    public static String currentDir = System.getProperty("user.dir");
    public static Properties loadProperties(){

        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(currentDir + "/config.properties");
            properties.load(fis);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    Properties prop = loadProperties();

    String Url = prop.getProperty("URL","");

    String UserName = prop.getProperty("UserName", "standard_user");

    String Password = prop.getProperty("Password", "secret_sauce");

    String maximizeBrowser = prop.getProperty("maximize.browser", "true");

    String takeScreenshot = prop.getProperty("take.screenshot", "false");

    String takeScreenshot2 = prop.getProperty("take.screenshot2", "false");

    String duration = prop.getProperty("implicit.wait", "10");



    public void takeScreenshot(String screenshotName) {
        DateFormat df = new SimpleDateFormat("MMddyyyyHHmma");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\screenshots1\\" + screenshotName + " " + df.format(date) + ".jpeg"));
            // LOG.info("Screenshot captured");
        } catch (Exception e) {
            String path = currentDir + "/screenshotsFailedTests/" + screenshotName + " " + df.format(date) + ".jpeg";
            // LOG.info("Exception while taking screenshot " + e.getMessage());
        }
    }


    public void afterEachTestMethod(ITestResult result) {
        if (takeScreenshot.equalsIgnoreCase("true"))
            if (result.getStatus() == ITestResult.FAILURE) {
                takeScreenshot(result.getName());
            }

    }


    public void takePicture(String name) {

        if(takeScreenshot2.equalsIgnoreCase("true")){
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("screenshots/screenshot "+name+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}

    /*

    public void captureScreenshot() {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("screenshots/screenshot "+sum+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    */
}
