package demoProject;

	import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.WaitUtility;


	public class Base {
		
		
		public WebDriver driver;
		@Parameters ("browser")
		@BeforeMethod (alwaysRun=true)
		public void browserInitialization(String browser) throws Exception {
			
			if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();	
			}
			else if (browser.equalsIgnoreCase("edge")){
				driver=new EdgeDriver();
			}
			else {
				
				throw new Exception ("Invalid Browser");
			}
			driver=new ChromeDriver();
			driver.get("https://groceryapp.uniqassosiates.com/admin/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));  //only once we should declare in BaseClass
			driver.manage().window().maximize();
		}

		@AfterMethod (alwaysRun=true)
		public void browserQuitAndClose() 
		{
			driver.quit();
		}

	}


