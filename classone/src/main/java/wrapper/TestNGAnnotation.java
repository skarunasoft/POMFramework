package wrapper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testcase.RunTestCase2;

public class TestNGAnnotation extends RunTestCase2 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is @BeforeSuite method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest method");

	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This is @BeforeGroups method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is @BeforeClass method");

	}

	 @BeforeMethod
	public void beforeMethod() {
	System.out.println("This is @BeforeMethod method");
	invokeApp("chrome");		
	System.out.println("This is Browser opened");
	}

	/*@Test
	public void test() {
		leafTaps();
	}*/

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is @AfterMethod method");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is @AffterClass method");

	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("This is @AfterGroups method");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is @AfterTest method");

	}

	@BeforeSuite
	public void afterSuite() {
		System.out.println("This is @AfterSuite method");
	}

}
