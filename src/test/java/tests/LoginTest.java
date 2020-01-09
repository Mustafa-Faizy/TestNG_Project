package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import pageObjects.LoginPageObject;
import utilities.ExcelUtility;




public class LoginTest extends Base {
	LoginPageObject loginpage;
	
	@BeforeMethod
	public void setUp() {
		Base.initializeDriver();
		System.out.println("this is before method");

	}
	
	@Test(dataProvider = "gettingDataFromExcellSheet")
	public void loginToCanvasTest(String userName , String password){
		loginpage = new LoginPageObject();
		System.out.println(loginpage.pageTitle());
		loginpage.clickOnLoginToClassLink();
		System.out.println(driver.getTitle());
		System.out.println("this is test");
		loginpage.canvasUserNameField(userName);
		loginpage.canvasPasswordField(password);
		loginpage.clickOnLoginButtonInCanvas();
		
	}
	
	
	
	

	
	
	
	/**
	 * This is data provider that reads from excel and send the value in above test.
	 * @return
	 */
	
	
	@DataProvider
	public  Object[][]gettingDataFromExcellSheet() {
		
		Object canvasLogin [][] = ExcelUtility.getData("LoginToCanvas");
		
		return canvasLogin;
	}
	
	
	
	
	
	
	
	@Test(enabled = false)
	public void loginToTestEnvironmentTest(){
		loginpage = new LoginPageObject();
		System.out.println(loginpage.pageTitle());
		loginpage.clickOnLoginToClassLink();
		System.out.println(driver.getTitle());
		System.out.println("this is test");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		Base.teardown();
		System.out.println("this is after test");
	}

}
