package TestNG.DataProviderTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderTest  {


    @DataProvider
    public Object[][] myData(){


        Object [][] data = new Object [1][2];
        data [0][0]= "standard_user";
        data [0][1]= "secret_sauce";
/*
        data [1][0]= "problem_user"; // different but valid username
        data [1][1]= "secret_sauce";

        data [2][0]= "user"; // invalid user
        data [2][1]= "secret_sauce";

        data [3][0]= "locked_out_user";
        data [3][1]= "secret_sauce00";  // invalid pass
*/

        return data;
    }



    @Test(dataProvider = "myData")
    public void testingLoginFunction(String UserName,String Password){

        SoftAssert softassert = new SoftAssert();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
       softassert.assertEquals("Swag Labs","Swag Labs");
        driver.findElement(By.id("user-name")).sendKeys(UserName);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        softassert.assertAll();

    }


}
