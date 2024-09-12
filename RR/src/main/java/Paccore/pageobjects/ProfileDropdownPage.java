package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfileDropdownPage {
	
	WebDriver driver;
	public ProfileDropdownPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

//TC-12 Checking the display and navigation of the profile icon dropdown(My Profile)
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle p-0 ps-2']")
	WebElement profile;
	
	public void verifyMyProfileDropdownclick() {
		profile.click();	
	}
	
	@FindBy(linkText="My Profile")
	WebElement myprofile;
	
	public void verifytheclickonMyprofile() {
		    myprofile.click();	
	}
	
	@FindBy(xpath="//h4[contains(text(),'My Profile')]")
    WebElement profilepage;
	
	public String verifythemyprofilepagegetText() {
		return profilepage.getText();
	}
	
	public void verifyinDropdownclickMyprofilethenMyprofilePageIsDisplayed() 
	{
		String expectedTitle = "My Profile";
	    String actualTitle = verifythemyprofilepagegetText();
	    Assert.assertEquals(actualTitle, expectedTitle, "My Profile page not displayed");
		System.out.println("Click on My profile in dropdown then displayed page is :"+" "+actualTitle);
	}
	
//TC-13 Checking the display and navigation of the profile icon dropdown(FAQ's) 
	
	@FindBy(linkText="FAQ'S")
	WebElement faqs;
	
	public void verifyclickonFAQs() {
		faqs.click();
	}
	
	@FindBy(xpath="(//h5[contains(text(),'test question')])[1]")
    WebElement faqspage;
	
	public String verifytheclickonFAQsgetTest() {
		return faqspage.getText();	
	}
	
	public void verifyinDropdownclickOnFAQsthenFAQsPageIsDisplayed() 
	{
		String expectedTitle = "TEST QUESTION";
	    String actualTitle = verifytheclickonFAQsgetTest();
	    Assert.assertEquals(actualTitle, expectedTitle, "FAQ'S page not displayed");
		System.out.println("Click on faqs in dropdown then displayed page is :"+" "+actualTitle);
	}
	
//TC-14 Checking the display and navigation of the profile icon dropdown(Manage Payment) 
	
	@FindBy(linkText ="Manage Payments")
	WebElement managepayment;
	
	public boolean ManagePaymentisdisplayed() {
		
		{	
			try {            
				return managepayment.isDisplayed();     
				 }
				 catch (Exception e) 
			    { 
				return false; 
				}	
		}
	}
	
	public void verifyManagePaymentisdisplayed() {
		
		boolean isDisplayed = ManagePaymentisdisplayed();             
		Assert.assertTrue(isDisplayed,"In Dropdown ManagePayment option should not be displayed");
		System.out.println("In Dropdown ManagePayment option should be displayed");
	}

	public boolean verifyManagePaymentFunctionaliy() {
		managepayment.click();
		return false ;
	}
	
    public void verifyManagePaymentExpectedfunctionality() {
		
		boolean isDisplayed = verifyManagePaymentFunctionaliy();             
		Assert.assertTrue(isDisplayed,"The expected ManagePayment functionality did not occur");
		System.out.println("In Dropdown clicking on ManagePayment : The expected functionality is displayed");
	}
    
//TC-15 Checking the display and navigation of the profile icon dropdown(Account Settings)
    
    @FindBy(linkText ="Account Settings")
	WebElement accountsettings;
	
	public boolean AccountSettingsisdisplayed() {
		
		{	
			try {            
				return accountsettings.isDisplayed();     
				 }
				 catch (Exception e) 
			    { 
				return false; 
				}	
		}
	}
	
	public void verifyAccountSettingsisdisplayed() {
		
		boolean isDisplayed = ManagePaymentisdisplayed();             
		Assert.assertTrue(isDisplayed,"In Dropdown AccountSettings option should not be displayed");
		System.out.println("In Dropdown AccountSettings option should be displayed");
	}
	
	public boolean verifyAccountSettingsFunctionaliy() {
		termsconditions.click();
		return false ;
	}
	
    public void verifyAccountSettingsExpectedfunctionality() {
		
		boolean isDisplayed = verifyTermsConditionsFunctionaliy();             
		Assert.assertTrue(isDisplayed,"The expected AccountSettings functionality did not occur");
		System.out.println("In Dropdown clicking on AccountSettings  : The expected functionality is displayed");
	}
	
//TC-16 Checking the display and navigation of the profile icon dropdown(Terms & Conditions)
    
    @FindBy(linkText ="Terms & Conditions")
	WebElement termsconditions;
	
	public boolean TermsConditionsisdisplayed() {
		
		{	
			try {            
				return termsconditions.isDisplayed();     
				 }
				 catch (Exception e) 
			    { 
				return false; 
				}	
		}
	}
	
	public void verifyTermsConditionsisdisplayed() {
		
		boolean isDisplayed = TermsConditionsisdisplayed();             
		Assert.assertTrue(isDisplayed,"In Dropdown TermsConditions option should not be displayed");
		System.out.println("In Dropdown TermsConditions option should be displayed");
	}

	public boolean verifyTermsConditionsFunctionaliy() {
		termsconditions.click();
		return false ;
	}
	
    public void verifyTermsConditionsExpectedfunctionality() {
		
		boolean isDisplayed = verifyTermsConditionsFunctionaliy();             
		Assert.assertTrue(isDisplayed,"The expected TermsConditions functionality did not occur");
		System.out.println("In Dropdown clicking on TermsConditions  : The expected functionality is displayed");
	}
    
//TC-17 Checking the display and navigation of the profile icon dropdown(Privacy Policy)
    
    @FindBy(linkText ="Privacy Policy")
	WebElement privacypolicy;
	
	public boolean PrivacyPolicyisdisplayed() {
		
		{	
			try {            
				return privacypolicy.isDisplayed();     
				 }
				 catch (Exception e) 
			    { 
				return false; 
				}	
		}
	}
	
	public void verifyPrivacyPolicyisdisplayed() {
		
		boolean isDisplayed = TermsConditionsisdisplayed();             
		Assert.assertTrue(isDisplayed,"In Dropdown PrivacyPolicy option should not be displayed");
		System.out.println("In Dropdown PrivacyPolicy option should be displayed");
	}

	public boolean verifyPrivacyPolicyFunctionaliy() {
		privacypolicy.click();
		return false ;
	}
	
    public void verifyPrivacyPolicyExpectedfunctionality() {
		
		boolean isDisplayed = verifyTermsConditionsFunctionaliy();             
		Assert.assertTrue(isDisplayed,"The expected PrivacyPolicy functionality did not occur");
		System.out.println("In Dropdown clicking on PrivacyPolicy  : The expected functionality is displayed");
	}
    
	
}
