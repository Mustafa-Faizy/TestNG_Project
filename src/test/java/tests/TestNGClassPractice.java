package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNGClassPractice {

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this method will executed before each tests");
	}
	
	
	
	
	@Test (priority = 5)
	public void testOne() {
		System.out.println("this is test 1");
	}
	
	
	@Test (priority = 4 , enabled = false)
	public void testTwo() {
		System.out.println("this is test 2");
	}
	
	
	@Test (priority = 3 , enabled = false )
	public void testThree() {
		System.out.println("this is test 3");
	}
	
	
	
	@Test (priority = 1 )
	public void testFour() {
		System.out.println("this is test 4");
		String actual = "Tek School of America";
		String expected = "Tek School of America";
		
		Assert.assertEquals(expected, actual);
		
		
	}
	
	
	@Test (priority = 2 , dependsOnMethods = {"testFour"} ) 
	public void testFive() {
		System.out.println("this is test 5");
		System.out.println("this method is depended on successsful execution of test four");
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this  method will executed after each tests");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
