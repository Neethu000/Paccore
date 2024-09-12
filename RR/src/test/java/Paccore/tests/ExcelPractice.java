package Paccore.tests;


	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
	import java.io.IOException;
	@Test 
	public class ExcelPractice{
	 
	    private static Workbook workbook;
	    private static Sheet sheet;
	 
	    // Load the Excel file and specify the sheet name
	    public static void setExcelFile(String filePath, String sheetName) throws IOException {
	        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx");
	        workbook = new XSSFWorkbook(fileInputStream);
	        sheet = workbook.getSheet(sheetName);
	    }
	 
	    // Get cell data by row and column index
	    public static String getCellData(int rowIndex, int colIndex) {
	        Row row = sheet.getRow(rowIndex);
	        Cell cell = row.getCell(colIndex);
	        return cell.getStringCellValue();
	    }
	}
	
	

