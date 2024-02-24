package scrollBar;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrolltoParticularEle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		//Type Casting
		JavascriptExecutor jse=  (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//span[text()='Discover more']"));
		Point loc = ele.getLocation();
//		int x = loc.getX();
////		int y = loc.getY();
//		System.out.println(x);
//    	System.out.println(y);
		jse.executeScript("window.scrollBy"+loc);
		Thread.sleep(3000);
		ele.click();
		Thread.sleep(3000);
		driver.close();
	}

}
