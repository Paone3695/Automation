package basics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByTraversing {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://yuvadhwaja.in/index.html");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//button[@class='_2KpZ6l _2doB4z']
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='navbarDropdownPortfolio']"));
		
		driver.findElement(By.xpath("//a[text()='Home']/ancestor::ul/descendant::a[text()='English']")).click();
		
		
		
		
		
		
		
		
		driver.close();
		

	}

}
