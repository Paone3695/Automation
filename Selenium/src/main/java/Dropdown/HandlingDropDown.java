package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	
	WebElement DropDown=driver.findElement(By.id("gh-cat"));
	
	//select Class Used to Handle Dropdown
	 Select sel=new Select(DropDown);
	 Thread.sleep(3000);
	 //select by Index
	 sel.selectByIndex(10);
	 Thread.sleep(3000);
	 //select by Value
	 sel.selectByValue("550");
	 Thread.sleep(3000);
	 //selectByVisibleText
	 sel.selectByVisibleText("Coins & Paper Money") ;
	 Thread.sleep(3000);
	 
	/*If we deselect value in Single select dropdown We Get,
	 java.lang.UnsupportedOperationException
     sel.deselectByIndex(5);*/
	

    driver.close();

	}

}
