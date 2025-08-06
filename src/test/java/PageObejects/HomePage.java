package PageObejects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Baseclass {

	public HomePage(WebDriver driver) {
		super(driver);
		}
	
		// TODO Auto-generated constructor stub
		@FindBy(xpath="//span[normalize-space()='My Account']")
		WebElement Myaccount;
		@FindBy(xpath="//a[normalize-space()='Register']")
		WebElement lnkregister;
	
	public void clickmyaccnt()
	{
		Myaccount.click();
	}
	public void clickregistration()
	{
		lnkregister.click();
	}

	//https://demo.opencart.com/
}
