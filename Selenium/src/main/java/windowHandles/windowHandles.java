package windowHandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();

		   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String parent = driver.getWindowHandle();
        System.out.println(parent);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
        driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();

     Set<String> child = driver.getWindowHandles();
     for(String b :child ) {
    	 driver.switchTo().window(b);
    	 System.out.println(b);
     }
  
     
     driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Pavan");
     Thread.sleep(2000);
     driver.quit();
	}

}
