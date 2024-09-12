package Paccore.pageobjects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	WebDriver driver;
	WebDriver wait;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className="btn-secondary")
	WebElement registerbutton;
	
	public void rigisterButton() {
		registerbutton.click();
	}
	
	@FindBy(xpath="//h3[@class='card-text']")
	WebElement afterregistebuttonrgettext;
	public String choosepagetext()
	{
		return afterregistebuttonrgettext.getText();
	}
	
	@FindBy(xpath="(//div[@id='sub3'])")
	WebElement planselecting;
	public void planselection()
	{
		int maxclicks=3;
		for(int attempts=0; attempts<maxclicks ; attempts++)
		{
			try {
				planselecting.click();
				break;
			    }catch(ElementClickInterceptedException e){}
		}
	}
	
	@FindBy(xpath="//button[@value='Send OTP']")
	WebElement chooseplancontinue;
	
	public void continuebutton( )
	{
		int maxclicks=3;
		for(int attempts=0; attempts<maxclicks ; attempts++)
		{
			try {
				chooseplancontinue.click();
				break;
			}catch(ElementClickInterceptedException e){}
		}
	}
	
	@FindBy(xpath="//h3[@class='card-text']")
	WebElement afterplanselectiongettext;
	
	public String registertext()
	{
		return afterplanselectiongettext.getText();
	}
	
	@FindBy(id="first_name")
	WebElement fistname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(id="phone")
	WebElement phonenumber;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password-field1")
	WebElement password1;
	
	@FindBy(id="password-field")
	WebElement password2;
	
	@FindBy(id="text1")
	WebElement selectroledropdown;
	
	@FindBy(xpath="//option[@value='8']")
	WebElement selectingrole;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	public void registerprocess(String first,String last,String number,String email1,String pswd1,String pswd2)
	{
		fistname.sendKeys(first);
		lastname.sendKeys(last);
		phonenumber.sendKeys(number);
		email.sendKeys(email1);
		password1.sendKeys(pswd1);
		password2.sendKeys(pswd2);
		selectroledropdown.click();
		selectingrole.click();
		checkbox.click();
	}
	
	@FindBy(xpath="//button[@value='Send OTP']")
	WebElement Registerbutton;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement Afterrefistergettext;
	
	public String registerbutton() 
	{
		int maxclicks=3;
		for(int attempts=0; attempts<maxclicks ; attempts++)
		{
			try {
				Registerbutton.click();
				break;

			}catch(ElementClickInterceptedException e){}	
		}
		return Afterrefistergettext.getText();
	}
	
}

