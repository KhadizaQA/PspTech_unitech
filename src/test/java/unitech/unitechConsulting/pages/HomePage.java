package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import unitech.unitechConsulting.baseClass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		super(driver);	
	}
	//a[@href='https://psptech.net']
	@FindBy (xpath = "//a[@href='https://psptech.net'][1]")
	public WebElement ClickHomeAboutUs;
	
	@FindBy (xpath = "(//a[@href='https://psptech.net'])[1]")
	public WebElement ClickHome;

	@FindBy (xpath = "(//a[@href='https://psptech.net/software-development/'])[1]")
	public WebElement MouseOverSoftwareDevelopment;

	@FindBy (xpath = "(//a[@href='https://psptech.net/software-development/web-development/'])[1]")
	public WebElement WebDevPageSelectionFromHomePage;
	
	@FindBy (xpath = "(//a[@href='https://psptech.net/software-development/app-development/'])[1]")
	public WebElement AppDevPageSelectionFromHomePage;
	
	//a[@href='https://psptech.net/software-development/app-development/']
		
	@FindBy (xpath= "(//a[@href='https://psptech.net/software-development/'])[6]")
	public WebElement ClickDiscoverMore1;

	@FindBy (how = How.XPATH, using = "(//a[@href='https://psptech.net/software-development/'])[8]")
	public WebElement DiscoverMore2Click;
	
	@FindBy (xpath= "(//a[@href='https://psptech.net/about-us/'])[3]")
	public WebElement HomepageAboutusClick;
	
	@FindBy (xpath= "//body[@class='home page-template-default page page-id-7 wp-custom-logo antaris-home antaris-addons no-sidebar elementor-default elementor-kit-5 elementor-page elementor-page-7 e--ua-blink e--ua-chrome e--ua-webkit']")
	public WebElement MouseOverCareer;
	
	
	@FindBy (xpath = "//link[@rel='profile']")	
	public WebElement ClickHome1;
	
	@FindBy (xpath= "//body[@class='home page-template-default page page-id-7 wp-custom-logo antaris-home antaris-addons no-sidebar elementor-default elementor-kit-5 elementor-page elementor-page-7 e--ua-blink e--ua-chrome e--ua-webkit']")
	public WebElement MouseOverContactUS;
	
	//@FindBy (xpath = "(@FindBy (xpath = "//a[@href='https://psptech.net']"
		//	+ "	public WebElement ClickHome;")
	//public WebElement ClickHome2;

}
//body[@class='home page-template-default page page-id-7 wp-custom-logo antaris-home antaris-addons no-sidebar elementor-default elementor-kit-5 elementor-page elementor-page-7 e--ua-blink e--ua-chrome e--ua-webkit']