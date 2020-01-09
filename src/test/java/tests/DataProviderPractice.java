package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class DataProviderPractice {

	@BeforeMethod
	public void beforMethod() {
		System.out.println("before method");
	}
	
	
	// dataProvider = "dataProvider method name"
	@Test(dataProvider = "getData")
	public void dataProviderTest(String userName , String password) {
		
		System.out.println("User name is ----" + userName);
		System.out.println("password  is ----" + password);
		
	}
	
	
	
	
	@DataProvider()
	public Object [][]getData(){
		Object data [][] = ExcelUtility.getData("Sheet1");
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
