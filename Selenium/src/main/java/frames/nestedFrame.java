package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nestedFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	    driver.findElement(By.id("name")).sendKeys("Testing");//main Page
	    Thread.sleep(3000);
	    driver.switchTo().frame("frm3");// sub frame3
	    Thread.sleep(3000);
	    driver.findElement(By.id("name")).sendKeys("Frame3");
	    driver.switchTo().frame(driver.findElement(By.id("frm2")));//nested frame
	    Thread.sleep(3000);
	    driver.findElement(By.id("firstName")).sendKeys("Admin");
	    Thread.sleep(3000);
	    driver.findElement(By.id("lastName")).sendKeys("Manager");
	    driver.switchTo().parentFrame();//sub frame
	    driver.findElement(By.id("name")).sendKeys("Frame3-Parentframe3");
	    driver.switchTo().defaultContent();// return to main frame
	    driver.findElement(By.id("name")).sendKeys("--DefaultContents");
	    
	    Thread.sleep(3000);
	    driver.close();
	    
	}

}
