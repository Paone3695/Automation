package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     
     WebDriver driver=new ChromeDriver();
     
     driver.manage().window().maximize();
     
   driver.get("https://www.facebook.com/");
   driver.close();
   
   
    		 
	}

}
