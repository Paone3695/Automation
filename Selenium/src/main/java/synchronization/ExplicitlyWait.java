package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//ExplicitlyWait
		/*WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement email = driver.findElement(By.name("email"));
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("manager");
		
		String title=driver.getTitle();
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		
		*/
		
        driver.close();
	}

}
