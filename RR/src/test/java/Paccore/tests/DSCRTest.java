package Paccore.tests;

import org.testng.annotations.Test;

import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.DSCRPage;

public class DSCRTest extends BaseTests {

//TC-01 Checking if the DSCR Analysis screen appears correctly after selecting Commercial DSCR from the Investment Analysis dropdown.
	
	@Test
	public void verifytheDSCRReportCreationWhatInthatDisplayed() throws InterruptedException {
		DSCRPage dscr = new DSCRPage(driver);
		
		dscr.verifytheinvestmentdropdownClicking();
		dscr.verifyindropdownCommercialClicking();
		dscr.verifyinCommercialclickandthenDSCRClicking();
		dscr.verifyAfterclickOnDSCRDispayedDSCRReportCreationPage();
		dscr.verifyPropertyDetailsFieldisdisplayed();
		dscr.verifyLoanTermsFieldisdisplayed();
		dscr.verifyIncomeFieldisdisplayed();
		dscr.verifyAnnualOperatingExpensesFieldisdisplayed();
		dscr.verifyDSCRSummaryTableisdisplayed();
		dscr.verifyDSCRDetailsTableisdisplayed();
		
//Property Details
		
	//ASSET NAME
		
		dscr.verifyAssertNameFielsisdisplayed();
		dscr.assertMouseOverAction();
		dscr.givenborrowername();
	
	//APPROX SQ FOOTAGE
		
		dscr.verifyApproxSqFootageisdisplayed();
		dscr.approxSqIconMouseOverAction();
		dscr.givenApproximate();
		
	//PROPERTY TYPE
		
		dscr.verifyPropertyTypeisdisplayed();
		dscr.propertyIconMouseOverAction();
		dscr.givenPropertyType();
		
    //NO OF UNITS
		
		dscr.verifyNoOfUnitsisdisplayed();
		dscr.noOfUnitsIconMouseOverAction();
		dscr.givenNoOfUnits();
	
//Loan Terms dropdown clicking and get the text
		
		dscr.clickOnLoanTermsDropdown();
		dscr.verifyLoanTermsDropdownClickingAndGetText();
		
//Loan Terms
		
     //Property Value
		
		dscr.verifyPropertyValueDisplayed();
		dscr.propertyValIconMouseOverAction();
		dscr.givenPropertyValue();
		
	 //Loan Amount
		
		dscr.verifyLoanAmountDisplayed();
		dscr.loanAmountIconMouseOverAction();
	
	 //Loan To Value
		
		dscr.verifyLoanToValueDisplayed();
		dscr.loanToValueIconMouseOverAction();
		
	 //AMORTIZATION (YEARS)
		
		dscr.verifyAmortizationYearDisplayed();
		dscr.amortYearIconMouseOverAction();
		dscr.selectingAmortizationYear();
		
	//INTEREST RATE
		
		dscr.verifyInterestRateDisplayed();
		dscr.interestRateIconMouseOverAction();
		dscr.interestRateExistingValueClearingAndGivenValue();
	
	//DOWN PAYMENT 
		
		dscr.verifyDownPaymentDisplayed();
		dscr.downPaymentIconMouseOverAction();
		
	//DSCR
		
		dscr.verifyDscrDisplayed();
		dscr.dscrIconMouseOverAction();
		
//Income dropdown clicking and get the text
		
		dscr.clickOnIncomeDropdown();
		dscr.verifyIncomeDropdownClickingAndGetText();
		
    //GROSS ANNUAL RENTAL INC
		
		dscr.verifyGrossRentalDisplayed();
		dscr.grossRentalIconMouseOverAction();
		dscr.givenGrossRentalValue();
		
    //OTHER INCOME
		
		dscr.verifyOtherIncomeDisplayed();
		dscr.otherIncomeIconMouseOverAction();
		dscr.givenOtherIncomValue();

//Annual Operating Expenses
		
		dscr.clickOnAnnualOperatingExpDropdown();
		dscr.getAnnualExpText();
		
	//UTILITIES / TELEPHONE
		
		dscr.verifyUtilitiesTelephoneDisplayed();
		dscr.utilitiesTelephoneIconMouseOverAction();
		dscr.givenUtilitiesTelephoneClearingValueAndGivenValue();
		
	//REPAIRS AND MAINTENANCE
		
		dscr.verifyRepairsMaintananceDisplayed();
		dscr.repairsMaintenanceIconIconMouseOverAction();
		dscr.givenRepairsAndMaintenanceClearingValueAndGivenValue();
		
	//SALARIES / LEGAL / ADMIN
		
		dscr.verifySalariesLegalMaintananceDisplayed();
		dscr.salariesLegalAdminMaintenanceIconMouseOverAction();
		dscr.givenSalariesLegalAdminMaintenanceClearingValueAndGivenValue();
		
	//SNOW / TRASH
		
		dscr.verifySnowTrashDisplayed();
		dscr.snowTrashIconMouseOverAction();
		dscr.givenSnowTrashClearingValueAndGivenValue();
		
	//R.E. TAXES
		
		dscr.verifyRETaxesDisplayed();
		dscr.reTaxesIconMouseOverAction();
		dscr.givenRETaxesClearingValueAndGivenValue();
		
	//INSURANCE
		
		dscr.verifyInsuranceDisplayed();
		dscr.insuranceIconMouseOverAction();
		dscr.givenInsuranceClearingValueAndGivenValue();
		
	//OTHER OPERATING EXP
		
		dscr.verifyOtherOperatingDisplayed();
		dscr.otherIncomeIconMouseOverAction();
		dscr.givenOtherOperatingExpClearingValueAndGivenValue();
		
	//ANNUAL OPERATING EXP
		
		dscr.verifyAnnualOperatingDisplayed();
		dscr.annualOpratingExpIconMouseOverAction();
		dscr.givenAnnualOperatingExpClearingValueAndGivenValue();
		
	//MGMT FEES
	
		dscr.verifyMGMTFeesDisplayed();
		dscr.mgmtFeesIconMouseOverAction();
		dscr.givenMGMTFeesClearingValueAndGivenValue();
		
//Save DSCR Analysis button clicking
		
		dscr.verifySaveDSCRDisplayed();
		dscr.verifyToClickOnSaveDSCRButton();
		
//In alert box, clicking on save analysis button 
		
		dscr.verifyToClickOnSaveAnalysisButton();
		dscr.verifySaveAnalysisDisplayed();
		
//After save get the displaying success text
		
		dscr.verifySuccessfullyDSCRReportSavedTextDisplayed();
	}
	
	
	

	
	


	
	
	
}
