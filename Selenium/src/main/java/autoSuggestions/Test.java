package autoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selen");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		
		System.out.println(suggestions.size());
		Thread.sleep(3000);
		for(WebElement b:suggestions)
		{
			System.out.println(b.getText());
		
		}
		driver.close();

	}

}
