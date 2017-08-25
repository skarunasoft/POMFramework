package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage extends AbstractPage{
	
	
	public MyHomePage() {
		PageFactory.initElements(eventDriver, this);
		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Leads")
	WebElement linkLeads;
	
	
	public MyLeadsPage clickLeadsLink() {		
		click(linkLeads);
		return new MyLeadsPage();
		
	}

	
	
	
	
	
	
	

}
