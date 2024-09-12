package Paccore.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Paccore.pageobjects.ErrorValidationsPage;



public class ErrorValidationsTest extends Paccore.pageobjects.BaseTests{

	@Test(groups= {"ErrorHandling"})
    public void error() throws IOException {
		//lanchApplication();
		driver = initializeDriver();
		goTo();
		ErrorValidationsPage lp= new ErrorValidationsPage(driver);
	    lp.getErrorText("absk777@gmail.com","Real.13");
	    
	    String expectedTitle = "Incorrect username or password. Please try again or you can reset your password.";
        String actualTitle= lp.errorText();
        Assert.assertEquals(actualTitle, expectedTitle, "given wrong credentials but signin successfully.");
        System.out.println("Error is displayed :"+" "+actualTitle);
	    

	   
	}
	
	

}
