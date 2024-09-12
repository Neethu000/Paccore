package Paccore.data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataDriven {
	
	
	@Test
	public void getData() throws IOException{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\dashboard.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet= wb.getSheetAt(0);
	
		int rowsCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		        
		int colCount = row.getLastCellNum();
		Object data[][] = new Object[rowsCount - 1][colCount];

		// Print header row
		        
		 for (int j = 0; j < colCount; j++) 
		 {
		     if (row.getCell(j) != null) 
		     {
		         System.out.print(row.getCell(j) + "\t");
		     } 
		     else {
		          System.out.print("Empty\t");
		          }
		 }
		          System.out.println(); // New line after header

		 // Print data rows
		 for (int i = 0; i < rowsCount - 1; i++)
		 {
		     row = sheet.getRow(i + 1);
		            
		     if (row != null) 
		      { // Add null check for row
		          for (int j = 0; j < colCount; j++) 
		        {
		          if (row.getCell(j) != null) 	
		             { // Add null check for cell
		              System.out.print(row.getCell(j) + "\t");
		             }
		        }
		              System.out.println(); // New line after each row
		            } 
		            else {
		                System.out.println("Row is empty at row " + (i + 1));
		            }
		  }
		
		

		    }
}



		
	
		
		
		
		
		
		
	


