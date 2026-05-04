package demoProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest  extends Base{
	
	@Test (priority=1, groups= {"regression"},retryAnalyzer=reTry.Retry.class)
	
	public void VerifytheUserValidCredentials() throws IOException {
		
		//String UserNameValue="admin";
		//String PasswordValue="admin";
		
		String UserNameValue=ExcelUtilities.getIntegerData(1, 0, "loginpage");
		String PasswordValue=ExcelUtilities.getIntegerData(1, 1, "loginpage");
		
		LoginPage login=new LoginPage(driver);
		login.enterUserName(UserNameValue);  //passing the value
		login.enterPassword(PasswordValue);  //passing the value
		login.SignIn();
		
		boolean homepage=login.IsHomePageDispalyed();
		Assert.assertTrue(homepage);
		
		
		
		LogOutPage logout= new LogOutPage(driver);
		logout.ClickAdmin();
		logout.Clicklogout();
		
	}
	@Test
	
	public void Verifytheuser1() throws IOException {
		
		//String UserNameValue="Mathew";
		//String PasswordValue="1234";
		
		String UserNameValue=ExcelUtilities.getIntegerData(2, 0, "loginpage");
		String PasswordValue=ExcelUtilities.getIntegerData(2, 1, "loginpage");
		
		LoginPage login1=new LoginPage(driver);
		login1.enterUserName(UserNameValue);
		login1.enterPassword(PasswordValue);
		login1.SignIn();
		
		boolean alert1=login1.IsAlertMsgDisplayed();
		Assert.assertTrue(alert1);
	
	}
	
	
	@Test
	
	public void VerifytheUser2() throws IOException {
		
		//String UserNameValue="Joy";
		//String PasswordValue="0011";
		
		String UserNameValue=ExcelUtilities.getIntegerData(3, 0, "loginpage");
		String PasswordValue=ExcelUtilities.getIntegerData(3, 1, "loginpage");
		
		LoginPage login2=new LoginPage(driver);
		login2.enterUserName(UserNameValue);
		login2.enterPassword(PasswordValue);
		login2.SignIn();
		
		boolean alert1=login2.IsAlertMsgDisplayed();
		Assert.assertTrue(alert1);
	}
	
	

}
