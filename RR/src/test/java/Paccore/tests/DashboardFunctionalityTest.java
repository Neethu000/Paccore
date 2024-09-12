package Paccore.tests;

import org.testng.annotations.Test;

import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.DashboardFunctionalityPage;

public class DashboardFunctionalityTest extends BaseTests {

//TC-10 Verify the user Checking the display and navigation of the "Investment Analysis" dropdown.
	
	@Test()
	public void verifytheInvestmentAnalysisDropdowndNavigations() {
		DashboardFunctionalityPage dashboardNavigations = new DashboardFunctionalityPage(driver);

//Investment Dropdown clicking
		
		dashboardNavigations.verifytheinvestmentdropdownClicking();
		

//In Commercial dropdown DSCR clicking
		
		dashboardNavigations.verifyindropdownCommercialClicking();
		dashboardNavigations.verifyinCommercialclickandthenDSCRClicking();
		dashboardNavigations.verifyAfterclickOnDSCRDispayedDSCRReportCreationPage();
		
//In Commercial dropdown ROI clicking
		
		dashboardNavigations.verifytheinvestmentdropdownClicking();
		dashboardNavigations.verifyindropdownCommercialClicking();
		dashboardNavigations.verifyinCommercialclickandthenROIClicking();
		dashboardNavigations.verifyAfterclickOnROIDispayedROIReportCreationPage();
		
//In Investment dropdown Residential clicking
		
		dashboardNavigations.verifytheinvestmentdropdownClicking();
		dashboardNavigations.verifyindropdownResidentialClicking();
		dashboardNavigations.afterclickResidentialpopupdisplayed();
		dashboardNavigations.verifyAfterclickOnResidentialDispayedReportCreationPage();
						
		}
	
//TC-11	Verify the user Checking the display and navigation of the "My Reports" dropdown.	
	
	@Test
	public void verifytheMyReportsDropdownNavigations() {
		DashboardFunctionalityPage dashboardNavigations = new DashboardFunctionalityPage(driver);

//My reports dropdown clicking
		
		dashboardNavigations.verifytheMyReportsdropdownClicking();
		
//In Commercial dropdown DSCR clicking
		
		dashboardNavigations.verifyinMyReportsdropdownCommercialClicking();
		dashboardNavigations.verifyinCommercialclickandthenDSCRReportsClicking();
		dashboardNavigations.verifyAfterclickOnDSCRDispayedDSCRReportsScreen();
		
//In Commercial dropdown ROI clicking 		
		
		dashboardNavigations.verifytheMyReportsdropdownClicking();
		dashboardNavigations.verifyinMyReportsdropdownCommercialClicking();
		dashboardNavigations.verifyinCommercialclickandthenROIReportsClicking();
		dashboardNavigations.verifyAfterclickOnROIDispayedROIReportsScreen();
		
//In My Reports dropdown Residential clicking	
		
		dashboardNavigations.verifytheMyReportsdropdownClicking();
		dashboardNavigations.verifyindropdownResidentialReportsClicking();
		dashboardNavigations.verifyAfterclickOnResidentialDispayedResidentialReportsScreen();
		
     	}
	
	@Test
	public void verifytheMyProfileDropdownNavigations() {
		DashboardFunctionalityPage dashboardNavigations = new DashboardFunctionalityPage(driver);
		
//TC-12 Checking the display and navigation of the profile icon dropdown 	
		
		//dashboardNavigations.verifydashboard();
		dashboardNavigations.verifyMyProfileDropdown();
		dashboardNavigations.verifyinDropdownclickMyprofilethenMyprofilePageIsDisplayed();	
		dashboardNavigations.verifyinDropdownclickOnFAQsthenFAQsPageIsDisplayed();
		
	}
	
}

