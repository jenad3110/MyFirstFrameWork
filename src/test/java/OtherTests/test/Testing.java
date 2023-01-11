package OtherTests.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class Testing {

        WebDriver driver;

        @Test
        public void test1()  {


            driver.navigate().to("https://www.amazon.com/");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#gh-search-input")).sendKeys("TV 55' ");
            driver.findElement(By.cssSelector("#shop-header-23219647 > div > div.header-hamburger > header > div.top-fluid-container > div > div.shop-search-bar > div > form > button.header-search-button > span > svg")).click();



        }

        @AfterMethod
        public void afterTest()
        {

            driver.close();

        }




}
