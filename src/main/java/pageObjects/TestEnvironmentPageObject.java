package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TestEnvironmentPageObject extends Base {

	
	
	/**
	 *   This is the practice in class that Shaiq Assigne to us.
	 */
	
	
	
	/**
	 *  This constructor method that i created it helps me to create the object of this class in my test class
	 *  and use the methods that i have here and in body of my method i called the pageFactory object from base class
	 *  its letting me to store webElements in FindByAnnotaions.
	 */
	public TestEnvironmentPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='Login to Class']")
	private WebElement loginToClassLink;

	
	/**
	 * This method will Click on Login to Class Link on Tek School page
	 */
	public void clickOnLoginToClassLink() {
		loginToClassLink.sendKeys(Keys.ENTER);
	}

	
	

	
	@FindBy(how = How.XPATH, using = "//input[@id='pseudonym_session_unique_id']")
	private WebElement userNameWebElement;
	
	
	public void canvasUserNameField( String userName) {
		
		userNameWebElement.sendKeys(userName);
	}
	
	
	
	
	
	@FindBy(how = How.XPATH,using = "//input[@id='pseudonym_session_password']")
	private WebElement passwordWebElement;
	
	
	public void canvasPasswordField(String password) {
		
		passwordWebElement.sendKeys(password);
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_form\"]/div[3]/div[2]/button")
	private WebElement loginButtonWebElement;
	
	
	public void clickOnLoginButtonInCanvas() {
		loginButtonWebElement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
