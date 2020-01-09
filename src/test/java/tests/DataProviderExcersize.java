package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class DataProviderExcersize {

	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
		
	}
	
	
	
	
	@Test(dataProvider = "getingData")
	public void dataProviderExcersize(String city, String state, String zipcode ) {
		
		System.out.println("this is city ---> " +city);
		System.out.println("this is state ---> " + state);
		System.out.println("this is zipcode ---> " + zipcode);
		
	}
	
	
	
	
	
	@DataProvider 
	public Object[][]getingData(){
		Object [][] data = ExcelUtility.getData("TestDataSheet");
				return data;
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void afterMEthod() {
		System.out.println("after method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
