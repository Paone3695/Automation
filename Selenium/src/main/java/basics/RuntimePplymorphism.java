package basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RuntimePplymorphism {
	
	public static void main(String[] args) { 
		WebDriverManager.chromedriver().setup();
    	WebDriverManager.firefoxdriver().setup();
		
		System.out.println("Enter Browser Name");
		WebDriver driver=null;
		
		//Takes Arguments From the USer
	    Scanner sc = new Scanner(System.in);
	    
		String str = sc.next();
		
		if(str.equalsIgnoreCase("chrome"))
		{
			driver  = new ChromeDriver();
		}
		else if (str.equalsIgnoreCase("firefox"))
		{
			driver  = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Give a Proper Browser Name");
		}
		
//       	driver.close();
	}

}
