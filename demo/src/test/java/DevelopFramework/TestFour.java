package DevelopFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Demo;

public class TestFour extends Demo{
    
	public WebDriver driver;
	
	@Test
	public void testFour() throws IOException, InterruptedException {
		System.out.println("testfour");
		
		driver = automation();
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		Assert.assertTrue(false);
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
