package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
	
	//Declaration
	@FindBy(name="q")
	private WebElement searchbtn;
	
	//Initiation
	
	public GoogleSearch(WebDriver driver){
		
	PageFactory.initElements(driver, this);
	}

	//Utilization
	
	public void search(String name)
	{
		searchbtn.sendKeys(name);
	}
	
}
