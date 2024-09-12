package Paccore.pageobjects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DSCRPage 
{
	
	WebDriver driver;
	public DSCRPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

//TC-01 Checking if the DSCR Analysis screen appears correctly after selecting Commercial DSCR from the Investment Analysis dropdown.
	
	@FindBy(linkText = "Investment Analysis")
	WebElement investmentanalysis;
	
	public void verifytheinvestmentdropdownClicking() {
		investmentanalysis.click();
	}
	
	@FindBy(linkText = "Commercial")
	WebElement commercialclick;
	
	public void verifyindropdownCommercialClicking() {
		commercialclick.click();
	}
	
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
	}
	
//Property Details
	
	@FindBy(xpath="//button[normalize-space()='Property Details']")
	WebElement propertydetails;
	
	public String propertydetailsfieldisdisplayed() {
		return propertydetails.getText();
	}
	
	public void verifyPropertyDetailsFieldisdisplayed() 
	{
		String expectedTitle = "Property Details";
	    String actualTitle = propertydetailsfieldisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "Property Details Field is not displayed");
		System.out.println("In DSCR displayed filed is :"+" "+actualTitle);
	}
	
//Loan Terms
	
	@FindBy(xpath="//button[normalize-space()='Loan Terms']")
	WebElement loanterms;
	
	public String loantermsfieldisdisplayed() {
		return loanterms.getText();
	}
	
	public void verifyLoanTermsFieldisdisplayed() 
	{
		String expectedTitle = "Loan Terms";
	    String actualTitle = loantermsfieldisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "Loan Terms Field is not displayed");
		System.out.println("In DSCR displayed filed is :"+" "+actualTitle);
	}
	
//Income
	
	@FindBy(xpath="//button[normalize-space()='Income']")
	WebElement income;
	
	public String incomefieldisdisplayed() {
		return income.getText();
	}
	
	public void verifyIncomeFieldisdisplayed() 
	{
		String expectedTitle = "Income";
	    String actualTitle = incomefieldisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "Income Field is not displayed");
		System.out.println("In DSCR displayed filed is :"+" "+actualTitle);
	}
	
//Annual Operating Expense
	
	@FindBy(xpath="//button[normalize-space()='Annual Operating Expenses']")
	WebElement annualoperatingexpenses;
	
	public String annualoperatingexpensesfieldisdisplayed() {
		return annualoperatingexpenses.getText();
	}
	
	public void verifyAnnualOperatingExpensesFieldisdisplayed() 
	{
		String expectedTitle = "Annual Operating Expenses";
	    String actualTitle = annualoperatingexpensesfieldisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "Annual Operating Expenses Field is not displayed");
		System.out.println("In DSCR displayed filed is :"+" "+actualTitle);
	}
	
//DSCR Summary Table
	
	@FindBy(xpath="//h5[normalize-space()='DSCR Summary']")
	WebElement dscrsummary;
	
	public String dscrsummarytableisdisplayed() {
		return dscrsummary.getText();
	}
	
	public void verifyDSCRSummaryTableisdisplayed() 
	{
		String expectedTitle = "DSCR Summary";
	    String actualTitle = dscrsummarytableisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "DSCR Summary table is not displayed");
		System.out.println("In DSCR displayed table is :"+" "+actualTitle);
	}
	
//DSCR Details
	
	@FindBy(xpath="//h6[contains(text(),'DSCR Details')]")
	WebElement dscrdatails;
	
	public String dscrdatailstableisdisplayed() {
		return dscrdatails.getText();
	}
	
	public void verifyDSCRDetailsTableisdisplayed() 
	{
		String expectedTitle = "DSCR Details";
	    String actualTitle = dscrdatailstableisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "DSCR Details table is not displayed");
		System.out.println("In DSCR displayed table is :"+" "+actualTitle);
	}
	
//TC-02 Checking if the Property Details section in the DSCR Analysis for Commercial DSCR is correctly displayed with the expected fields.

