package TestNG.ParameterizedRunner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HomePage {


    @Parameters({"url","username","password"})
        @Test
    public void TestUrl(String url2,String username2,String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url2);

        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys(username2);
        driver.findElement(By.id("pass")).sendKeys(password);
        Thread.sleep(1000);
    }
/*
    @Test
    public void ClickOnMenu(){

        System.out.println("I clicked on menu");

    }


    @Test
    public void ClickOnChatLogo(){

        System.out.println("I clicked on chat");

    }
    @Test
    public void ClickOnAddNewStory(){

        System.out.println("I clicked on add new story");


    }

    @BeforeTest
    public void Beforetest(){

        System.out.println("I execute before test ");


    }

    @AfterTest
    public void Aftertest(){

        System.out.println("I execute after test ");


    }

 */

}
