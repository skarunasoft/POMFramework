package homework;

import org.openqa.selenium.WebElement;

public interface Wrapper {
	
	
	/**
	 * This  method will launch the browser, i.e., chrome, firefox or ie
	 * wait for 30 seconds to load the URL	 * 
	 * @param browser
	 * @param URL
	 * @author: S. Karunamoorthy
	 */
	public void invokeApp(String browser, String URL);
	
	
	/**
	 * This method will enter the value to the text field using WebElement
	 * @param element
	 * @param data
	 * @author: S. Karunamoorthy
	 */
	public void type(WebElement element, String data);
	
	
	/**
	 * This method will click the object using WebElement
	 * @param element	 
	 * @author: S. Karunamoorthy
	 */
	public void click(WebElement element);
	
	
	/**
	 * This method will store the locator and locator value to the WebElement
	 * @param locator
	 * @param locatorValue	 
	 * @author: S. Karunamoorthy
	 */	
	public WebElement locateElement(String locator, String locatorValue);

}