//---------------- Assert name field getext------------------//
	
	@FindBy(xpath="(//label[@class='form-label'])[1]")
	WebElement assertname;
		
	public String getassertnameisdisplayed() {
		return assertname.getText();
	}

	public void verifyAssertNameFielsisdisplayed() throws InterruptedException 
	{
		String expectedTitle = "ASSET NAME";
	    String actualTitle = getassertnameisdisplayed();
	    Assert.assertEquals(actualTitle, expectedTitle, "ASSET NAME Field is not displayed");
		System.out.println("In Property Details dropdown displayed field is :"+" "+actualTitle);
	}
	
//------Assert name helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Asset name. You need to enter complete address']")
	WebElement assertIcon;
	
	public void assertMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(assertIcon).perform();
	}
	
//---------------- Assert name field send key pass------------------//
	
	@FindBy(id="borrower_name")
	WebElement borrowername;
	
	public void givenborrowername() {
		borrowername.sendKeys("Oakwood Apartments");
	}
	
//---------------- APPROX SQ FOOTAGE field getext------------------//
	
	@FindBy(xpath="(//label[@class='form-label'])[2]")
	WebElement approxsq;
			
	public String getapproxsqisdisplayed() {
		return approxsq.getText();
	}

	public void verifyApproxSqFootageisdisplayed() throws InterruptedException 
		{
			String expectedTitle = "APPROX SQ FOOTAGE";
		    String actualTitle = getapproxsqisdisplayed();
		    Assert.assertEquals(actualTitle, expectedTitle, "APPROX SQ FOOTAGE Field is not displayed");
			System.out.println("In Property Details dropdown displayed field is :"+" "+actualTitle);
		}
	
//-------------- APPROX SQ FOOTAGE helper icon Mouse over action method-------//
		
	@FindBy(xpath="//i[@aria-label='Enter Approx Sq Footage ']")
	WebElement approxsqIcon;
		
	public void approxSqIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(approxsqIcon).perform();
	}
	
//---------------- APPROX SQ FOOTAGE field send key pass------------------//
	
	@FindBy(id="approximate_sq_footage")
	WebElement approx;
	
	public void givenApproximate() {
		approx.sendKeys("60,000");
	}

//---------------- PROPERTY TYPE field getext------------------//
	
	@FindBy(xpath="(//label[@class='form-label'])[3]")
	WebElement propertyType;
				
	public String getpropertyTypeisdisplayed() {
		return propertyType.getText();
	}

	public void verifyPropertyTypeisdisplayed() throws InterruptedException 
		{
			String expectedTitle = "PROPERTY TYPE";
			String actualTitle = getpropertyTypeisdisplayed();
		    Assert.assertEquals(actualTitle, expectedTitle, "PROPERTY TYPE Field is not displayed");
		    System.out.println("In Property Details dropdown displayed field is :"+" "+actualTitle);
		}
		
//-------------- PROPERTY TYPE helper icon Mouse over action method-------//
			
	@FindBy(xpath="//i[@aria-label='Enter Property Type ']")
	WebElement propertyIcon;
			
	public void propertyIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(propertyIcon).perform();
	}
		
//---------------- PROPERTY TYPE field dropdown selecting one property type------------------//
		
	@FindBy(id="property_type")
	WebElement property;
	
	public void givenPropertyType() {
		
		Select Propertypedrop = new Select(property);
		Propertypedrop.selectByVisibleText("Mixed-Use");		
	}
	
//NO OF UNITS
	
//---------------- NO OF UNITS field getext------------------//
	
	@FindBy(xpath="(//label[@class='form-label'])[4]")
	WebElement units;
					
	public String getNoOfUnitsisdisplayed() {
		return units.getText();
	}

	public void verifyNoOfUnitsisdisplayed() throws InterruptedException 
		{
		     String expectedTitle = "NO OF UNITS";
			 String actualTitle = getNoOfUnitsisdisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "NO OF UNITS Field is not displayed");
			 System.out.println("In Property Details dropdown displayed field is :"+" "+actualTitle);
		}
			
