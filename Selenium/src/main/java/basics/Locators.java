package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
	// WebDriverManager.chromedriver().setup();
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://integrator.actitime.com/auth/at");
	 //By Name
	 driver.findElement(By.name("actiTimeUrl")).sendKeys("192.168.1.55");
		//input[@type='text'])[1]
	 //By xpath
	 driver.findElement(By.xpath("(//input[@class='ZmCOM'])[2]")).sendKeys("admin");
	 
     driver.close();
	}

}
