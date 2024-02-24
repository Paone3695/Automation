package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotParticulaeEle {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		String systemDate = new Date().toString().replace(":","_").replace("","_");
		WebElement ele = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
     //	TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest= new File(".//Screenshots//"+systemDate+".png");
		
		FileUtils.copyFile(src,dest);		
		
		
		Thread.sleep(3000);
		
		
		driver.close();

	}

}
