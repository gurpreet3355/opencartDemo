package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class Baseclass {
	public Logger  logger;
	WebDriver driver;
	@BeforeClass
	
	public void setup()
	{
		logger=LogManager.getLogger(this.getClass());
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origions=*");
		driver=new ChromeDriver(op);
		driver.manage().deleteAllCookies();
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
@AfterClass
public void teardown()
{
	driver.close();
}
public String randomAlphanumeric() {
	// TODO Auto-generated method stub
	String generatednum=RandomStringUtils.randomAlphanumeric(10);
	return generatednum;
}
	public String randomstr()
	{
		String genratedstring=RandomStringUtils.randomAlphabetic(7);
		return genratedstring;
		
	}
	public String randomstrnumeric()
	{
		String genratedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednum=RandomStringUtils.randomAlphanumeric(4);
		return (genratedstring+"@"+generatednum);
		
	}
}
