package cvp.pts.pagetest;
import cvp.pts.pageclasses.*;
import org.testng.annotations.Test;

public class signUpTest extends BaseClass{
	SignUpPageFactory signUp;
	
	@Test
	public void test() {
		signUp.typeFirstName("Fil");
		signUp.typeSurName("Tom");
		signUp.typeEmailAddress("fil12tom911");
		signUp.typePassword("tom1209fil1");
		
	}
}
