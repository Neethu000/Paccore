package Paccore.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class UserInfoOnDashboardPage {
	WebDriver driver;
	
	public UserInfoOnDashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	// Excel Utility method to read data
	
    public String readExcelData(String excelFilePath, int sheetNumber, int rowNumber, int cellNumber) {
        String data = "";
        try {
            ExcelUtilityPage excelReader = new ExcelUtilityPage(excelFilePath);
            data = excelReader.getCellData(sheetNumber, rowNumber, cellNumber);
            excelReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
		
//UserInformation	
	
	@FindBy(xpath="//h5[contains(text(),'User Information')]")
    WebElement userinformation;
	
	public String UserInformation() {
		return userinformation.getText();
	}
	
	public void verifyUserInformationpanelisDisplayed() 
	{
		String expectedTitle = "User Information";
	    String actualTitle = UserInformation();
	    Assert.assertEquals(actualTitle, expectedTitle, "UserInformation does not match.");
		System.out.println("In Dashboard Displayed :"+" "+actualTitle);
	}

//user name
	
	@FindBy(xpath="(//div[@class='col-8 user__titile1'])[1]")
	WebElement username;
	
	public String getUsername() {
        return username.getText();
    }

    public void verifyUserNameIsDisplayed() {
        String expectedUsername = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 0, 0);
        System.out.println("Expected Username from Excel: " + expectedUsername);
        String actualUsername = getUsername();
        System.out.println("Actual Username from Web: " + actualUsername);
        Assert.assertEquals(actualUsername, expectedUsername, expectedUsername + " does not match.");
    }
	
//user email
	
	@FindBy(xpath="(//div[@class='col-8 user__titile1'])[2]")
	WebElement email;
	
	public String getEmail() {
		return email.getText();
	}
	
	public void verifyUserEmailIsDisplayed() 
	{
	     String expectedmail = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 1, 0);
	     System.out.println("Expected mail from Excel: " + expectedmail);
         String actualmail = getEmail();
         System.out.println("Actual mail from Web: " + actualmail);
         Assert.assertEquals(actualmail, expectedmail,expectedmail + " does not match.");
	}
	
//user phone number
	
	@FindBy(xpath="(//div[@class='col-8 user__titile1'])[3]")
	WebElement phonenumber;
	
	public String getPhoneNumber() {
		return phonenumber.getText();
	}
	
	public void verifyUserPhoneNumberisDisplayed() 
	{
		String expectedNumber = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 2, 0);
		System.out.println("Expected number from Excel: " + expectedNumber);
	    String actualNumber = getPhoneNumber();
	    System.out.println("Actual number from Web: " + actualNumber);
	    Assert.assertEquals(actualNumber, expectedNumber, " does not match.");
	}
	
//SubscriptionInformation
	
	@FindBy(xpath="//h5[contains(text(),'Subscription Information')]")
    WebElement subscriptioninformation;
	
	public String SubscriptionInformation() {
		return subscriptioninformation.getText();
	}
	
	public void verifyUserSubscriptionInformationisDisplayed() 
	{
		String expectedTitle = "Subscription Information";
	    String actualTitle = SubscriptionInformation();
	    Assert.assertEquals(actualTitle, expectedTitle, "SubscriptionInformation does not match.");
		System.out.println("In Dashboard Displayed :"+" "+actualTitle);
	}
	
//plan details: Pro Premium - $75/Month
	
	@FindBy(xpath="(//div[@class='col-5 col-lg-6 col-md-5 user__titile1'])[1]")
    WebElement plandetails;
	
	public String getPlanDetails() {
		return plandetails.getText();
	}
	
	public void verifyPlanDetailsAreDisplayed()
	{
		String expectedplan = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 3, 0);
		System.out.println("Expected plandetails from Excel: " + expectedplan);
	    String actualplan = getPlanDetails();
	    System.out.println("Actual plandetails from Web: " + actualplan);
	    Assert.assertEquals(actualplan, expectedplan, "Plan does not match.");
	}
	
