package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	
	public void fileUploadUsingSendKeys(WebElement element, String filePath) {
		
		element.sendKeys(filePath);
		
	}
	public void fileUploadUsingRobotClass(WebElement element, String filePath) throws AWTException {
		
		StringSelection stringselection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null); //ToolKit Class
		Robot obj=new Robot();
		obj.delay(2000);
		obj.keyPress(KeyEvent.VK_CONTROL); // VK-Virtual Key
		obj.keyPress(KeyEvent.VK_V);		//Pressing the V Key
		obj.keyRelease(KeyEvent.VK_CONTROL); //releasing the CONTROL key
		obj.keyRelease(KeyEvent.VK_V);		
		obj.keyPress(KeyEvent.VK_ENTER);    //pressing the ENTER Key
		obj.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
