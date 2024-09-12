package Paccore.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.UserInfoOnDashboardPage;

public class UserInfoOnDashboardTest extends BaseTests {
	
//TC-1 Verify if user information (name, email, phone number) is displayed on the Dashboard.
	
	@Test
	public void verifyUserInformationIsDisplayed() throws IOException {
		UserInfoOnDashboardPage dashboardinfo = new UserInfoOnDashboardPage(driver);
		
		dashboardinfo.verifyUserInformationpanelisDisplayed();		
		dashboardinfo.verifyUserNameIsDisplayed();
		dashboardinfo.verifyUserEmailIsDisplayed();
		dashboardinfo.verifyUserPhoneNumberisDisplayed();	
	}
	
//TC-2 Verify if subscription information(plan details, amount, subscription start date, 
//renewed automatically on, trail plan expires on, payment for the month, total payment)is displayed on the dashboard.
	
	@Test()
	public void verifyUserSubscriptionInformationIsDisplayed() {
		UserInfoOnDashboardPage dashboardinfo = new UserInfoOnDashboardPage(driver);
		
		dashboardinfo.verifyUserSubscriptionInformationisDisplayed();
		dashboardinfo.verifyPlanDetailsAreDisplayed();
		dashboardinfo.verifyPlanAmountisDisplayed();
		dashboardinfo.verifySubscriptionStartsDateisDisplayed();
		dashboardinfo.verifyRenewedAutomaticallyDateisDisplayed();
		dashboardinfo.verifyPlanExpiresDateisDisplayed();
		dashboardinfo.verifyPaymentfortheMonthAmountisDisplayed();
		dashboardinfo.verifyPlanAmountisDisplayed();
				
}
	
//TC-3 Verify the user reports (total number of reports, current number of reports under billing, number of reports not under billing).
	
	@Test()
	public void verifyUserCreatedReportsAredisplayed() {
		UserInfoOnDashboardPage dashboardinfo = new UserInfoOnDashboardPage(driver);
		
		dashboardinfo.verifytheUserReportsareDisplayed();
		dashboardinfo.verifytheTotalNumberofReportsareDisplayed();
		dashboardinfo.verifytheCurrentNumberofReportsareDisplayed();
		dashboardinfo.verifytheNumberofReportsareDisplayed();
	}

//TC-4 Verify if the number of reports per month graph is displayed on the dashboard, showing residential, commercial, and DSCR 
//categories. The graph should have the X-axis indicating the reports count and the Y-axis indicating the month/year.	
	
	@Test()
	public void verifynumberofReportsperMonthDisplayedGraphicalReprasentation() {
		UserInfoOnDashboardPage dashboardinfo = new UserInfoOnDashboardPage(driver);
		
		dashboardinfo.verifytheNumberofReportsPerMonthGraphisDisplayed();	
	}
	

	
	
}