//Amount
	
	@FindBy(xpath="(//div[@class='col-5 col-lg-6 col-md-5 user__titile1'])[2]")
    WebElement amount;
	
	public String getAmount() {
		return amount.getText();
	}
	
	public void verifyPlanAmountisDisplayed() 
	{
		String expectedAmount = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 4, 0);
		System.out.println("Expected amount from Excel: " + expectedAmount);
	    String actualAmount = getAmount();
	    System.out.println("Actual amount from Web: " + actualAmount);
	    Assert.assertEquals(actualAmount, expectedAmount, "Amount does not match.");  
	}
	
//subscription starts
	
	@FindBy(xpath="(//div[@class='col-5 col-lg-6 col-md-5 user__titile1'])[3]")
    WebElement startsdate;
	
	public String getSubscriptionStartsDate() {
		return startsdate.getText();
	}
	
	public void verifySubscriptionStartsDateisDisplayed()
	{
		String expectedStartDate = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 5, 0);
		System.out.println("Expected StartDate from Excel: " + expectedStartDate);
	    String actualStartDate = getSubscriptionStartsDate();
	    System.out.println("Actual StartDate from Web: " + actualStartDate);
	    Assert.assertEquals(actualStartDate, expectedStartDate, "Start date does not match.");	
	}
	
//Renewed Automatically
	
	@FindBy(xpath="(//div[@class='col-5 col-lg-6 col-md-5 user__titile1'])[4]")
    WebElement renewed;
	
	public String getRenewedDate() {
		return renewed.getText();
	}
	
	public void verifyRenewedAutomaticallyDateisDisplayed()
	{
		String expectedRenewDate = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 6, 0);
		System.out.println("Expected RenewDate from Excel: " + expectedRenewDate);
	    String actualRenewDate = getRenewedDate();
	    System.out.println("Actual RenewDate from Web: " + actualRenewDate);
	    Assert.assertEquals(actualRenewDate, expectedRenewDate, "Renewed date does not match.");
	}
	
//Plan Expires on
	
	@FindBy(xpath="(//div[@class='col-5 col-lg-6 col-md-5 user__titile1'])[5]")
    WebElement planexpires;
	
	public String getPlanExpiresDate() {
		return planexpires.getText();
	}
	
	public void verifyPlanExpiresDateisDisplayed()
	{
		String expectedPlanExpiresDate = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 7, 0);
		System.out.println("Expected PlanExpiresDate from Excel: " + expectedPlanExpiresDate);
	    String actualPlanExpiresDate = getPlanExpiresDate();
	    System.out.println("Actual PlanExpiresDate from Web: " + actualPlanExpiresDate);
	    Assert.assertEquals(actualPlanExpiresDate, expectedPlanExpiresDate, "Plan expired date does not match.");
	}
	
//Payment for the month 
	
	@FindBy(xpath="(//div[@class='col-5 col-lg-6 col-md-5 user__titile1'])[6]")
    WebElement payformonth;
	
	public String getPayForMonth() {
		return payformonth.getText();
	}
	
	public void verifyPaymentfortheMonthAmountisDisplayed()
	{
		String expectedPayforMonth = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 8, 0);
		System.out.println("Expected PayForMonth from Excel: " + expectedPayforMonth);
	    String actualPayforMonth = getPayForMonth();
	    System.out.println("Actual PayForMonth from Web: " + actualPayforMonth);
	    Assert.assertEquals(actualPayforMonth, expectedPayforMonth, "Payment for the month does not match.");
	}
	
