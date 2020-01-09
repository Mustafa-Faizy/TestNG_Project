package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObjects.TestEnvironmentPageObject;
import utilities.ExcelUtility;
import utilities.Utility;

public class TestEnvironment extends Base {

	
	TestEnvironmentPageObject testEnvironmentObject;
	
	
	
	
	
	/**
	 *  before method executes before each test.
	 *  i initialize the driver in my base class and here this class extends Base. and im calling that method in beforeMethod annotaions.
	 *This method will do all the manage command and opening the browser coz we have done it in Base class.
	 * This will do the same job of BackGround key word in cucumber if i have multiple test cases the runs from Tek School page 
	 * i can put it here
	 */
	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		System.out.println("this is before method");
		testEnvironmentObject = new TestEnvironmentPageObject();
		testEnvironmentObject.clickOnLoginToClassLink();
	}
	
	
	

	
	  // This is my Test.
	
	@Test(dataProvider = "getData")
	public void testEnvironmentTest(String userName , String password) {
		
		try {
			Utility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Utility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testEnvironmentObject.canvasUserNameField(userName);
		try {
			Utility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testEnvironmentObject.canvasPasswordField(password);
		testEnvironmentObject.clickOnLoginButtonInCanvas();
		
	
		
	}
	
	
	
	
	@DataProvider
	public Object[][]getData(){
		
		Object[][]data = ExcelUtility.getData("TestEnvironmet");
		
		return data ;
	}
	
	
	
	
	
	
	
	
	
	
	   //here im closing the browser i have the method in my base class. just calling it here.
	
	@AfterMethod
	public void afterMethod() {
		Base.teardown();
		System.out.println("this is after method"); 
	}
	
	
	
	
	
	
}
