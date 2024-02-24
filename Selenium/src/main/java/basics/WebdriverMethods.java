package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Get Title,Verify Login page
	String actualTitle=driver.getTitle();
	String expectedtitle="Facebook – log in or sign up";
	
	if(expectedtitle.equals(actualTitle))

		System.out.println("Facebook – log in or sign up Page is Displayed,Pass");
	
	else 
		System.out.println("Facebook – log in or sign up is not Displayed,Fail");

	
	//Verify Page URL
	String	actualURL=driver.getCurrentUrl();
	String ExpectedURL="https://www.facebook.com/";
	
	if(actualURL.equals(ExpectedURL))

		System.out.println("Facebook URL is Displayed,Pass");
	
	else 
		System.out.println("Facebook URL is not Displayed,Fail");
	
	//to Get PageSource
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	
	driver.close();	
	
	}

}
