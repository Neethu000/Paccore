package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardFunctionalityPage {
	
	WebDriver driver;
	public DashboardFunctionalityPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

//TC-10 Verify the user Checking the display and navigation of the "Investment Analysis" dropdown.
//Investment dropdown
	
	@FindBy(linkText = "Investment Analysis")
	WebElement investmentanalysis;
	
	public void verifytheinvestmentdropdownClicking() {
		investmentanalysis.click();
	}

//Commercial dropdown
	
	@FindBy(linkText = "Commercial")
	WebElement commercialclick;
	
	public void verifyindropdownCommercialClicking() {
		commercialclick.click();
	}
	
// DSCR
	
	@FindBy(linkText = "DSCR")
	WebElement dscrclick;
	
	public void verifyinCommercialclickandthenDSCRClicking() {
		dscrclick.click();
	}
	
	@FindBy(xpath="//h4[contains(text(),'Debt Service Coverage Ratio (DSCR) Analysis')]")
	WebElement dscrScreen;
	
	public String verifyafterclickonDSCRandgetText() {
		return dscrScreen.getText();
	}
	
	public void verifyAfterclickOnDSCRDispayedDSCRReportCreationPage()
	{
		String expectedTitle = "Debt Service Coverage Ratio (DSCR) Analysis";
	    String actualTitle = verifyafterclickonDSCRandgetText();
	    Assert.assertEquals(actualTitle, expectedTitle, "DSCR page not displayed");
		System.out.println("Click on commercial then displayed :"+" "+actualTitle);
		driver.navigate().back();
	}

// ROI
	
	@FindBy(linkText = "ROI")
	WebElement roiclick;
	
	public void verifyinCommercialclickandthenROIClicking() {
		roiclick.click();
	}
	
	@FindBy(xpath="//h4[contains(text(),'COMMERCIAL INVESTMENT ANALYSIS (ROI)')]")
	WebElement roiScreen;
	
	public String verifyafterclickonROIgetText() {
		return roiScreen.getText();
	}
	
	public void verifyAfterclickOnROIDispayedROIReportCreationPage()
	{
		String expectedTitle = "COMMERCIAL INVESTMENT ANALYSIS (ROI)";
	    String actualTitle = verifyafterclickonROIgetText();
	    Assert.assertEquals(actualTitle, expectedTitle, "ROI page not displayed");
		System.out.println("Click on commercial then displayed :"+" "+actualTitle);
		driver.navigate().back();
	}
	
// Residential
	
	   @FindBy(linkText = "Residential")
		WebElement residentialclick;
		
		public void verifyindropdownResidentialClicking() {
			residentialclick.click();
		}
		
		@FindBy(xpath="//h1[contains(text(),'Enter the Property Address')]")
		WebElement residentialpopup;
		
		public String afterclickResidentialpopupdisplayed() {
			return residentialpopup.getText();
		}
		
		public void verifyAfterclickOnResidentialDispayedReportCreationPage()
		{
			String expectedTitle = "Enter the Property Address";
		    String actualTitle = afterclickResidentialpopupdisplayed();
		    Assert.assertEquals(actualTitle, expectedTitle, "Residential popup not displayed");
			System.out.println("Click on residential displayed Popup is :"+" "+actualTitle);
			driver.navigate().back();
		}

//TC-11	Verify the user Checking the display and navigation of the "My Reports" dropdown.
//My reports dropdown clicking
	
		@FindBy(linkText = "My Reports")
		WebElement myreports;
		
		public void verifytheMyReportsdropdownClicking() {
			myreports.click();
		}
		
//My Reports Commercial dropdown clicking
		
		@FindBy(linkText = "Commercial")
		WebElement commerciareportslclick;
		
		public void verifyinMyReportsdropdownCommercialClicking() {
			commercialclick.click();
		}
		
//DSCR reports clicking
		
		@FindBy(linkText = "DSCR")
		WebElement dscrReportsclick;
		
		public void verifyinCommercialclickandthenDSCRReportsClicking() {
			dscrReportsclick.click();
		}
		
		@FindBy(xpath="//h5[contains(text(),'DSCR Reports')]")
		WebElement dscrReportsScreen;
		
		public String verifyafterclickonDSCRreportsandgetText() {
			return dscrReportsScreen.getText();
		}
		
		public void verifyAfterclickOnDSCRDispayedDSCRReportsScreen()
		{
			String expectedTitle = "DSCR Reports";
		    String actualTitle = verifyafterclickonDSCRreportsandgetText();
		    Assert.assertEquals(actualTitle, expectedTitle, "DSCR reports page not displayed");
			System.out.println("Click on commercial dropdown then click DSCR displayed :"+" "+actualTitle);
			//driver.navigate().back();
		}
		
//ROI reports clicking	
		
		@FindBy(linkText = "ROI")
		WebElement roiReportsclick;
		
		public void verifyinCommercialclickandthenROIReportsClicking() {
			roiReportsclick.click();
		}
		
		@FindBy(xpath="//h5[contains(text(),'ROI Reports')]")
		WebElement roiReportsScreen;
		
		public String verifyafterclickonROIreportsandgetText() {
			return roiReportsScreen.getText();
		}
		
		public void verifyAfterclickOnROIDispayedROIReportsScreen()
		{
			String expectedTitle = "ROI Reports";
		    String actualTitle = verifyafterclickonROIreportsandgetText();
		    Assert.assertEquals(actualTitle, expectedTitle, "ROI reports page not displayed");
			System.out.println("Click on commercial dropdown then click ROI displayed :"+" "+actualTitle);
			//driver.navigate().back();
		}

//Residential reports clicking
		
		@FindBy(linkText = "Residential")
		WebElement residentialReportsclick;
		
		public void verifyindropdownResidentialReportsClicking() {
			residentialReportsclick.click();
		}
		
		@FindBy(xpath="//h5[contains(text(),'Residential Reports')]")
		WebElement residentialReportsScreen;
		
		public String verifyafterclickonResidentialreportsandgetText() {
			return residentialReportsScreen.getText();
		}
		
		public void verifyAfterclickOnResidentialDispayedResidentialReportsScreen()
		{
			String expectedTitle = "Residential Reports";
		    String actualTitle = verifyafterclickonResidentialreportsandgetText();
		    Assert.assertEquals(actualTitle, expectedTitle, "Residential reports page not displayed");
			System.out.println("Click on my reports dropdown then click Residential displayed :"+" "+actualTitle);
			//driver.navigate().back();
		}
		
		@FindBy(xpath="//a[@class='nav-link dropdown-toggle p-0 ps-2']")
		WebElement profile;
		
		public void verifyMyProfileDropdown() {
			profile.click();	
		}
		
		@FindBy(linkText="My Profile")
		WebElement myprofile;
		
		public String verifytheclickonMyprofilegetTest() {
			return myprofile.getText();	
		}
		
		public void verifyinDropdownclickMyprofilethenMyprofilePageIsDisplayed() 
		{
			String expectedTitle = "My Profile";
		    String actualTitle = verifytheclickonMyprofilegetTest();
		    Assert.assertEquals(actualTitle, expectedTitle, "My Profile page not displayed");
			System.out.println("Click on profile icon dropdown then displayed :"+" "+actualTitle);
		}
		
//TC-13 Checking the display and navigation of the profile icon dropdown(FAQ's) 
		
		@FindBy(linkText="FAQ'S")
		WebElement faqs;
		
		public String verifytheclickonFAQsgetTest() {
			return faqs.getText();	
		}
		
		public void verifyinDropdownclickOnFAQsthenFAQsPageIsDisplayed() 
		{
			String expectedTitle = "FAQ'S";
		    String actualTitle = verifytheclickonFAQsgetTest();
		    Assert.assertEquals(actualTitle, expectedTitle, "FAQ'S page not displayed");
			System.out.println("Click on profile icon dropdown then displayed :"+" "+actualTitle);
		}
		
		
		
		
		
}