//-------------- NO OF UNITS helper icon Mouse over action method-------//
				
	@FindBy(xpath="//i[@aria-label='Enter Number of Units']")
	WebElement unitsIcon;
				
	public void noOfUnitsIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(unitsIcon).perform();
	}
			
//---------------- NO OF UNITS field dropdown selecting one value-------------------//
			
	@FindBy(id="no_units")
	WebElement noofunits;
		
	public void givenNoOfUnits() {
			
	Select NoOfUnitsdrop = new Select(noofunits);
	NoOfUnitsdrop.selectByVisibleText("30");		
	}

//--------------Loan Terms dropdown clicking------------------------//
	
	@FindBy(xpath="//button[normalize-space()='Loan Terms']")
	WebElement loantermsdrop;
	
	public void clickOnLoanTermsDropdown() 
	{
	int maxAttempts = 3;
	for (int attempts = 0; attempts < maxAttempts; attempts++) 
	{
		try {
			loantermsdrop.click();
		break;
		    } catch (ElementClickInterceptedException e) {}
	}
	}
	
	@FindBy(xpath="//button[normalize-space()='Loan Terms']")
	WebElement loantermsText;
	
	public String getLoanTermsText() {
		return loantermsText.getText();
	}
	
	public void verifyLoanTermsDropdownClickingAndGetText() 
	{
		String expectedTitle = "Loan Terms";
		String actualTitle = getLoanTermsText();
		Assert.assertEquals(actualTitle, expectedTitle, "Loan Terms Dropdown is not displayed");
		System.out.println("In DSCR displayed filed is :"+" "+actualTitle);
	}

//--------------------PROPERTY VALUE---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='PROPERTY VALUE']")
	WebElement propertyval;
					
	public String getPropertyValueDisplayed() {
		return propertyval.getText();
	}

	public void verifyPropertyValueDisplayed() 
		{
		     String expectedTitle = "PROPERTY VALUE";
			 String actualTitle = getPropertyValueDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "PROPERTY VALUE Field is not displayed");
			 System.out.println("In Loan Terms displayed field is :"+" "+actualTitle);
		}
	
//-------------- PROPERTY VALUE helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Property value ']")
	WebElement propertyValIcon;
					
	public void propertyValIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(propertyValIcon).perform();
	}
	
//---------------- Propert Value field send key pass------------------//
				
	@FindBy(id="property_value")
	WebElement propertyValue;
			
	public void givenPropertyValue() { 			
	       propertyValue.sendKeys("6,000,000");		
	}

//---------------------------LOAN AMOUNT--------------------------------//
	
	@FindBy(xpath="//label[normalize-space()='LOAN AMOUNT']")
	WebElement loanamount;
					
	public String getLoanAmountDisplayed() {
		return loanamount.getText();
	}

	public void verifyLoanAmountDisplayed() 
		{
		     String expectedTitle = "LOAN AMOUNT";
			 String actualTitle = getLoanAmountDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "LOAN AMOUNT Field is not displayed");
			 System.out.println("In Loan Terms displayed field is :"+" "+actualTitle);
		}

//-------------- LOAN AMOUNT helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Loan Amount ']")
	WebElement loanAmountIcon;
						
	public void loanAmountIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(loanAmountIcon).perform();
	}	
	
//----------------------LOAN TO VALUE (LTV)----------------------------//

	@FindBy(xpath="//label[normalize-space()='LOAN TO VALUE (LTV)']")
	WebElement loantovalue;
					
	public String getLoanToValueDisplayed() {
		return loantovalue.getText();
	}

	public void verifyLoanToValueDisplayed() 
		{
		     String expectedTitle = "LOAN TO VALUE (LTV)";
			 String actualTitle = getLoanToValueDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "LOAN TO VALUE (LTV) Field is not displayed");
			 System.out.println("In Loan Terms displayed field is :"+" "+actualTitle);
		}

//-------------- LOAN TO VALUE (LTV) helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Loan to Value (LTV)']")
	WebElement loanToValueIcon;
						
	public void loanToValueIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(loanToValueIcon).perform();
	}	
	
