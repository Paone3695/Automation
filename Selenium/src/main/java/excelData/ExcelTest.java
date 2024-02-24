package excelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		   WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
        //Used to join with Apache POI to read data from Excel
		FileInputStream fis = new FileInputStream("./Data.xlsx");
		
		//Workbook class represents an Excel workbook  for xls HSSF Workbook and XSSFWorkbook for xlsx
	    Workbook wb = new XSSFWorkbook(fis);//.create(fis);
	    	
	    
	   String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	   String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	   String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
		 
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println(url);
		System.out.println(username);
		System.out.println(pwd);
	     driver.close();
        //To Release System Resources
	     wb.close();
	     fis.close();

	}

}
