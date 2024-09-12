package Paccore.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.LogOutPage;

public class LogOutTest extends BaseTests{
	
	LogOutPage lop;

	@Test()
	public void dashboard() throws IOException {
		//lanchApplication();
		driver = initializeDriver();
		goTo();
		lop= new LogOutPage(driver);
	    lop.LogOutApplication("abskbbl96@gmail.com","Real.123");
	    
	    String expectedTitle = "Dashboard";
	    String actualTitle = lop.dashboardIsDisplay();
	    Assert.assertEquals(actualTitle, expectedTitle, "Dashboard title does not match.");
		System.out.println("Displayed :"+" "+actualTitle);
		
      }
	
	@Test(dependsOnMethods = {"dashboard"})
	public void logout() 
	{
		lop= new LogOutPage(driver);
	    lop.LogOutApplication1();
	    
		String expectedText = "Sign In\n"
				+ "to Real Returns.ai";
	    String actualText = lop.AfterLogOutDisplayingSignIn();
	    Assert.assertEquals(actualText, expectedText, "signin page does not match.");
		System.out.println("Displayed :"+" "+ actualText);
		
	}
	

	
	
}
