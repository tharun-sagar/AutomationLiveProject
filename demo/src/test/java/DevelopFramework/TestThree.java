package DevelopFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Demo;

public class TestThree extends Demo{
    
	
	@Test
	public void testThree() throws IOException, InterruptedException {
		System.out.println("TestThree");
		
		WebDriver driver = automation();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		
		driver.close();

	}

}
