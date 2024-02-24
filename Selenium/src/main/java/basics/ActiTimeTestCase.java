package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeTestCase {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
    //Login Page
	String actualtitle=driver.getTitle();
	String expectedTitle="actiTIME - Login";
	if(actualtitle.equals(expectedTitle))
		System.out.println("Login Page is Displayed,PASS");
	else
		System.out.println("Login Page is not Dispalyed,FAIL");
	
	//HomePage
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(5000);
	String actualHomePage=driver.getTitle();
	String expectedHomePage="actiTIME - Enter Time-Track";
	if(actualHomePage.equals(expectedHomePage))
		System.out.println("HomePage is Displayed,PASS");
	else
		System.out.println("HomePage is Displayed,FAIL");
	
	driver.close();
	
	}

}
 