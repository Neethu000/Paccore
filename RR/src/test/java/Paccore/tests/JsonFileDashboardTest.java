package Paccore.tests;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import Paccore.data.UserData;
import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.JsonFileDashboardPage;


public class JsonFileDashboardTest extends BaseTests {
	
	 WebDriver driver;
	 JsonFileDashboardPage dashboardPage;
	 UserData userData;

	   @Test
	    public void setUp() throws IOException {
		    dashboardPage = new JsonFileDashboardPage(driver);
	   
	        // Read JSON data (username, email, phone) from data.json
	        Gson gson = new Gson();// Make sure to instantiate Gson properly
	        FileReader reader = new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\RR\\src\\test\\java\\Paccore\\data\\propremium.json");
	        userData = gson.fromJson(reader, UserData.class);// This maps the JSON file to the UserData object
	        reader.close();
	    }

	    @Test
	    public void getUserProfileDetails() {
	    	
	    	dashboardPage.verifyUserInformationIsDisplayed();
	    	
	        // Get values from the web application using getText()
	    	String actualUsername = dashboardPage.getUsernameText();
	        String actualEmail = dashboardPage.getEmailText();
	        String actualPhone = dashboardPage.getPhoneText();
	        
	        // Compare the values from the application with JSON data
	        Assert.assertEquals(actualUsername, userData.getName(), "Username mismatch!");
	        Assert.assertEquals(actualEmail, userData.getMail(), "Email mismatch!");
	        Assert.assertEquals(actualPhone, userData.getPhone(), "Phone number mismatch!");
	        
	    }

	
	
	
}
