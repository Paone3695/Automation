package testng;

import static org.testng.AssertJUnit.assertEquals;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HardAssertion {
	
	public WebDriver driver;
	
    @BeforeMethod
    public void openApp() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    
    
    @Test
    public void Login() {
    	driver.findElement(By.id("email")).sendKeys("admin");
    	driver.findElement(By.id("pass")).sendKeys("manager");
    	driver.findElement(By.name("login")).click();
    	String title = driver.getTitle();
    	Reporter.log(title,true);
    	
    	org.testng.Assert.assertEquals(title, "Facebook – log in or sign up");
    	//Java exception will come for Hard Assert as "AssertionError" Next lines of code will not executed
    	
    	String url = driver.getCurrentUrl();
    	Reporter.log(url,true);
    }
    
    @AfterMethod
    public void closeApp() {
    	
    	driver.close();
    }
    
    
    
}





