package Paccore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResidentialPage {

	WebDriver driver;
	public ResidentialPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Investment Analysis")
	WebElement investmentanalysis;
	
	public void verifytheinvestmentdropdownClicking() {
		investmentanalysis.click();
	}
	
	@FindBy(linkText = "Residential")
	WebElement residentialclick;
	
	public void verifyindropdownResidentialClicking() {
		residentialclick.click();
	}
	
//PopUp Close
	
	@FindBy(xpath= "(//button[@class='btn btn-danger'])[1]")
	WebElement popUpClosingclick;
	
	public void verifyindropdownResidentialpopUpClosingButtonClicking() {
		popUpClosingclick.click();
	}
	
//Residential Creation Page is displayed
	
	@FindBy(xpath="//h4[contains(text(),'RESIDENTIAL INVESTMENT ANALYSIS')]")
	WebElement residentialScreen;
	
	public String verifyafterclickonResidentialandgetText() {
		return residentialScreen.getText();
	}
	
	public void verifyAfterclickOnResidentialDispayedResidentialReportCreationPage()
	{
		String expectedTitle = "RESIDENTIAL INVESTMENT ANALYSIS";
	    String actualTitle = verifyafterclickonResidentialandgetText();
	    Assert.assertEquals(actualTitle, expectedTitle, "Residential page not displayed");
		System.out.println("Click on Residential in Investiment Analysis Dropdown then displayed :"+" "+actualTitle);
	}
	
//Displaying Investment summary table
	
	@FindBy(xpath="//h5[contains(text(),'Investment Summary')]")
	WebElement summaryTable;
	
	public String verifySummaryTableIsDisplaying() {
		return summaryTable.getText();
	}
	
	public void verifySummaryTableAndGetText()
	{
		String expectedTitle = "Investment Summary";
	    String actualTitle = verifySummaryTableIsDisplaying();
	    Assert.assertEquals(actualTitle, expectedTitle, "Investment Summary table not displayed");
	    System.out.println("In Residentail page displayed Table is :"+" "+actualTitle);
	}
	
//Displaying Investment summary table
	
	@FindBy(xpath="//h6[contains(text(),'Investment Details')]")
	WebElement detailsTable;
		
	public String verifyDetailsTableIsDisplaying() {
		return detailsTable.getText();
	}
		
	public void verifyDetailsTableAndGetText()
	{
		String expectedTitle = "Investment Details";
		String actualTitle = verifyDetailsTableIsDisplaying();
		Assert.assertEquals(actualTitle, expectedTitle, "Investment Details table not displayed");
		System.out.println("In Residentail page displayed Table is :"+" "+actualTitle);
	}
	
//Displaying Investment Analysis table
	
	@FindBy(xpath="//h6[contains(text(),'Investment Analysis')]")
	WebElement analysisTable;
			
	public String verifyAnalysisTableIsDisplaying() {
		return analysisTable.getText();
	}
			
	public void verifyAnalysisTableAndGetText()
	{
		String expectedTitle = "Investment Analysis";
		String actualTitle = verifyAnalysisTableIsDisplaying();
		Assert.assertEquals(actualTitle, expectedTitle, "Investment Analysis table not displayed");
		System.out.println("In Residentail page displayed Table is :"+" "+actualTitle);
	}
	
//Property Details dropdown clicking and get the text 
	
	@FindBy(xpath="(//button[@aria-controls='flush-collapseOne'])[2]")
	WebElement propertydetails;
	
	public void verifyPropertyDetailDropdownClicking() {
		propertydetails.click();
	}
	
	public String propertydetailsfieldisdisplayed() {
		return propertydetails.getText();
	}
	
	public void verifyPropertyDetailsFieldisdisplayed() 
	{
		String expectedTitle = "Property Details";
	    String actualTitle = propertydetailsfieldisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "Property Details Field is not displayed");
		System.out.println("In Residential displayed filed is :"+" "+actualTitle);
	}
	
//
	
	
}
