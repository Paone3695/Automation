package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	private static Workbook wb;

	public static void main(String args[]) throws Throwable {
    //Open file in Read mode
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL LAPTOP\\Desktop\\Read Data.xlsx");
//		wb = new XSSFWorkbook(fis);
//		int rowcount = wb.getSheet("Sheet1").getLastRowNum();
//		for(int i=0;i<=rowcount;i++)
//		System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue());
//		 FileInputStream inputStream = new FileInputStream(file);

	        //creating workbook instance that refers to .xls file
	        Workbook wb=new XSSFWorkbook(fis);

	        //creating a Sheet object
	        Sheet sheet=wb.getSheet("Sheet1");
	        
	        //get all rows in the sheet
	        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        
	        //iterate over all the row to print the data present in each cell.
	        for(int i=0;i<=rowCount;i++){
	            
	            //get cell count in a row
	            int cellcount=sheet.getRow(i).getLastCellNum();
	            
	            //iterate over each cell to print its value
	            System.out.println("Row "+ i+" data is :");
	            
	            for(int j=0;j<cellcount;j++){
	                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
	            }
	            System.out.println();
	        }
	        wb.close();
	        fis.close();
		
		
	}

	
}
