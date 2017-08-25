package wrapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class WdWrapper extends WdEvent{

	/*
	 * LocateElement, Type, Click, SelectByIndex, SelectByValue, SelectByString
	 * SwitchToWindow AlertAccept AlertDismiss AlertText SwitchToFrame VerifyTitle
	 * GetAttribute GetText VerifyText TakeSnapshot InvokeApp QuitApp
	 * 
	 */
	
	/*
	 * HashSet-->random order
	 * TreeSet-->ASCII order(alphabet or numeric)
	 * LinkedHashSet-->Order of Insert	  
	 * 
	 */

	public WebDriver driver;
	public  static EventFiringWebDriver eventDriver;

	public void invokeApp(String browser) {		
		
		switch(browser) {		
		case "ie":
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
			default:
				System.out.println("Browser "+browser+" not invoked");
				break;
		}
		
		eventDriver = new EventFiringWebDriver(driver);
		WdEvent handler  = new WdEvent();
		eventDriver.register(handler);
		eventDriver.get("http://leaftaps.com/opentaps");
		eventDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		

	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
	}

	public void click(WebElement ele) {
		ele.click();
	}

	public void selectByIndex(WebElement ele, int value) {
	}

	public void selectByValue(WebElement ele, String value) {
	}

	public void selectByString(WebElement ele, String value) {
	}

	public String switchToWindows(String windowHandle) {
		return windowHandle;
	}

	public void alertAccept() {
	}

	public void alertDismiss() {
	}

	public void alertText() {
	}

	public void switchToFrame(WebElement ele) {
	}

	public String VerifyTitle(String title) {
		return title;
	}

	public String getAttribute(String getAttribute) {
		return getAttribute;
	}

	public String getText(String getText) {
		return getText;
	}

	public String verifyText(String verifyText) {
		return verifyText;
	}

	public File takeSnapshot(WebDriver driver, File file) {
		return file;
	}

	public void quitApp() {
	}

	public WebElement locateElement(String how, String using) {

		WebElement ele = null;

		switch (how) {

		case ("id"):
			ele = eventDriver.findElement(By.id(using));
			break;

		case ("name"):
			ele = eventDriver.findElement(By.name(using));
			break;

		case ("xpath"):
			ele = eventDriver.findElement(By.xpath(using));
			break;

		case ("className"):
			ele = eventDriver.findElement(By.className(using));
			break;

		case ("linkText"):
			ele = eventDriver.findElement(By.linkText(using));
			break;

		case ("tagName"):
			ele = eventDriver.findElement(By.tagName(using));
			break;

		case ("cssSelector"):
			ele = eventDriver.findElement(By.cssSelector(using));
			break;

		case ("partialLinkText"):
			ele = eventDriver.findElement(By.partialLinkText(using));
			break;
			
			
		//customizable element locator
		case ("value"):
			ele = eventDriver.findElement(By.xpath("//*[@value='"+using+"']"));
			break;
			

		default:
			System.out.println("The given locator " + how + " is not correct");
			break;

		}
		return ele;

	}
	
	
			public void switchToWindow(int index) {
				
				Set<String> allWindowHandles = eventDriver.getWindowHandles();
				List<String> allWindows = new ArrayList<>();
				allWindows.addAll(allWindowHandles);
				eventDriver.switchTo().window(allWindows.get(index));
				
				}
	
			
			
	
	
	

}
