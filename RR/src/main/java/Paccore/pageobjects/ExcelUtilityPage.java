package Paccore.pageobjects;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelUtilityPage {
	
    private Workbook workbook;
 
    // Load Excel file
    public ExcelUtilityPage(String filePath) throws IOException {
    	
        FileInputStream fileInputStream = new FileInputStream(filePath);
        this.workbook = new XSSFWorkbook(fileInputStream);
    }
    

//    public String getCellData(int sheetNumber, int rowNumber, int cellNumber)
//      {
//
//          Sheet sheet = workbook.getSheetAt(sheetNumber);
//          Row row = sheet.getRow(rowNumber);
//          Cell cell = row.getCell(cellNumber);
//          //return cell.getStringCellValue();
//          
//          if (cell == null) {
//              return "";
//          }
//
//          switch (cell.getCellType()) {
//          
//              case STRING:
//                  return cell.getStringCellValue();
//
//              case NUMERIC:
//            	    if (DateUtil.isCellDateFormatted(cell)) {
//            	        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yy");
//            	        return dateFormat.format(cell.getDateCellValue());
//            	    } else {
//            	        double numericValue = cell.getNumericCellValue();
//            	        if (numericValue == (long) numericValue) {
//            	            return String.valueOf((long) numericValue);
//            	        } else {
//            	            return String.valueOf(numericValue);
//            	        }
//            	    }
//            	    
//              case BOOLEAN:
//                  return String.valueOf(cell.getBooleanCellValue());
//                  
//              case FORMULA:
//                  switch (cell.getCachedFormulaResultType()) {
//                      case STRING:
//                          return cell.getRichStringCellValue().toString();
//                      case NUMERIC:
//                          return String.valueOf(cell.getNumericCellValue());
//                      case BOOLEAN:
//                          return String.valueOf(cell.getBooleanCellValue());
//                      default:
//                          return "Unsupported Formula Result Type";
//                  }
//              case BLANK:
//                  return "";
//              default:
//                  return "Unsupported Cell Type";
//          }
//      
//
//
//      }
//   
//      // Close the workbook
//
//      public void close() throws IOException {
//
//          workbook.close();
//
//      }
   
      
    
    public String getCellData(int sheetNumber, int rowNumber, int cellNumber) {
        Sheet sheet = workbook.getSheetAt(sheetNumber);
        Row row = sheet.getRow(rowNumber);
        if (row == null) return ""; // If row is null, return empty string
        Cell cell = row.getCell(cellNumber);
        if (cell == null) return ""; // If cell is null, return empty string
 
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    // Handle date formatting
                    DateFormat dateFormat = new SimpleDateFormat("MM-dd-yy");
                    return dateFormat.format(cell.getDateCellValue());
                } else {
                    // Handle numeric formatting
                    double numericValue = cell.getNumericCellValue();
                    // If the numeric value is an integer, format without decimals
                    return numericValue == (long) numericValue ? String.valueOf((long) numericValue) : String.valueOf(numericValue);
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                // Handle formula results
                switch (cell.getCachedFormulaResultType()) {
                    case STRING:
                        return cell.getRichStringCellValue().toString();
                    case NUMERIC:
                        double formulaNumericValue = cell.getNumericCellValue();
                        return formulaNumericValue == (long) formulaNumericValue ? String.valueOf((long) formulaNumericValue) : String.valueOf(formulaNumericValue);
                    case BOOLEAN:
                        return String.valueOf(cell.getBooleanCellValue());
                    default:
                        return "Unsupported Formula Result Type";
                }
            case BLANK:
                return "";
            default:
                return "Unsupported Cell Type";
        }
    }
 
    // Method to close the workbook
    public void close() throws IOException {
        if (workbook != null) {
            workbook.close();
        }
    }
     
}
	
	 



