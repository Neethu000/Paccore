package Paccore.data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSeleniumAssertions {

	
	 
	
	 
	    private WebDriver driver;

	    private XSSFWorkbook workbook;

	    private XSSFSheet sheet;
	 
	    // Constructor to initialize WebDriver and Excel workbook

	    public ExcelSeleniumAssertions(String excelFilePath) throws IOException {

	        // Initialize WebDriver

	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        this.driver = new ChromeDriver();
	 
	        // Initialize Excel workbook

	        FileInputStream fis = new FileInputStream(excelFilePath);

	        this.workbook = new XSSFWorkbook(fis);

	        this.sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

	    }
	 
	    // Method to get cell data from Excel

	    private String getCellData(int rowIndex, int colIndex) {

	        XSSFRow row = sheet.getRow(rowIndex);

	        if (row == null) return "";

	        XSSFCell cell = row.getCell(colIndex);

	        if (cell == null) return "";
	 
	        switch (cell.getCellType()) {

	            case STRING:

	                return cell.getStringCellValue();

	            case NUMERIC:

	                return cell.getNumericCellValue() + "";

	            case BOOLEAN:

	                return cell.getBooleanCellValue() + "";

	            default:

	                return "Unsupported Cell Type";

	        }

	    }
	    
	    
	    public void close() throws IOException {
	        if (driver != null) {
	            driver.quit();
	        }
	        if (workbook != null) {
	            workbook.close();
	        }
	    }
	 
	
}
