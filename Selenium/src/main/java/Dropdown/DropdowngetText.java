package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdowngetText {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/");
	WebElement DropDown=driver.findElement(By.name("addresstype"));
	Select sel=new Select(DropDown);
	Thread.sleep(4000);
	//To Get All Options Text and Size
    List<WebElement> alloptions =sel.getOptions();
   System.out.println( alloptions.size());
    for(WebElement opt:alloptions)
    {
   	 System.out.println(opt.getText());
    }
	Thread.sleep(4000);
    driver.close();

	}

}
