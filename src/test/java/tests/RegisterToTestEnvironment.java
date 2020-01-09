package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;
import pageObjects.RegisterToTestEnvironmentPageObject;
import utilities.ExcelUtility;

public class RegisterToTestEnvironment extends Base {

	
	
	RegisterToTestEnvironmentPageObject object;
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		Base.initializeDriver();
		System.out.println("this is before method");
	
	}
	
	
	
	@Test(dataProvider = "getingData")
	public void registringInTestEnvironment(String firstName, String lastName, String email, String phoneNumber, 
											String password, String passwordConfirmation) {
		
		object = new RegisterToTestEnvironmentPageObject();
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(driver.getTitle(),"TEK School – Knowledge IS power" );
		object.clickOnTestEnvironment();
		//object.testEnvironmentTitle();
		softAssert.assertEquals(driver.getTitle(),"TEK SCHOOL" );
		object.clickOnMyAccount();
		object.clickOnRegister();
		object.enteringFirstName(firstName);
		object.enteringLastName(lastName);
		object.enteringEmail(email);
		object.enteringPhoneNumber(phoneNumber);
		object.enteringPassword(password);
		object.enteringPassConfirmation(passwordConfirmation);
		object.clickonContinueButtton();
		softAssert.assertAll();
	
		
	}
	
	
	
	
	
	
	@DataProvider
	public Object[][]getingData() {
		
		Object [][] data = ExcelUtility.getData("RegisterToTestEnvironment");
		
		return data;
		
	}
	
	
	
	
	
	/**
	 *   From here on i am going to automate Test Case #9
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void afterMethod() {
		
		Base.teardown();
		System.out.println("this after method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
