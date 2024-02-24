package excelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {
	
	public static void main(String[] args) throws Throwable {
		
		
		
		String path = "C:\\Users\\DELL LAPTOP\\Desktop\\WriteData.xlsx";
		
		FileInputStream fs = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
	
		for(int i=0; i<=lastRow; i++){
		Row row = sheet1.getRow(i);
		Cell cell = row.createCell(2);
		System.out.println(lastRow);
		cell.setCellValue("WriteintoExcel");
	

		}

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
	}

}
