package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	WebDriver driver;
	public LogOutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(css="input[placeholder=\"Enter Your Email\"]")
	    WebElement userEmail;
		
		@FindBy(xpath="//input[@placeholder=\"Password\"]")
	    WebElement passwordelement;
		
		@FindBy(xpath="//button[text()='Sign In']")
	    WebElement signin;
		
		public void LogOutApplication(String email, String password)
		{
			userEmail.sendKeys(email);
			passwordelement.sendKeys(password);
			signin.click();
			//dropdown.click();
			//logout.click();
			
		}
	
		@FindBy(xpath="//h3[contains(text(),'Dashboard')]")
	    WebElement dashboard;
		
		public String dashboardIsDisplay() 
		{
			return dashboard.getText();
		}
	
		@FindBy(css=".nav-link.dropdown-toggle.p-0.ps-2")
		WebElement dropdown;
	
		@FindBy(linkText="Logout")
		WebElement logout;
		
        public void LogOutApplication1() 
        {
			dropdown.click();
		 	logout.click();
	    }
		
		@FindBy(xpath="//h3[contains(text(),'Sign In')]")
		WebElement afterlogout;
		
		public String AfterLogOutDisplayingSignIn() 
		{
			return afterlogout.getText();
		}

		
		
		
	
}
