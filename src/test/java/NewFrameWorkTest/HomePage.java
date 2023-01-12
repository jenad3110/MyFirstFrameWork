package NewFrameWorkTest;
import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.SkipException;
import org.testng.annotations.Test;


    public class HomePage extends CommonAPI {



        @Test(enabled = false)
        public void firstTest(){
            getDriver().findElement(By.id("hahaha")).click();
            System.out.println("first test");

        }




        //@Test
        public void backPack(){
            getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        }

        //@FindBy(id= "add-to-cart-sauce-labs-backpack")
        @Test(enabled = true)
        public void clickOnAddCart(By by) {

            getDriver().findElement(by).click();

        }


        @Test(enabled = false)
        public void skippedTest(){

            int a = 5,b=6;

            if(a<b) {
                throw new SkipException("Skipping test in TestNG");

            }

        }








    }

