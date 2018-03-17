package cvp.pts.pageclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageFactory {

	static WebDriver driver;

	@FindBy(id = "usernamereg-firstName")
	private WebElement firstName;

	@FindBy(id = "usernamereg-lastName")
	private WebElement surName;

	@FindBy(id = "usernamereg-yid")
	private WebElement emailAddress;

	@FindBy(id = "usernamereg-password")
	private WebElement password;

//	.//*[@id='regform']/div[3]/div[2]/div/select
	@FindBy(id ="country-code-lbl-aria")
	private static  WebElement countryCode;

	@FindBy(id="usernamereg-phone")
	private WebElement phoneNumber;
	
	@FindBy(id="usernamereg-month")
	private static WebElement birthMonth;
	
	@FindBy(id="usernamereg-day")
	private WebElement dayBorn;
	
	@FindBy(id="usernamereg-year")
	private WebElement yearBorn;
	
	@FindBy(id="reg-submit-button")
	private WebElement continueButton;
	//reg-gender-list
	//usernamereg-freeformGender
	
	@FindBy(id="usernamereg-freeformGender")
	private WebElement genderType;
	
	
	public SignUpPageFactory(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver,this);
	}

	public void enterFirstName(String name) throws InterruptedException {
		if (firstName.isDisplayed()) {
			firstName.clear();
			firstName.sendKeys(name);
			Thread.sleep(2000);
		} else {
			System.out.println("firstName element not found");
		}
	}

	public void enterSurName(String surname) throws InterruptedException {
		if (surName.isDisplayed()) {
			surName.clear();
			surName.sendKeys(surname);
			Thread.sleep(2000);
		} else {
			System.out.println("surName element not found");
		}
	}

	public void enterEmailAddress(String email) throws InterruptedException {
		if (emailAddress.isDisplayed()) {
			emailAddress.clear();
			emailAddress.sendKeys(email);
			Thread.sleep(2000);
		} else {
			System.out.println("email element not found");
		}
	}

	public void enterPassword(String pass) throws InterruptedException {
		if (password.isDisplayed()) {
			password.clear();
			password.sendKeys(pass);
			Thread.sleep(2000);
		} else {
			System.out.println("Password element not found");
		}
	}

	public static void selectCountryCode(String code) throws InterruptedException {
		if(countryCode.isDisplayed()) {	
			countryCode.click();
//			Select selectPurpose = new Select(driver.findElement(By.xpath(".//*[@id='regform']/div[3]/div[2]/div/select/option")));
//			selectPurpose.selectByValue(code);
//			Thread.sleep(2000);
		} else
		{
			System.out.println("countryCode element not found");
		}
	}

	public void enterPhoneNumber(String numb) throws InterruptedException {
		if(phoneNumber.isDisplayed()) {
			phoneNumber.clear();
			phoneNumber.sendKeys(numb);
			Thread.sleep(2000);
		} else
		{
			System.out.println("Phone number element not found");
		}
	}
	
	public static void selectBirthMonth(String month) throws InterruptedException {
		if(birthMonth.isDisplayed()) {	
		Select selectPurpose = new Select(birthMonth);
			selectPurpose.selectByVisibleText(month);
			Thread.sleep(2000);
		} else
		{
			System.out.println("birth month element not found");
		}
	}
	
	public void enterBornDay(String day) throws InterruptedException {
		if (dayBorn.isDisplayed()) {
			dayBorn.clear();
			dayBorn.sendKeys(day);
			Thread.sleep(2000);
		} else {
			System.out.println("born day element not found");
		}
	}
	
	public void enterBornYear(String year) throws InterruptedException {
		if (yearBorn.isDisplayed()) {
			yearBorn.clear();
			yearBorn.sendKeys(year);
			Thread.sleep(2000);
		} else {
			System.out.println("born year element not found");
		}
	}
	
	public void clickContinueButton() throws InterruptedException {
		if (continueButton.isDisplayed()) {
			continueButton.click();
			Thread.sleep(2000);
		} else {
			System.out.println("continue button not found");
		}
	}	

	public void selectGender(String gender) throws InterruptedException {
		if(genderType.isDisplayed()) {	
			genderType.click();
			if(gender=="Female")
			{
				driver.findElement(By.xpath(".//*[@id='reg-gender-list']/li[1]")).click();
			} 
			else if(gender=="Male")
			{
				driver.findElement(By.xpath(".//*[@id='reg-gender-list']/li[2]")).click();
			}
		} else 
		{
			System.out.println("Gender element not found");
		}
	}
}
