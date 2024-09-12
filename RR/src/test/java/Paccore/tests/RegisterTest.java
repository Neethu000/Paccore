package Paccore.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Paccore.pageobjects.RegisterPage;


public class RegisterTest extends Paccore.pageobjects.BaseTests{
	
	RegisterPage rp;
	
	@Test
	public void register() throws IOException {
		driver = initializeDriver();
		goTo();
		rp = new RegisterPage(driver);
		rp.rigisterButton();
		
		String expectedText = "Choose your\n"
				+ "subscription Plan";
	    String actualText = rp.choosepagetext();
		Assert.assertEquals(actualText, expectedText, "chooseplan page does not match.");
		System.out.println("ClickOnRegisterNowButtonDisplaying :"+" "+ actualText);
		
		rp.planselection();
	    rp.continuebutton();	
	}
	
	@Test(dataProvider="getData",dependsOnMethods = {"register"})
	public void register1(HashMap<String,String>input){
		rp = new RegisterPage(driver);
		
		String expectedText = "Register\n"
				+ "to Real Returns.ai";
	    String actualText = rp.registertext();
		Assert.assertEquals(actualText, expectedText, "register page does not match.");
		System.out.println("ClickOnChoosePlan&ContineButtonDisplaying :"+" "+ actualText);
		
		rp.registerprocess(input.get("first"),input.get("last"),input.get("number"),input.get("email1"),input.get("pswd1"),input.get("pswd2"));
	}
	
	@Test(dependsOnMethods = {"register1"})
	public void afterregistergettext() {
		rp = new RegisterPage(driver);
		rp.registerbutton();
		
		String expectedText = "user is created successfully and a Verification link is send to your register email";
	    String actualText = rp.registerbutton();
		Assert.assertEquals(actualText, expectedText, "User registration failed");
		System.out.println("ClickOnRegisterNowButtonDisplaying :"+" "+ actualText);
	
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
	    List<HashMap<String,String>> data= getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//Paccore//data//Register.json");
	    return new Object[][] {{data.get(0)}};
	   
	}
	
	
}
	
	
