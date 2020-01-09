package tests;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertionsTopic {

	
	
	
	@Test
	public void hardAssertions() {
		
	Assert.assertEquals("Software Test", "Software Test Automtion");
	
	System.out.println("after hard assertion");
	
	
	
	}
	
	
	
	@Test
	public void softAssertions() {
		
		SoftAssert  softAssert = new SoftAssert();
		
		softAssert.assertEquals("Hello", "Hi"); 
		softAssert.assertTrue("Tek School".equals("TEK SCHOOL"));
		softAssert.assertTrue("Today".equals("today"));
		
		System.out.println("After Soft Assertion");
		softAssert.assertAll();
		
		
	}
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
