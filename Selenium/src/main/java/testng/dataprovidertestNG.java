package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidertestNG {
	
		@DataProvider
		public Object[][] getData() {
			Object[][] obj=new Object[3][2];
			obj[0][0]="admin";
			obj[0][1]="manager";
			
			obj[1][0]="4354Sfdfgf";
			obj[1][1]="a$^%gfgg";
		
			obj[2][0]="45454";
			obj[2][1]="iuyhiu56765";
			
			return obj;
			
		}
		
		@Test(dataProvider = "getData")
		public void login(String username,String pwd) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("email")).sendKeys(username);
	    	driver.findElement(By.id("pass")).sendKeys(pwd);
	    	//driver.findElement(By.name("login")).click();
	    	Thread.sleep(5000);
	    	driver.close();
			
		}
		
	
		
}


	




