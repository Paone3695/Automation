package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	    driver.findElement(By.id("name")).sendKeys("Testing");
	    driver.switchTo().frame("frm1");
	    Select sel = new Select(driver.findElement(By.id("course")));
	    sel.selectByVisibleText("Java");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("name")).sendKeys("Automation");
	    Thread.sleep(3000);
	    
	    driver.close();

	}

}
