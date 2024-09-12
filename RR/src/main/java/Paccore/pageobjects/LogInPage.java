package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	WebDriver driver;
	public LogInPage(WebDriver driver)
	{
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css="input[placeholder=\"Enter Your Email\"]")
    WebElement userEmail;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
    WebElement passwordelement;
	
	@FindBy(xpath="//button[text()='Sign In']")
    WebElement signin;
	
	public void LoginApplication(String email, String password)
	{
		userEmail.sendKeys(email);
		passwordelement.sendKeys(password);
		signin.click();
	}
	
	@FindBy(xpath="//h3[contains(text(),'Dashboard')]")
    WebElement dashboard;
	
	public String dashboardIsDisplay() 
	{
		return dashboard.getText();
	}
	

	
}