//--------------------AMORTIZATION (YEARS)---------------------------------//
	
	@FindBy(xpath="//label[normalize-space()='AMORTIZATION (YEARS)']")
	WebElement amortizationYear;
					
	public String getAmortizationYearDisplayed() {
		return amortizationYear.getText();
	}

	public void verifyAmortizationYearDisplayed() 
		{
		     String expectedTitle = "AMORTIZATION (YEARS)";
			 String actualTitle = getAmortizationYearDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "AMORTIZATION (YEARS) Field is not displayed");
			 System.out.println("In Loan Terms displayed field is :"+" "+actualTitle);
		}

//-------------- AMORTIZATION (YEARS) helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Ammortization Years']")
	WebElement amortYearIcon;
							
	public void amortYearIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(amortYearIcon).perform();
	}

//---------------- AMORTIZATION (YEARS) field dropdown clicking and selecting------------------//
	
	@FindBy(xpath="//select[@id='amortization_years']")
	WebElement amortyears;
		
	public void selectingAmortizationYear() {
	try 
	{
	Select NoOfUnitsdrop = new Select(amortyears);
	NoOfUnitsdrop.selectByVisibleText("20");	
	}
	catch (InvalidElementStateException e) {}
	}

//----------------------------INTEREST RATE--------------------------------//
	
	@FindBy(xpath="//label[normalize-space()='INTEREST RATE']")
	WebElement interestRate;
					
	public String getInterestRateDisplayed() {
		return interestRate.getText();
	}

	public void verifyInterestRateDisplayed() 
		{
		     String expectedTitle = "INTEREST RATE";
			 String actualTitle = getInterestRateDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "INTEREST RATE Field is not displayed");
			 System.out.println("In Loan Terms displayed field is :"+" "+actualTitle);
		}

//-------------- INTEREST RATE helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Interest rate']")
	WebElement interestRateIcon;
								
	public void interestRateIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(interestRateIcon).perform();
	}

//---------------- INTEREST RATE  field existing value clearing and given value------------------//
	
	@FindBy(id="interest_rate")
	WebElement interestRateclear;
	
	public void interestRateExistingValueClearingAndGivenValue() {
		interestRateclear.clear();
		interestRateclear.sendKeys("5");
	}
	
//----------------------------DOWN PAYMENT--------------------------------//
	
	@FindBy(xpath="//label[normalize-space()='DOWN PAYMENT']")
	WebElement downPayment;
						
	public String getDownPaymentDisplayed() {
		return downPayment.getText();
	}

	public void verifyDownPaymentDisplayed() 
		{
			 String expectedTitle = "DOWN PAYMENT";
		     String actualTitle = getDownPaymentDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "DOWN PAYMENT Field is not displayed");
			 System.out.println("In Loan Terms displayed field is :"+" "+actualTitle);
		}
	
//-------------- DOWN PAYMENT helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Down Payment Value']")
	WebElement downPaymentIcon;
									
	public void downPaymentIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(downPaymentIcon).perform();
	}	
	
//----------------------------DSCR--------------------------------//
	
	@FindBy(xpath="//label[normalize-space()='DSCR']")
	WebElement dscr;
							
	public String getDscrDisplayed() {
		return dscr.getText();
	}

	public void verifyDscrDisplayed() 
		{
			 String expectedTitle = "DSCR";
			 String actualTitle = getDscrDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "DSCR Field is not displayed");
			 System.out.println("In Loan Terms displayed field is :"+" "+actualTitle);
		}
		
//-------------- DSCR helper icon Mouse over action method-------//
		
	@FindBy(xpath="//i[@aria-label='Enter DSCR']")
	WebElement dscrIcon;
										
	public void dscrIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(dscrIcon).perform();
	}	
		
