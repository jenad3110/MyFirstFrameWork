package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.Duration;


public class CommonAPI extends Utility {


   // WebDriver driver;

    public WebDriver getDriver() {

        return driver;
    }


    @Parameters({"browser"})
    @BeforeMethod
    public void SetUp(String browser)  {
        if(browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();}

        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(duration)));
        if (maximizeBrowser.equalsIgnoreCase("true")){
            driver.manage().window().maximize();
        }

        driver.findElement(By.id("user-name")).sendKeys(UserName);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.name("login-button")).click();

    }


    @AfterMethod
    public void tearDown(Method method,ITestResult result)
    {
        afterEachTestMethod(result);
        takePicture(method.getName());
        driver.quit();
    }




    @BeforeSuite

    public void BeforeSuite(){

        System.out.println("I execute before suite");

    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("I execute after suite");

    }







}
