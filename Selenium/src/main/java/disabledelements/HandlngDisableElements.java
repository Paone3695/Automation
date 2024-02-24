package disabledelements;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlngDisableElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DELL%20LAPTOP/Desktop/Disable%20Element.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
	   WebElement pwdbtn = driver.findElement(By.id("i2"));
	   
	   if(pwdbtn.isEnabled())
	   {
		   System.out.println("Password Text Field is Enabled: Enter Password");
		   pwdbtn.sendKeys("manager");
	   }
	   else {
		   
		   System.out.println("Password Text Field is Disabled: Handle through javaScript");
		   JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("document.getElementById('i2').value='manager'");
	   }
	   
	   Thread.sleep(3000);
	   driver.close();

	}

}
