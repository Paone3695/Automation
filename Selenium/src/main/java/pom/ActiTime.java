package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basics.WebdriverMethods;

public class ActiTime {
	//Declaration
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password ;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement login;
	//Initialization
	public ActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	//Utilizationpassword
		
	public void textboxusername(String name)
	{
		username.sendKeys(name);
	}
	
	public void textboxpassword(String name)
	{
		password.sendKeys(name);
	}
	public void loginbtn()
	{
		login.click();
	}
	
	
	
	
	
	
	

}
