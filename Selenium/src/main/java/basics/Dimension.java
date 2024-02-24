package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dimension {

	



	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		//Dimension
		/*org.openqa.selenium.Dimension d =new org.openqa.selenium.Dimension(600,400);
	    driver.manage().window().setSize(d);
	    Thread.sleep(2000);*/

		//Position
//	    Point p=new Point(500,300);
//	    driver.manage().window().setPosition(p);
	   
		//Navigate Methods
		
	    driver.manage().window().maximize();
	    driver.navigate().to("https://web.whatsapp.com/");
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    driver.close();
		
	}

}