//------------------------Income dropdown clicking------------------------//
	
	@FindBy(xpath="//button[normalize-space()='Income']")
	WebElement incomedropdown;
		
	public void clickOnIncomeDropdown() 
	{
	int maxAttempts = 3;
	for (int attempts = 0; attempts < maxAttempts; attempts++) 
	{
	  try {
		  incomedropdown.click();
		  break;
		  } catch (ElementClickInterceptedException e) {}
	}
	}
		
	@FindBy(xpath="//button[normalize-space()='Income']")
	WebElement incomeText;
	
	public String getIncomeText() {
		return incomeText.getText();
	}
	
	public void verifyIncomeDropdownClickingAndGetText() 
	{
		String expectedTitle = "Income";
		String actualTitle = getIncomeText();
		Assert.assertEquals(actualTitle, expectedTitle, "Income Dropdown is not displayed");
		System.out.println("In DSCR displayed filed is :"+" "+actualTitle);
	}	
	
//--------------------------GROSS ANNUAL RENTAL INC-----------------------------//
	
	@FindBy(xpath="//label[normalize-space()='GROSS ANNUAL RENTAL INC']")
	WebElement grossRental;
						
	public String getGrossRentalDisplayed() {
		return grossRental.getText();
	}

	public void verifyGrossRentalDisplayed() 
		{
			 String expectedTitle = "GROSS ANNUAL RENTAL INC";
		     String actualTitle = getGrossRentalDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "GROSS ANNUAL RENTAL INC Field is not displayed");
			 System.out.println("In Income dropdown displayed field is :"+" "+actualTitle);
		}

//-------------- GROSS ANNUAL RENTAL INC helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Gross Annual Rental Inc']")
	WebElement grossRentalIcon;
											
	public void grossRentalIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(grossRentalIcon).perform();
	}

//----------------------GROSS ANNUAL RENTAL INC field entering value -------------------------------//
	
	@FindBy(xpath="//input[@id='gross_annual_rental']")
	WebElement grossAnnualRental;
	
	public void givenGrossRentalValue() {
		grossAnnualRental.sendKeys("720,000");
	}
	
//--------------------------OTHER INCOME---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='OTHER INCOME']")
	WebElement otherIncome;
						
	public String getOtherIncomeDisplayed() {
		return otherIncome.getText();
	}

	public void verifyOtherIncomeDisplayed() 
		{
			 String expectedTitle = "OTHER INCOME";
		     String actualTitle = getOtherIncomeDisplayed();
			 Assert.assertEquals(actualTitle, expectedTitle, "OTHER INCOME Field is not displayed");
			 System.out.println("In Income dropdown displayed field is :"+" "+actualTitle);
		}
	
//-------------- OTHER INCOME helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Other Income']")
	WebElement otherIncomeIcon;
												
	public void otherIncomeIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(otherIncomeIcon).perform();
	}	
	
//----------------------OTHER INCOME field entering value -------------------------------//
	
	@FindBy(id="other_income")
	WebElement otherIncom;
		
	public void givenOtherIncomValue() {
		otherIncom.sendKeys("25,000");
	}
	
//------------------------Annual Operating Expenses dropdown clicking------------------------//
	
	@FindBy(xpath="//button[normalize-space()='Annual Operating Expenses']")
	WebElement annualdropdown;
			
	public void clickOnAnnualOperatingExpDropdown() 
	{
	int maxAttempts = 3;
	for (int attempts = 0; attempts < maxAttempts; attempts++) 
	{
	  try {
		  annualdropdown.click();
	  break;
		  } catch (ElementClickInterceptedException e) {}
    }
	}
	
	@FindBy(xpath="//button[normalize-space()='Annual Operating Expenses']")
	WebElement annualExpText;
	
	public String getAnnualExpText() {
		return annualExpText.getText();
	}
	
	public void verifyAnnualOperatingExpDropdownClickingAndGetText() 
	{
		String expectedTitle = "Annual Operating Expenses";
		String actualTitle = getIncomeText();
		Assert.assertEquals(actualTitle, expectedTitle, "Annual Operating Expenses field is not displayed");
		System.out.println("In DSCR displayed filed is :"+" "+actualTitle);
	}		
	