//Total Payment
	
	@FindBy(xpath="(//div[@class='col-5 col-lg-6 col-md-5 user__titile1'])[6]")
    WebElement totalpay;
	
	public String getTotalPay() {
		return totalpay.getText();
	}
	
	public void verifyTotalPaymentAmountisDisplayed()
	{
		String expectedTotalPaymentAmount = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 9, 0);
		System.out.println("Expected TotalPay from Excel: " + expectedTotalPaymentAmount);
	    String actualTotalPaymentAmount = getTotalPay();
	    System.out.println("Actual TotalPay from Web: " + actualTotalPaymentAmount);
	    Assert.assertEquals(actualTotalPaymentAmount, expectedTotalPaymentAmount, "Total amount does not match.");	
	}
	
//User Reports
	
	@FindBy(xpath="//h5[contains(text(),'Reports')]")
    WebElement reports;
	
	public String Reports() {
		return reports.getText();
	}
	
	public void verifytheUserReportsareDisplayed()
	{
		String expectedTitle = "Reports";
	    String actualTitle = Reports();
	    Assert.assertEquals(actualTitle, expectedTitle, "Reports does not match.");
		System.out.println("In Dashboard Displayed :"+" "+actualTitle);	
	}

//Total no of Reports
	
	@FindBy(xpath="(//div[@class=' user__titile1'])[1]")
    WebElement totalnumofreports;
	
	public String getTotalNumofReports() {
		return totalnumofreports.getText();
	}
	
	public void verifytheTotalNumberofReportsareDisplayed()
	{
		String expectedTotalNumofReports = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 10, 0);
		System.out.println("Expected TotalNumofReports from Excel: " + expectedTotalNumofReports);
	    String actualTotalNumofReports = getTotalNumofReports();
	    System.out.println("Actual TotalNumofReports from Web: " + actualTotalNumofReports);
	    Assert.assertEquals(actualTotalNumofReports, expectedTotalNumofReports, "Total no of reports does not match.");	
	}
	
//Current no of Reports(Billing)
	
	@FindBy(xpath="(//div[@class=' user__titile1'])[2]")
    WebElement currentnumofreports;
	
	public String getCurrentNumofReports() {
		return currentnumofreports.getText();
	}
	
	public void verifytheCurrentNumberofReportsareDisplayed()
	{
		String expectedCurrentNumofReports = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 11, 0);
		System.out.println("Expected CurrentNumofReports from Excel: " + expectedCurrentNumofReports);
	    String actualCurrentNumofReports = getCurrentNumofReports();
	    System.out.println("Actual CurrentNumofReports from Web: " + actualCurrentNumofReports);
	    Assert.assertEquals(actualCurrentNumofReports, expectedCurrentNumofReports, "Current no of Reports(Billing) does not match.");
	}
	
//No of Reports (Not Billing)
	
	@FindBy(xpath="(//div[@class=' user__titile1'])[3]")
    WebElement numofreports;
	
	public String getNumofReports() {
		return numofreports.getText();
	}
	
	public void verifytheNumberofReportsareDisplayed()
	{
		String expectedNumofReports = readExcelData("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx", 0, 12, 0);
		System.out.println("Expected NumofReports from Excel: " + expectedNumofReports);
	    String actualNumofReports = getNumofReports();
	    System.out.println("Actual NumofReports from Web: " + actualNumofReports);
	    Assert.assertEquals(actualNumofReports, expectedNumofReports, "No of Reports (Not Billing) does not match.");
	}
	
//Number of Reports per Month
	
		@FindBy(xpath="//h5[contains(text(),'Number of Reports per Month')]")
	    WebElement graph;
		
		public String ReportspermonthInGraph() {
			return graph.getText();
		}
		
		public void verifytheNumberofReportsPerMonthGraphisDisplayed()
		{
			String expectedTitle = "Number of Reports per Month";
		    String actualTitle = ReportspermonthInGraph();
		    Assert.assertEquals(actualTitle, expectedTitle, "Number of Reports per Month does not match.");
			System.out.println("In Dashboard Displayed Graph is :"+" "+actualTitle);	
		}
		
        
    
    
    

                 
                 
         
                   
         
                   
         
              
         

      
         
        
        
        
        
}
          



