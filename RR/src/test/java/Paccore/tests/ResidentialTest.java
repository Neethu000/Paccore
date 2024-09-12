package Paccore.tests;

import org.testng.annotations.Test;

import Paccore.pageobjects.BaseTests;
import Paccore.pageobjects.ResidentialPage;

public class ResidentialTest extends BaseTests {
	
	@Test
	public void verifytheResidentialReportCreationWhatInThatDisplayed() {
		
		ResidentialPage residential = new ResidentialPage(driver);
		
		residential.verifytheinvestmentdropdownClicking();
		residential.verifyindropdownResidentialClicking();
		
	//PopUp Closing
		
		residential.verifyindropdownResidentialpopUpClosingButtonClicking();
		
	//Residential Creation Page is displayed
		
		residential.verifyAfterclickOnResidentialDispayedResidentialReportCreationPage();
	 
	//Investment Summary Table,Investment Details table and Investment Analysis table
		
		residential.verifySummaryTableAndGetText();
		residential.verifyDetailsTableAndGetText();
		residential.verifyAnalysisTableAndGetText();

//Property Details dropdown clicking and get the text
		
		residential.verifyPropertyDetailDropdownClicking();
		residential.verifyPropertyDetailsFieldisdisplayed();
		
		
		
		
	}
	
	

}