//--------------------------UTILITIES / TELEPHONE---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='UTILITIES / TELEPHONE']")
	WebElement utilities;
							
	public String getUtilitiesTelephoneDisplayed() {
	return utilities.getText();
	}

	public void verifyUtilitiesTelephoneDisplayed() 
		{
			String expectedTitle = "UTILITIES / TELEPHONE";
			String actualTitle = getUtilitiesTelephoneDisplayed();
		    Assert.assertEquals(actualTitle, expectedTitle, "UTILITIES / TELEPHONE Field is not displayed");
		    System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);
		}	
	
//-------------- UTILITIES / TELEPHONE helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Utilities / Telephone']")
	WebElement utilitiesIcon;
												
	public void utilitiesTelephoneIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(utilitiesIcon).perform();
	}	
		
//----------------------UTILITIES / TELEPHONE field entering value -------------------------------//
		
	@FindBy(id="utilities_telephone")
	WebElement utilitiesTelephone;
			
	public void givenUtilitiesTelephoneClearingValueAndGivenValue() {
	utilitiesTelephone.clear();	
	utilitiesTelephone.sendKeys("20,000");
	}
	
//--------------------------REPAIRS AND MAINTENANCE---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='REPAIRS AND MAINTENANCE']")
	WebElement repairsMaintanance;
								
	public String getRepairsMaintananceDisplayed() {
	return repairsMaintanance.getText();
	}

	public String verifyRepairsMaintananceDisplayed() 
		{
			String expectedTitle = "REPAIRS AND MAINTENANCE";
			String actualTitle = getRepairsMaintananceDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "REPAIRS AND MAINTENANCE Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);
			return actualTitle;
		}	

//-------------- REPAIRS AND MAINTENANCE helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Repairs and Maintenance']")
	WebElement repairsMaintenanceIcon;
													
	public void repairsMaintenanceIconIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(repairsMaintenanceIcon).perform();
	}	
	
//----------------------REPAIRS AND MAINTENANCE field entering value -------------------------------//
	
	@FindBy(id="repairs_maintenance")
	WebElement repairsAndMaintenance;
				
	public void givenRepairsAndMaintenanceClearingValueAndGivenValue() {
	repairsAndMaintenance.clear();	
	repairsAndMaintenance.sendKeys("30,000");
	}
	
//--------------------------SALARIES / LEGAL / ADMIN---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='SALARIES / LEGAL / ADMIN']")
	WebElement salariesLegal;
									
	public String getSalariesLegalMaintananceDisplayed() {
	return salariesLegal.getText();
	}

	public void verifySalariesLegalMaintananceDisplayed() 
		{
			String expectedTitle = "SALARIES / LEGAL / ADMIN";
			String actualTitle = getSalariesLegalMaintananceDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "SALARIES / LEGAL / ADMIN Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);	
		}	

//-------------- SALARIES / LEGAL / ADMIN helper icon Mouse over action method-------//
	
	@FindBy(xpath="//i[@aria-label='Enter Salaries / Legal / Admin']")
	WebElement salariesMaintenanceIcon;
														
	public void salariesLegalAdminMaintenanceIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(salariesMaintenanceIcon).perform();
	}

//----------------------SALARIES / LEGAL / ADMIN field entering value -------------------------------//
	
	@FindBy(id="salaries_legal")
	WebElement salariesLegalMaintenance;
					
	public void givenSalariesLegalAdminMaintenanceClearingValueAndGivenValue() {
	salariesLegalMaintenance.clear();	
	salariesLegalMaintenance.sendKeys("40,000");
	}
	
//--------------------------SNOW / TRASH---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='SNOW / TRASH']")
	WebElement snowTrash;
										
	public String getSnowTrashDisplayed() {
	return snowTrash.getText();
	}

	public void verifySnowTrashDisplayed() 
		{
			String expectedTitle = "SNOW / TRASH";
			String actualTitle = getSnowTrashDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "SNOW / TRASH Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);	
		}	

//-------------- SNOW / TRASH helper icon Mouse over action method-------//
		
	@FindBy(xpath="//i[@aria-label='Enter Snow/ Trash ']")
	WebElement snowTrashIcon;
															
	public void snowTrashIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(snowTrashIcon).perform();
	}

