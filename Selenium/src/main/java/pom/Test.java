package pom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.actitime.com/login.do");
		 
		 driver.navigate().refresh();
		 GoogleSearch g=new GoogleSearch(driver);
		 g.search("Selenium");
		 
//		 ActiTime t=new ActiTime(driver);
//		 t.textboxusername("admin");
//		 t.textboxpassword("manager");
//		 t.loginbtn();
//		
				 
		 Thread.sleep(5000);
		 driver.close();
		 

	}

}
