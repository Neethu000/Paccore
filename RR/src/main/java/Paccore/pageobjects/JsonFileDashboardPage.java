package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JsonFileDashboardPage {
	
    WebDriver driver;
	
	public JsonFileDashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h5[contains(text(),'User Information')]")
    WebElement userinformation;
	
	public String UserInformation() {
		return userinformation.getText();
	}
	
	public void verifyUserInformationIsDisplayed() 
	{
		String expectedTitle = "User Information";
	    String actualTitle = UserInformation();
	    Assert.assertEquals(actualTitle, expectedTitle, "UserInformation does not match.");
		System.out.println("In Dashboard Displayed :"+" "+actualTitle);
	}
	
//user name
	
	@FindBy(xpath="(//div[@class='col-8 user__titile1'])[1]")
	WebElement nameField;
	
	public String getUsernameText() {
        return nameField.getText();
    }
	
    @FindBy(xpath="(//div[@class='col-8 user__titile1'])[2]")
	WebElement emailField;
    
    public String getEmailText() {
        return emailField.getText();
    }
	
	@FindBy(xpath="(//div[@class='col-8 user__titile1'])[3]")
	WebElement phonenumberField;
	
	public String getPhoneText() {
	    return phonenumberField.getText();
	}
	

	

	
	
	
	
}
