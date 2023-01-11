package TestNG.AnnotationInTestNG;

import org.testng.annotations.*;

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


    @BeforeSuite

    public void BeforeSuite(){

        System.out.println("I execute before suite");

    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("I execute after suite");

    }

}
