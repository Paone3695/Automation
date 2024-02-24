package actionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src = driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
