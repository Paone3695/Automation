package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDD {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DELL%20LAPTOP/Desktop/MultipleDD.html");
		WebElement DropDown=driver.findElement(By.id("Dropdown"));
		
		Select sel=new Select(DropDown);
		
		//Selecting Multiple Options
		sel.selectByIndex(0);
		sel.selectByVisibleText("SQL");
		sel.selectByValue("d");
		Thread.sleep(3000);
//		sel.deselectByIndex(0);
//		Thread.sleep(3000);
//		sel.deselectByVisibleText("SQL");
////		sel.deselectAll();
//		Thread.sleep(3000);
//		sel.deselectByValue("d");
//		Thread.sleep(3000);
		//To check multiple Dropdown Or Not
				if(sel.isMultiple())
					sel.deselectAll();
				else
					System.out.println("Single Dropdown");
		
		
		
		driver.close();

	}

}
