package TestNG.AnnotationInTestNG;

import org.testng.annotations.*;

public class LoginPage {

    @Test
    public void ValidUserNameAndPass(){

        System.out.println("I Entered a valid username and pass");

    }
    @Test
    public void WrongUserNameAndValidPass(){

        System.out.println("I Entered an Invalid username and a valid pass");

    }

    @Test
    public void InvalidUserNameAndPass(){

        System.out.println("I Entered a Invalid username and pass");

    }






    @BeforeTest
    public void Beforetest(){

        System.out.println("I execute before test "+
                "---------------");


    }

    @AfterTest
    public void Aftertest(){

        System.out.println("I execute after test "+
                "---------------");


    }


}
