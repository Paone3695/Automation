package scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		//Type Casting
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		//Top to Bottom Scroll
		jse.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		//Bottom to Top  Scroll
		jse.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(3000);
		driver.close();

	}

}
