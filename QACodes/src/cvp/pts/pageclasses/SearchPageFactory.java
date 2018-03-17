package cvp.pts.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {

	@FindBy(id="usernamereg-firstName")
	WebElement firstName;
	
	@FindBy(id="usernamereg-lastName")
	WebElement surName;
	
	@FindBy(id="usernamereg-yid")
	WebElement emailAddress;
	
	@FindBy(id="usernamereg-password")
	WebElement password;
	
	public void typeFirstName() {
		firstName.sendKeys("Fil");
	}

	public void typeSurName() {
		surName.sendKeys("Fil");
	}

	public void typeEmailAddress() {
		emailAddress.sendKeys("fil11fil90");
	}
	public void typePassword() {
		password.sendKeys("fil122fil11");
	}
	
	

}
