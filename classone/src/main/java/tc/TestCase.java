package tc;


import org.testng.annotations.Test;

import pagefactory.LoginPage;
import wrapper.TestNGAnnotation;

public class TestCase extends TestNGAnnotation{
	
		
	@Test
	public void loginToLeaftaps() {
		
		new LoginPage()
		.typeUserName()
		.typePassWord()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeads()
		.typeFirstName();
		
		
	}
	
	
	
	
	

}
