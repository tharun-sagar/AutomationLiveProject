package DevelopFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import POMF.LandingPage;
import POMF.LoginPage;
import resources.Demo;

public class LoginTest extends Demo{
	
	WebDriver driver;
	@Test
	public void Login() throws IOException, InterruptedException {
		driver = automation();
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		
		LandingPage landing = new LandingPage(driver);
		Thread.sleep(2000);
		landing.myaccount().click();
		Thread.sleep(2000);
		landing.Login().click();
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		Thread.sleep(2000);
		login.email().sendKeys("tharunsagar9999@gmail.com");
		Thread.sleep(2000);
		login.password().sendKeys("Ct@09062001");
		Thread.sleep(2000);
		login.button().click();
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	
	
}