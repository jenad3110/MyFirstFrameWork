package OtherTests.TestNG.GroupsInTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {

    @Test(groups ={"e2e","regression"})
    public void ClickOnMenu(){

        System.out.println("I clicked on menu");

    }


    @Test(groups ={"e2e","regression"})
    public void ClickOnChatLogo(){

        System.out.println("I clicked on chat");

    }
    @Test(groups ={"sanity","e2e","regression"})
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
