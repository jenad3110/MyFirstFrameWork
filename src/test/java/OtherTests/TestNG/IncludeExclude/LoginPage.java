package OtherTests.TestNG.IncludeExclude;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

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




    @BeforeSuite

    public void BeforeSuite(){

        System.out.println("I execute before suite");

    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("I execute after suite");

    }


}
