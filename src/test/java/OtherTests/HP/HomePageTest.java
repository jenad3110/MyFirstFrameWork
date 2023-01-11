package OtherTests.HP;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends CommonAPI {



    @Test(priority = 1)
    public void faceBookLogo(){


        WebElement Logo = getDriver().findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

        Assert.assertTrue(Logo.isDisplayed());

        System.out.println("test passed");
    }

    @Test(priority = 2)
    public void facebookPageTitle(){

        SoftAssert softAssert = new SoftAssert();

        String Title = "Facebook - log in or sign up";

        softAssert.assertEquals(Title,"Facehaha - log in or sign up");

        System.out.println("test passed");

    }

    @Test(priority = 3)
    public void facebookPageTitle2(){

        SoftAssert softAssert = new SoftAssert();

        String Title = "Facebook - log in or sign up";

        softAssert.assertEquals(Title,"Faceboo - log in or sign up");

        System.out.println("test passed");
        softAssert.assertAll();
        System.out.println("test 2 passed");
    }










}
