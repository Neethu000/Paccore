package Paccore.tests;

import org.testng.annotations.Test;

import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.ProfileDropdownPage;

public class ProfileDropdownTest extends BaseTests {

//TC-12 Checking the display and navigation of the profile icon dropdown(My Profile)
	
	@Test
	public void verifyMyProfileNavigation() {
		ProfileDropdownPage profiledropdown= new ProfileDropdownPage(driver);
		
		profiledropdown.verifyMyProfileDropdownclick();
		profiledropdown.verifytheclickonMyprofile();
		profiledropdown.verifyinDropdownclickMyprofilethenMyprofilePageIsDisplayed();
		
	}

//TC-13 Checking the display and navigation of the profile icon dropdown(FAQs)
        @Test
		public void verifyMyFAQsNavigation() {
		ProfileDropdownPage profiledropdown= new ProfileDropdownPage(driver);
			
		profiledropdown.verifyMyProfileDropdownclick();
		profiledropdown.verifyclickonFAQs();
		profiledropdown.verifyinDropdownclickOnFAQsthenFAQsPageIsDisplayed();
		
		}

//TC-14 Checking the display and navigation of the profile icon dropdown(ManagePayment)

        @Test
		public void verifyManagePaymentNavigation() {
		ProfileDropdownPage profiledropdown= new ProfileDropdownPage(driver);
					
		profiledropdown.verifyMyProfileDropdownclick();
		profiledropdown.verifyManagePaymentisdisplayed();
		profiledropdown.verifyManagePaymentExpectedfunctionality();
		
	    }
		
//TC-15 Checking the display and navigation of the profile icon dropdown(Account Settings)

        @Test
		public void verifyAccountSettingsNavigation() {
		ProfileDropdownPage profiledropdown= new ProfileDropdownPage(driver);
		
		profiledropdown.verifyMyProfileDropdownclick();
		profiledropdown.verifyAccountSettingsisdisplayed();
		profiledropdown.verifyAccountSettingsExpectedfunctionality();
		}
			
//TC-16 Checking the display and navigation of the profile icon dropdown(Terms & Conditions)
        
        @Test
		public void verifyTermsConditionsNavigation() {
		ProfileDropdownPage profiledropdown= new ProfileDropdownPage(driver);
		
		profiledropdown.verifyMyProfileDropdownclick();
		profiledropdown.verifyTermsConditionsisdisplayed();
		profiledropdown.verifyTermsConditionsExpectedfunctionality();
		
        }
        
//TC-17 Checking the display and navigation of the profile icon dropdown(Privacy Policy)    
        
        @Test
		public void verifyPrivacyPolicyNavigation() {
		ProfileDropdownPage profiledropdown= new ProfileDropdownPage(driver);
		
		profiledropdown.verifyMyProfileDropdownclick();
		profiledropdown.verifyPrivacyPolicyisdisplayed();
		profiledropdown.verifyPrivacyPolicyExpectedfunctionality();
		
        }


}
