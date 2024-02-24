package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup {

	public static void main(String[] args) throws InterruptedException {
 		 WebDriverManager.chromedriver().setup();
         ChromeOptions c=new ChromeOptions();
         c.addArguments("--disable-notifications");
		   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		Thread.sleep(2000);
	
		driver.close();

	}

}
