package PageObejects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class po_Registeration extends Baseclass{

	public po_Registeration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement Fstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement Lstname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmpassword;
	@FindBy(xpath="//input[@name='agree']")
	WebElement policy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	
public void setfname(String fname)
{
	Fstname.sendKeys(fname);
}
public void setlname(String lname)
{
	Lstname.sendKeys(lname);
}
public void setemail(String Email)
{
	email.sendKeys(Email);
	
}
public void settelephn(String stelephon)
{
telephone.sendKeys(stelephon);
}
public void setsetpswd(String Pswd)
{
	password.sendKeys(Pswd);
}
public void setcpaswd(String pswd)
{
	confirmpassword.sendKeys(pswd);
}
public void setpolicy()
{
	policy.click();
}
public void setcontinue()
{
	btncontinue.click();
	//btncontinue.submit();
}
public String confimsg()
{
	try
	{
		return(msgconfirmation.getText());
		
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
	
}
}
