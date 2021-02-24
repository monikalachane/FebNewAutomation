package maven_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoOneTest 
{
	@Test
	public void testmethod() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.quit();

	}

}
