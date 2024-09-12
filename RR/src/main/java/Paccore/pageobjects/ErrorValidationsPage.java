package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorValidationsPage {

	WebDriver driver;
	public ErrorValidationsPage(WebDriver driver)
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

	public void getErrorText(String email, String password) 
	{
		userEmail.sendKeys(email);
		passwordelement.sendKeys(password);
		signin.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'Incorrect username or password. Please try again o')]")
    WebElement errorMessage;
	
	public  String errorText() {
		return errorMessage.getText();
	}
}
