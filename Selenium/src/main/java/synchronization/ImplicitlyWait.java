package synchronization;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='usernames']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@type='passwo+rd']")).sendKeys("manager");
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	   driver.close();

	}

}
