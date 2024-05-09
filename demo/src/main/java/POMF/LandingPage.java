package POMF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	private WebElement myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	private WebElement Login;
	
	public WebElement myaccount() {
		return myaccount;
	}
	
	public WebElement Login() {
		return Login;
	}

}