//----------------------SNOW / TRASH field entering value -------------------------------//
		
	@FindBy(id="snow_trash")
	WebElement snowTrash1;
						
	public void givenSnowTrashClearingValueAndGivenValue() {
	snowTrash1.clear();	
	snowTrash1.sendKeys("10,000");
	}
	
//--------------------------R.E. TAXES---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='R.E. TAXES']")
	WebElement reTaxes;
											
	public String getRETaxesDisplayed() {
	return reTaxes.getText();
	}

	public void verifyRETaxesDisplayed() 
		{
			String expectedTitle = "R.E. TAXES";
			String actualTitle = getRETaxesDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "R.E. TAXES Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);	
		}	

//-------------- R.E. TAXES helper icon Mouse over action method-------//
			
	@FindBy(xpath="//i[@aria-label='Enter R.E. Taxes ']")
	WebElement reTaxesIcon;
																
	public void reTaxesIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(reTaxesIcon).perform();
	}

//----------------------R.E. TAXES field entering value -------------------------------//
			
	@FindBy(id="re_taxes")
	WebElement reTaxes1;
							
	public void givenRETaxesClearingValueAndGivenValue() {
	reTaxes1.clear();	
	reTaxes1.sendKeys("30,000");
	}

//--------------------------INSURANCE---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='INSURANCE']")
	WebElement insurance;
												
	public String getInsuranceDisplayed() {
	return insurance.getText();
	}

	public void verifyInsuranceDisplayed() 
		{
			String expectedTitle = "INSURANCE";
			String actualTitle = getInsuranceDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "INSURANCE Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);	
		}	

//-------------- INSURANCE helper icon Mouse over action method-------//
				
	@FindBy(xpath="//i[@aria-label='Enter Insurance']")
	WebElement insuranceIcon;
																	
	public void insuranceIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(insuranceIcon).perform();
	}

//----------------------INSURANCE field entering value -------------------------------//
				
	@FindBy(id="insurance")
	WebElement insurance1;
								
	public void givenInsuranceClearingValueAndGivenValue() {
	insurance1.clear();	
	insurance1.sendKeys("35,000");
	}

//--------------------------OTHER OPERATING EXP---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='OTHER OPERATING EXP']")
	WebElement otherOperating;
													
	public String getOtherOperatingDisplayed() {
	return otherOperating.getText();
	}

	public void verifyOtherOperatingDisplayed() 
		{
			String expectedTitle = "OTHER OPERATING EXP";
			String actualTitle = getOtherOperatingDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "OTHER OPERATING EXP Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);	
		}	

//-------------- OTHER OPERATING EXP helper icon Mouse over action method-------//
					
	@FindBy(xpath="//i[@aria-label='Enter Other Operating Exp']")
	WebElement otherOperatingExpIcon;
																		
	public void otherOpratingExpIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(otherOperatingExpIcon).perform();
	}

//----------------------OTHER OPERATING EXP field entering value -------------------------------//
					
	@FindBy(id="other_operating_exp")
	WebElement otherOperatingExp;
									
	public void givenOtherOperatingExpClearingValueAndGivenValue() {
	otherOperatingExp.clear();	
	otherOperatingExp.sendKeys("15,000");
	}
	
//--------------------------ANNUAL OPERATING EXP---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='ANNUAL OPERATING EXP']")
	WebElement annualOperating;
														
	public String getAnnualOperatingDisplayed() {
	return annualOperating.getText();
	}

	public void verifyAnnualOperatingDisplayed() 
	    {
			String expectedTitle = "ANNUAL OPERATING EXP";
			String actualTitle = getAnnualOperatingDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "ANNUAL OPERATING EXP Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);	
		}	

//-------------- ANNUAL OPERATING EXP helper icon Mouse over action method-------//
						
	@FindBy(xpath="//i[@aria-label='Enter Gross Annual Rental Inc']")
	WebElement annualOperatingExpIcon;
																			
	public void annualOpratingExpIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(annualOperatingExpIcon).perform();
	}

