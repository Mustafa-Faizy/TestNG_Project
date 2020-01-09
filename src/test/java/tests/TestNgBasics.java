package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	
	
// i want to run this test case second
@Test (priority = 2)
public void f() {
	System.out.println("This is number 1 and will execute second");
}

// to skip a test case in execution we use enabled = false


// i want to run this test case third 
@Test (priority = 3 , enabled = false)
public void testSecond() {
	System.out.println("Test number 2 and will execute third");
}


// i want to run this test case first
@Test (priority = 1)
public void testThree() {
	System.out.println("this is test number 3 and will execute first");
}



@BeforeMethod
public void beforeMethod() {
	System.out.println("This method prints befor each test");
	
}
	
	
@AfterMethod 
public void afterMethod() {
	System.out.println("this method prints after each test");
	
}
	
	
@BeforeClass
public void beforeClass() {
	System.out.println("This method prints before class");
}
	
	
@AfterClass
public void afterClass() {
	System.out.println("this methos prints after class");
}
	
	
	
@BeforeTest
public void beforeTest() {
	System.out.println("this method prints before test");
}
	
	
@AfterTest
public void afterTest() {
	System.out.println("this method prints after test");
	
}
	
	

@BeforeSuite
public void beforeSuite() {
	System.out.println("this method prints before suite");
	
}
	

@AfterSuite
public void afterSuite() {
	System.out.println("this method prints after test");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
