package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	
	public WebDriver driver;
	
	public LogOutPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public void ClickAdmin() {
		
		admin.click();
	}
	public void Clicklogout() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
