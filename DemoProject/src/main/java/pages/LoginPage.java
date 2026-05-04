package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")WebElement UserName;
	@FindBy(xpath = "//input[@name='password']")WebElement Pass;
	@FindBy(xpath = "//button[text()='Sign In']")WebElement SignIn;
	@FindBy(xpath = "//p[text()='Dashboard']")WebElement Dashboard;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")WebElement Alert;

	public WebDriver driver; // global declaration

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initElement under the pageFactory class
	}

	public void enterUserName(String userNameValue) {

		UserName.sendKeys(userNameValue);

	}

	public void enterPassword(String passwordValue) {

		Pass.sendKeys(passwordValue);
	}

	public void SignIn() {
		
		/*WaitUtility wait=new WaitUtility();   //applying the wait method before the click
		wait.waitForElementToBeClickable(driver, SignIn);*/
		SignIn.click();
	}

	/*public void countryDropDown() { // creating a method for drop down for PageUtility class

		PageUtility obj2 = new PageUtility();
		obj2.selectbyIndexValue(elementName, Value);

	}*/

	public boolean IsHomePageDispalyed() {

		return Dashboard.isDisplayed();

	}

	public boolean IsAlertMsgDisplayed() {

		return Alert.isDisplayed();
	}

}
