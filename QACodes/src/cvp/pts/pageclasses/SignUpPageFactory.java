package cvp.pts.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageFactory {
	WebDriver driver;
	public SignUpPageFactory (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="usernamereg-firstName")
	WebElement firstName;
	
	@FindBy(id="usernamereg-lastName")
	WebElement surName;
	
	@FindBy(id="usernamereg-yid")
	WebElement emailAddress;
	
	@FindBy(id="usernamereg-password")
	WebElement password;
	
	public void typeFirstName(String name) {
		firstName.sendKeys(name);
	}

	public void typeSurName(String surname) {
		surName.sendKeys(surname);
	}

	public void typeEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	
	

}
