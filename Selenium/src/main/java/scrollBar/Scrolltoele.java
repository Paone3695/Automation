package scrollBar;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bind.annotation.Argument;

public class Scrolltoele {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		//Type Casting
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Shop now'])[1]"));
		Thread.sleep(3000);
	    jse.executeScript("arguments[0].click();",ele);
//	    ele.click();
	
	driver.close();
	}

}
