package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersPractice {

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start of SDET was Aug 2019");
	}
	
	@Test
	@Parameters ({"url" , "address" , "date"})
	public void firstTest(String url , String address , String date) {
		
		System.out.println("this is url " + url);
		System.out.println("this is address " + address);
		System.out.println("this is date " + date);
	}
	
	
	@Test (dependsOnMethods = {"firstTest"})
	public void secondTest() {
		System.out.println("this is test number 2");
	}
	
	
	@Test (enabled = false)
	public void thirdTest() {
		
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("End of SDET is Jan 2020");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
