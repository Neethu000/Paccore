package Paccore.pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTests {
	
	public WebDriver driver;
	public LogInPage landingpage;
	public WebDriver initializeDriver() throws IOException {
		
		//properties class
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Paccore\\resources\\GlobelData.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			// driver = new GeckoDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		return driver;
	}
	
	    public List<HashMap<String, String>> getJsonDatatoMap(String filePath) throws IOException {
		//read json to string
		String JsonContent=FileUtils.readFileToString(new File(filePath),
				StandardCharsets.UTF_8);
		//string to HashMap
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data =mapper.readValue(JsonContent, new TypeReference<List<HashMap<String,String>>>() {
		});
		return data;
	}

	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
	    // Cast the driver to TakesScreenshot
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    // Capture the screenshot and store it as a file
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    
	    // Define the destination file path
	    String destination = System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	    File finalDestination = new File(destination);
	    
	    // Copy the screenshot to the destination file
	    FileUtils.copyFile(source, finalDestination);
	    return destination;
	    
	}
	
	
	public void goTo()
	{
		driver.get("http://34.236.208.98/");
	}
	
	@Test(dataProvider="getData")
    public void signin(HashMap<String,String>input) throws IOException {
		//lanchApplication();
		driver = initializeDriver();
		goTo();
		LogInPage lp= new LogInPage(driver);
	    lp.LoginApplication(input.get("email"),input.get("password"));
	  
	    String expectedTitle = "Dashboard";
	    String actualTitle = lp.dashboardIsDisplay();
	    Assert.assertEquals(actualTitle, expectedTitle, "Dashboard does not match.");
		System.out.println("Login and Displayed :"+" "+actualTitle);

	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String,String>> data = getJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//Paccore//data//logIn.json");
		return new Object[][] {{data.get(0)}};
	}
	
	
	
	
}
