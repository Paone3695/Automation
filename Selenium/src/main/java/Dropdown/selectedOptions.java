package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectedOptions {
	
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
//		WebElement firstopt=sel.getFirstSelectedOption();
//		System.out.println(firstopt);
	    List<WebElement>allselopt=sel.getAllSelectedOptions();
	
	for(WebElement Text:allselopt) {
		System.out.println(Text.getText());
	}
	driver.close();
	
	}
}
