package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardHeaderMenuOptionsPage {

    WebDriver driver;
	
	public DashboardHeaderMenuOptionsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//Header menu Dashboard option
	
	@FindBy(linkText = "Dashboard")
	WebElement dashboard;
			
	public String dashboardOptionOnHeaderMenu() {
		return dashboard.getText();
	}
			
	public void verifyiftheDashboardOptionisDisplayedintheHeaderMenu()
	  {
	       String expectedTitle = "Dashboard";
	       String actualTitle = dashboardOptionOnHeaderMenu();
	       Assert.assertEquals(actualTitle, expectedTitle, "Dashboard is does not match.");
	       System.out.println("In HomePage Header Menu is Displayed :"+" "+actualTitle);	
	  }
			
//Header menu Investment Analysis dropdown option
			
	@FindBy(linkText = "Investment Analysis")
	WebElement investmentanalysis;
			
	public String investmentanalysisOptionOnHeaderMenu() {
		return investmentanalysis.getText();
	}
			
	public void verifyiftheInvestmentAnalysisOptionisDisplayedintheHeaderMenu()
		{
			String expectedTitle = "Investment Analysis";
			String actualTitle = investmentanalysisOptionOnHeaderMenu();
			Assert.assertEquals(actualTitle, expectedTitle, "InvestmentAnalysis is does not match.");
			System.out.println("In HomePage Header Menu is Displayed :"+" "+actualTitle);	
		}
			
//Header menu MyReports dropdown option		
			
	@FindBy(linkText = "My Reports")
	WebElement myreports;
			
	public String myreportsOptionOnHeaderMenu() {
		return myreports.getText();
	}
			
	public void verifyiftheMyReportsOptionisDisplayedintheHeaderMenu()
		{
		   String expectedTitle = "My Reports";
		   String actualTitle = myreportsOptionOnHeaderMenu();
		   Assert.assertEquals(actualTitle, expectedTitle, "My Reports is does not match.");
		   System.out.println("In HomePage Header Menu is Displayed :"+" "+actualTitle);	
		}
			
//Header menu dark and light theme option		
			
	@FindBy(xpath="//li[@class='nav-item web-view d-flex gap-3 mt-lg-2 mt-1']")
	WebElement theme;
			
	public boolean symbolsforLightAndDarkModeIsdisplayed()
		{	
			try {            
			return theme.isDisplayed();     
				}
			catch (Exception e) 
			    { 
				return false; 
				}	
		}
		        
	public void verifyThemeSymbolisDisplayed() {
		boolean isDisplayed = symbolsforLightAndDarkModeIsdisplayed();             
		Assert.assertTrue(isDisplayed,"Theme symbol should not be displayed");
		System.out.println("In HomePage Header Menu Theme symbol should be displayed");
	}
				
	public void verifytheThemeFunctionality() {
		theme.click();
	}
			
//Header menu setting icon option 
			
	@FindBy(xpath="(//a[@class='nav-link'])[1]")
	WebElement settings;
		
	public boolean SettingsSymbolisdisplayed()
	     {	
			try {            
			return settings.isDisplayed();     
				}
			catch (Exception e) 
				{ 
			return false; 
				}	
		 }
	        
	public void verifySettingsSymbolisDisplayed() {
	  boolean isDisplayed = SettingsSymbolisdisplayed();             
	  Assert.assertTrue(isDisplayed,"The expected Notification functionality did not occur");
	  System.out.println("In HomePage Header Menu Settings symbol should be displayed");
	}
			
	public boolean verifySettingsFunctionality() {
		settings.click();
		return false;
	}
			
	public void verifySettingsExpectedFunctionality() {
		boolean isDisplayed = verifySettingsFunctionality();             
		Assert.assertTrue(isDisplayed,"The expected Settings functionality did not occur");
		System.out.println("clicking on settings : The expected functionality is displayed");
	}
	
//Header menu notification(bell) icon option
			
	@FindBy(xpath="(//a[@class='nav-link'])[2]")
	WebElement bellicon;
			
	public boolean NotificationSymbolisdisplayed() {
		{	
			try {            
			return bellicon.isDisplayed();     
				}
			catch (Exception e) 
			    { 
			return false; 
				}	
		}
	}
			
	public void verifyNotificationSymbolisdisplayed() {
		boolean isDisplayed = NotificationSymbolisdisplayed();             
		Assert.assertTrue(isDisplayed,"Notification symbol should not be displayed");
		System.out.println("In HomePage Header Menu Notification symbol should be displayed");
	}

	public boolean verifyNotificationFunctionaliy() {
		bellicon.click();
		return false ;
	}
	
	public void verifyNotificationExpectedfunctionality() {
		boolean isDisplayed = verifyNotificationFunctionaliy();             
		Assert.assertTrue(isDisplayed,"The expected Notification functionality did not occur");
		System.out.println("clicking on notification : The expected functionality is displayed");
	}
			
			
//Header menu profile icon option
			
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle p-0 ps-2']")
		WebElement profile;
			
	public boolean ProfileIconisdisplayed() {		
		{	
			try {            
			return profile.isDisplayed();     
				}
			catch (Exception e) 
				{ 
			return false; 
				}	
				}
		}	
	
     public void verifyProfileIconisdisplayed() {
		 boolean isDisplayed = ProfileIconisdisplayed();             
	     Assert.assertTrue(isDisplayed,"Profile symbol should not be displayed");
		 System.out.println("In HomePage Header Menu Profile symbol should be displayed");
	 } 
     
	     public boolean verifyProfileDropdown() {
	     profile.click();
		 return true ;
	 }
	     
	 public void verifyProfileDropdownisDisplay() {
		 boolean isDisplayed = verifyProfileDropdown();             
		 Assert.assertTrue(isDisplayed,"Dropdown should not be displayed");
		 System.out.println("In HomePage Header Menu Profile Dropdown should be displayed");
	 } 
	
	
}
