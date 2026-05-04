package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	//For DropDown
	
	public void selectbyVisibleTextMethod(WebElement elementName, String visibleText) {
		
		Select obj=new Select(elementName);
		obj.selectByVisibleText(visibleText);
		
		
	}
	public void selectbyIndex(WebElement elementName, int Index) {
		
		Select obj1=new Select(elementName);
		obj1.selectByIndex(1);
		
	}
	public void selectbyIndexValue(WebElement elementName, String Value) {
		
		Select obj2=new Select(elementName);
		obj2.selectByValue(Value);
		
	}

	
}
