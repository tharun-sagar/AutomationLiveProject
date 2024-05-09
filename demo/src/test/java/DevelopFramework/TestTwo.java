package DevelopFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Demo;

public class TestTwo extends Demo{
    
	@Test
	public void testTwo() throws IOException, InterruptedException {
		System.out.println("Test two");
		
		WebDriver driver = automation();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		driver.close();
	}

}
