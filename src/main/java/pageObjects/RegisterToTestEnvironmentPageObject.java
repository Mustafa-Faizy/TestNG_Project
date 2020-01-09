package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import core.Base;

public class RegisterToTestEnvironmentPageObject extends Base  {

	
	public RegisterToTestEnvironmentPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how = How.XPATH, using = "//title[text()='TEK School – Knowledge is power']")
	private WebElement tekPageTitleWebElement;
	
	
	public void PageTitle() {
		
		
		tekPageTitleWebElement.isDisplayed();
	
		
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='Test Environment']")
	private WebElement testEnvironmentWebElement;
	
	
	public void clickOnTestEnvironment() {
		
		testEnvironmentWebElement.sendKeys(Keys.ENTER);
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='TEK SCHOOL']")
	private WebElement testEnvironmentTitleWebElement;
	
	
	public void testEnvironmentTitle() {
		
		testEnvironmentTitleWebElement.isDisplayed();
	}
	

	
	
	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccountWebElement;
	
	
	public void clickOnMyAccount() {
		
		myAccountWebElement.click();
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='Register']")
	private WebElement registerWebElement;
	
	
	public void clickOnRegister() {
		
		registerWebElement.click();
	}
	
	
	

	@FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
	private WebElement firstNameWebElement;
	
	
	
	public void enteringFirstName(String firstName) {
		
		firstNameWebElement.sendKeys(firstName);
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
	private WebElement lastNameWebElement;
	
	
	public void enteringLastName(String lastName) {
		
		lastNameWebElement.sendKeys(lastName);
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	private WebElement emailWebElement;
	
	
	public void enteringEmail(String email) {
		
		emailWebElement.sendKeys(email);
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
	private WebElement teleohoneWebElement;
	
	
	public void enteringPhoneNumber(String phoneNumber) {
		
		teleohoneWebElement.sendKeys(phoneNumber);
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-password']")
	private WebElement passwordWebElement;
	
	
	public void enteringPassword(String password) {
		
		passwordWebElement.sendKeys(password);
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-confirm']")
	private WebElement passwordConfirmWebElement;
	
	
	public void enteringPassConfirmation(String passwordConfirmation) {
		
		passwordConfirmWebElement.sendKeys(passwordConfirmation);
	}
	
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement continueButtonWebElement;
	
	
	
	public void clickonContinueButtton() {
		
		continueButtonWebElement.click();
	}
	
	
	
	/**
	 *    Test Case #9
	 */
	
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement dropDownWebElement;
	
	
	public void clickingOnCurrencyDropDwon() {
		
		dropDownWebElement.click();
	}
	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu']")
	private WebElement dropDownVerificationWebElement;
	
	
	public boolean currencyDropDownVerification() {
		
		boolean dropDownVerification = dropDownVerificationWebElement.isDisplayed();
		
		return dropDownVerification;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
