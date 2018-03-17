package cvp.pts.pageclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public WebDriver driver;
	public String baseUrl;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C://Users//filhagos//Downloads//geckodriver-v0.19.1-win64//geckodriver.exe");
		driver=new FirefoxDriver();
    	baseUrl="https://login.yahoo.com/account/create?src=ym&intl=nz&lang=en-NZ&done=https%3A%2F%2Fnz.mail.yahoo.com%2F&specId=yidReg";
		
		// Maxmize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void exitTest() {
		driver.quit();
	}
}
