package actionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		WebElement element = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
        //Actions Class
	    Actions act=new Actions(driver);
	    act.moveToElement(element).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Samsung']")).click();
	    System.out.println("executed ");
	    Thread.sleep(2000);
	    driver.close();
	
			
	}
}
