package cvp.pts.pagetest;
import cvp.pts.pageclasses.*;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest extends BaseClass{
	
		
	@Test
	public void test() throws InterruptedException {
		SignUpPageFactory signUp=PageFactory.initElements(driver, SignUpPageFactory.class);

		signUp.enterFirstName("Fil");
		signUp.enterSurName("Tom");
		signUp.enterEmailAddress("fil110tom92");
		signUp.enterPassword("whatis2at911");
		signUp.selectCountryCode("AO");
		signUp.enterPhoneNumber("20220022");
		signUp.selectBirthMonth("August");
		signUp.enterBornDay("2");
		signUp.enterBornYear("1980");
		signUp.selectGender("Female");
		Thread.sleep(4000);
		String expectedResult="Verify your account";
		String actualResult=driver.findElement(By.xpath(".//*[@id='phone-verify-challenge']/h2")).getText();
		Assert.assertEquals(actualResult, expectedResult);

	
	}
}
