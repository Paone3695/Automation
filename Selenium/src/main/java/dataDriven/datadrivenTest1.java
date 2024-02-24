package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadrivenTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Properties p =new Properties();		
		FileInputStream fis=new FileInputStream("./data.properties");
		p.load(fis);
		
		driver.get(p.getProperty("link"));
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("pwd"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
//		driver.close();
		

		
	}

}
