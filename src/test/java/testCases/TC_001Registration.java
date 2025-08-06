package testCases;

import org.apache.commons.lang3.RandomStringUtils;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObejects.HomePage;
import PageObejects.po_Registeration;

public class TC_001Registration extends Baseclass {
	
@Test

	public void verify_account_reg()
	{
	try
	{
	logger.info("*****starting testcase************8");
	HomePage hp=new HomePage(driver);
	hp.clickmyaccnt();
	logger.info("****clicking my account");
	hp.clickregistration();
	logger.info("&&&&&&clicking on regidtration link******");
	po_Registeration pore=new  po_Registeration(driver);
	logger.info("&&&&&& providing customer details******");
	
	pore.setfname(randomstr().toUpperCase());
	pore.setlname(randomstr().toUpperCase());
	pore.setemail(randomstr()+"@gmail.com");
	pore.settelephn(randomAlphanumeric());
	String passwordd=randomAlphanumeric();//only calling 1 time for password
	pore.setsetpswd(passwordd);
	pore.setcpaswd(passwordd);
	
	pore.setpolicy();
	pore.setcontinue();
	String cmsg=pore.confimsg();
	Assert.assertEquals(cmsg, "Your Account Has Been Created!");
	logger.info("&&&&&& confirmation of registration done******");

	
	}
catch(Exception e)
{
	logger.error("test got failed");
	logger.debug("Debug logss");
	Assert.fail();
	}
}

}
