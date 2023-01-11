package NewFrameWorkTest;

import Base.CommonAPI;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {



    @Test
    public void firstTest(){

        getDriver().findElement(By.id("hahaha")).click();
        System.out.println("first test");




    }


//    @Test
//    public void ClickOnBackPack()
//    {
//
//        System.out.println("second test");
//
//
//
//    }


}
