package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import unitech.unitechConsulting.baseClass.BaseClass;

public class AboutUs extends BaseClass {

	public AboutUs() {
		super(driver);
		
	}
	
	
	
	@FindBy (xpath = "//a[@href='https://psptech.net']")
	public WebElement ClickHomePageAboutUs;
}
