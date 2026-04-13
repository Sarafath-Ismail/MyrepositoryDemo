package demoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base{
	
	@Test (priority=1)
	public void User1() {
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement UserName=driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("Customer1");
	
		WebElement Pass=driver.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("1234");
	
		WebElement SignIn=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		SignIn.click();
	}
	@Test (priority=2)
	public void User2() {
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement UserName2=driver.findElement(By.xpath("//input[@class='form-control']"));
		UserName2.sendKeys("User");
		
		WebElement Pass2=driver.findElement(By.xpath("//input[@name='password']"));
		Pass2.sendKeys("User@123");
		
		WebElement SignIn2=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		SignIn2.click();
	}
	@Test (priority=3)
	public void User3() {
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement UserName3=driver.findElement(By.xpath("//input[@class='form-control']"));
		UserName3.sendKeys("Mathew");
		
		WebElement Pass3=driver.findElement(By.xpath("//input[@name='password']"));
		Pass3.sendKeys("1234");
		
		WebElement SignIn3=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		SignIn3.click();
	}
	@Test (priority=4)
	public void User4() {
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement UserName4=driver.findElement(By.xpath("//input[@class='form-control']"));
		UserName4.sendKeys("admin");
		
		WebElement Pass4=driver.findElement(By.xpath("//input[@name='password']"));
		Pass4.sendKeys("admin");
		
		WebElement SignIn4=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		SignIn4.click(); 
	}
}
