package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlPage {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
 
	WebDriver driver=new ChromeDriver();
 
 driver.get("file:///C:/Users/DELL%20LAPTOP/Desktop/webpage.html");
 //By Tag Name
 Thread.sleep(5000);
 driver.findElement(By.tagName("//a")).click();
 //By Class Locator
// driver.findElement(By.xpath("//a[@class='facebook']")).click();
 
//By LinkText Locator

// driver.findElement(By.linkText("Facebook")).click();
 driver.close();
 
 
 
	}

}
