package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
		
	    WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//a[text()='java']")).click();
	    
	    WebElement elem=driver.findElement(By.id("add"));
	
        act.doubleClick(elem).perform();
        
        Thread.sleep(3000);
        driver.close();
	}

}
