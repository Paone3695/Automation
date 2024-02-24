package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class fbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	driver.findElement(By.id("email")).sendKeys("admin");
    	driver.findElement(By.id("pass")).sendKeys("manager");
    	driver.findElement(By.name("login")).click();
    	String title = driver.getTitle();
    	System.out.println(title);
    	//Reporter.log(title,true);
//    	String url = driver.getCurrentUrl();
	}

}
