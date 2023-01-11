package OtherTests.TestNG.IncludeExclude;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {

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

}
