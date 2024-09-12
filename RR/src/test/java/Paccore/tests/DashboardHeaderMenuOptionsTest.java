package Paccore.tests;

import org.testng.annotations.Test;

import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.DashboardHeaderMenuOptionsPage;

public class DashboardHeaderMenuOptionsTest extends BaseTests{
	
//TC-5 Verify the user Checking the display of the header menu options on the dashboard.	

		@Test()
		public void verifyDashboardheaderMenuOptionsAreDisplayed() {
			DashboardHeaderMenuOptionsPage dashboardinfo = new DashboardHeaderMenuOptionsPage(driver);
			
			dashboardinfo.verifyiftheDashboardOptionisDisplayedintheHeaderMenu();
			dashboardinfo.verifyiftheInvestmentAnalysisOptionisDisplayedintheHeaderMenu();
			dashboardinfo.verifyiftheMyReportsOptionisDisplayedintheHeaderMenu();
			dashboardinfo.verifyThemeSymbolisDisplayed();
			dashboardinfo.verifySettingsSymbolisDisplayed();
			dashboardinfo.verifyNotificationSymbolisdisplayed();
			dashboardinfo.verifyProfileIconisdisplayed();
		}

//TC-6 Verify the functionality of theme symbol on header menu
		
		@Test()
		public void verifytheThemeFunctionalityOnDashboard() {
			DashboardHeaderMenuOptionsPage dashboardinfo = new DashboardHeaderMenuOptionsPage(driver);
			
			dashboardinfo.verifytheThemeFunctionality();
		}
		
//TC-7 Verify the functionality of settings symbol on header menu
		
		@Test()
		public void verifySettingsFunctionalityOnDachboard() {
			DashboardHeaderMenuOptionsPage dashboardinfo = new DashboardHeaderMenuOptionsPage(driver);
			
			dashboardinfo.verifySettingsFunctionality();
			dashboardinfo.verifySettingsExpectedFunctionality();
		}
		
//TC-8 Verify the functionality notification(bell) symbol on header menu
		
		@Test
		public void verifyNotificationFunctionalityOnDashboard() {
			DashboardHeaderMenuOptionsPage dashboardinfo = new DashboardHeaderMenuOptionsPage(driver);
			
			dashboardinfo.verifyNotificationFunctionaliy();
			dashboardinfo.verifyNotificationExpectedfunctionality();
			
		}
		
//TC-9 Verify the profile icon is displayed and click on that dropdown appear
		
		@Test
	    public void verifyProfileIconAndDropdownOnDashboard() {
			DashboardHeaderMenuOptionsPage dashboardinfo = new DashboardHeaderMenuOptionsPage(driver);
			
			dashboardinfo.verifyProfileDropdownisDisplay();
			
		}
		
	

}
