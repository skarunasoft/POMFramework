package taskone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleScript {
	
	WebDriver driver;
	
	
	
	@Test
	public void navigateURL() {		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[@id='ext-gen248']]")).sendKeys("soon");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("soon")).click();
		
		String currentWinTitle = driver.getTitle();
		
		
		if(currentWinTitle.equals("View Lead | opentaps CRM")) {
			System.out.println("You are on correct page");			
		}
		else {
			System.out.println("Wrong page");
		}
		
		String companyName = "testleaf";
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		WebElement comName = driver.findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']"));
		boolean verifyComName= comName.getText().contains(companyName);
		if(verifyComName==true) {
			System.out.println("name verified");
		}
		else {
			System.out.println("name not updated");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
