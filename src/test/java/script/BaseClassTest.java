package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseClassTest 
{
	//public WebDriver driver;
	
	@Test
	public void Test()
	{
		// String BROWSER = System.getProperty("browser");
		// String URL = System.getProperty("url");
		
		// 		if(BROWSER.equalsIgnoreCase("Chrome"))
		// 		{
		// 			driver = new ChromeDriver();
		// 		}
		// 		else if(BROWSER.equalsIgnoreCase("firefox"))
		// 		{
		// 			driver = new FirefoxDriver();
		// 		}
		// 		else if(BROWSER.equalsIgnoreCase("edge"))
		// 		{
		// 			driver = new EdgeDriver();
		// 		}
		// 	driver.get(URL);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println("*****Firefox Launched***");		
	}		
}
