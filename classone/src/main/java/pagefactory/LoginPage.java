package pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{

	public LoginPage() {
		PageFactory.initElements(eventDriver, this);
	}

	@FindBy(how = How.ID, using = "username")
	WebElement uName;	
	public LoginPage typeUserName() {		
		type(uName, "DemoSalesManager");		
		return this;
	}

	@FindBy(how = How.ID, using = "password")
	WebElement uPass;
	public LoginPage typePassWord() {		
		type(uPass, "crmsfa");		
		return this;
	}
		
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement loginButton;
	public HomePage clickLogin() {
		click(loginButton);
		return new HomePage();
	}
	
	
	
	
	
	
	

	
	

}
