package Paccore.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Paccore.pageobjects.LogInPage;



public class LogInTest extends Paccore.pageobjects.BaseTests{

	@Test(dataProvider="getData")
    public void signin(HashMap<String,String>input) throws IOException {
		//lanchApplication();
		driver = initializeDriver();
		goTo();
		LogInPage lp= new LogInPage(driver);
	    lp.LoginApplication(input.get("email"),input.get("password"));
	  
	    String expectedTitle = "Dashboard";
	    String actualTitle = lp.dashboardIsDisplay();
	    Assert.assertEquals(actualTitle, expectedTitle, "Dashboard does not match.");
		System.out.println("Displayed :"+" "+actualTitle);

	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String,String>> data = getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//Paccore//data//logIn.json");
		return new Object[][] {{data.get(0)}};
	}
	
	
	
	

}
