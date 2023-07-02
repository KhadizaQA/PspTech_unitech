package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import unitech.unitechConsulting.baseClass.BaseClass;

public class Career extends BaseClass {

	public Career( ) {
		super(driver);
		
	}
	
	@FindBy (xpath = "//a[@href='https://psptech.net/career/']")
	public WebElement ClickCareer;

	
	@FindBy (xpath = "//a[@href='https://psptech.net']")
	public WebElement ClickHomePageCareer;
	//a[@href='https://psptech.net/about-us/'][1]
	@FindBy (xpath = "//a[@href='https://psptech.net/about-us/'][1]")
	public WebElement ClickAboutUsCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/'][1]")
	public WebElement MouseOverSoftwareDevelopmentCareer;
	
	//a[@href='https://psptech.net/software-development/app-development/'][1]
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/app-development/'][1]")
	public WebElement AppDevPageSelectionFromCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/web-development/'][1]")
	public WebElement WebDevPageSelectionFromCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/contact-us/'][1]")
	public WebElement ClickContactUsCareer;
	
//	@FindBy (xpath = "//nav[@role='navigation']")
//	public WebElement ClickHome1Career;
	
	@FindBy (xpath = "//nav[@class='breadcrumb-trail breadcrumbs']")
	public WebElement ClickHome1Career;
	
	@FindBy (xpath = "//div[@class='mainmenu-seven__right__toggler mobile-nav-toggler']")
	public WebElement ClickBurgerMenuCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/']")
	public WebElement ClickSoftwareDevelopmentBurgerMenuCareer;


	@FindBy (xpath = "//img[@decoding='async']")
	public WebElement ClickLogoPspTechCareer;
	
	@FindBy (xpath = "//span[@class='fa fa-angle-right']")
	public WebElement DubleClickFullStackDeveloperCareer;
	
	@FindBy (xpath = "//span[@class='elementor-button-text']")
	public WebElement ClickContactUsCareerMeddlebutton;
	
	
	
	
	
	
}
