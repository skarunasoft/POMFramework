package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeadsPage extends AbstractPage{
	
	public FindLeadsPage() {
		PageFactory.initElements(eventDriver, this);
	}
	
	
	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	WebElement firstName;
	
	public FindLeadsPage typeFirstName() {
		type(firstName, "soon");
		return this;
	}
	

}
