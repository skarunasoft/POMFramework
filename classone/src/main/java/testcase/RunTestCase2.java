package testcase;

import org.testng.annotations.Test;


import wrapper.WdWrapper;


public class RunTestCase2 extends WdWrapper{

	
		
	
	//@Test
	public void leafTaps() {		
	//	invokeApp("chrome");		
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));		
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