//----------------------ANNUAL OPERATING EXP field entering value -------------------------------//
						
	@FindBy(id="annual_operating_exp")
	WebElement annualOperatingExp;
										
	public void givenAnnualOperatingExpClearingValueAndGivenValue() {
	annualOperatingExp.clear();	
	annualOperatingExp.sendKeys("15,000");
	}
	
//--------------------------MGMT FEES---------------------------//
	
	@FindBy(xpath="//label[normalize-space()='MGMT FEES']")
	WebElement magtFees;
															
	public String getMGMTFeesDisplayed() {
	return magtFees.getText();
	}

	public void verifyMGMTFeesDisplayed() 
		{
			String expectedTitle = "MGMT FEES";
			String actualTitle = getMGMTFeesDisplayed();
			Assert.assertEquals(actualTitle, expectedTitle, "MGMT FEES Field is not displayed");
			System.out.println("In Annual Operating Expenses dropdown displayed field is :"+" "+actualTitle);	
		}	

//-------------- MGMT FEES helper icon Mouse over action method-------//
							
	@FindBy(xpath="//i[@aria-label='Enter Mgmt Fees ']")
	WebElement mgmtFeesIcon;
																				
	public void mgmtFeesIconMouseOverAction() {		
	Actions a = new Actions(driver);
	a.moveToElement(mgmtFeesIcon).perform();
	}

//----------------------MGMT FEES field entering value -------------------------------//
							
	@FindBy(id="mgmt_fees")
	WebElement mgmtFees1;
											
	public void givenMGMTFeesClearingValueAndGivenValue() {
	mgmtFees1.clear();	
	mgmtFees1.sendKeys("35,000");
	}
	
//------------------------------Save DSCR Analysis button clicking-----------------------------------------//
	
	@FindBy(id="alert-warning")
    WebElement saveDSCR;
	
	public void verifyToClickOnSaveDSCRButton() 
	{
		int maxAttempts = 3;
		for (int attempts = 0; attempts < maxAttempts; attempts++) 
		{
		  try {
			  saveDSCR.click();
		  break;
			  } catch (ElementClickInterceptedException e) {}
	    }
	}
	
	@FindBy(id="alert-warning")
    WebElement saveDSCRText;
	
	public String getSaveDSCRText() {
		return saveDSCRText.getText();
	}
	
	public void verifySaveDSCRDisplayed() 
	{
		String expectedTitle = "Save DSCR Analysis";
		String actualTitle = getSaveDSCRText();
		Assert.assertEquals(actualTitle, expectedTitle, "Save DSCR Analysis button is not displayed");
		System.out.println("The displayed button is :"+" "+actualTitle);	
	}	

//In alert box, clicking on save analysis button 
	
	@FindBy(xpath="//button[text()='Save Analysis']")
    WebElement saveAnalysisbutton;
	
	public void verifyToClickOnSaveAnalysisButton() {
		saveAnalysisbutton.click();
	}
	
	@FindBy(xpath="//button[@value='save_investment_analysis']")
    WebElement saveAnalysisText;
	
	public String getSaveAnalysisButtonText() {
		return saveAnalysisText.getText();
	}
	
	public void verifySaveAnalysisDisplayed() 
	{
		String expectedTitle = "Save Analysis";
		String actualTitle = getSaveAnalysisButtonText();
		Assert.assertEquals(actualTitle, expectedTitle, "Save Analysis button is not displayed");
		System.out.println("In alert box displayed button is :"+" "+actualTitle);	
	}

//After save get the displaying success text
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible fade show mt-1']")
	WebElement successText;
	
	public String getAfterSaveText() {
		return successText.getText();
	}
	
	public void verifySuccessfullyDSCRReportSavedTextDisplayed() 
	{
		String expectedTitle = "Successfully Saved DSCR Report";
		String actualTitle = getAfterSaveText();
		Assert.assertEquals(actualTitle, expectedTitle, "Successfully Saved  DSCR Report is not displayed");
		System.out.println("After saving displyed text is :"+" "+actualTitle);	
	}
	
	
	
	
}



