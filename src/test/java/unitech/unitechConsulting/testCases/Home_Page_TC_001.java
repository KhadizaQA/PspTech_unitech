package unitech.unitechConsulting.testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import unitech.unitechConsulting.baseClass.BaseClass;
import unitech.unitechConsulting.browserFactory.BrowserFactory;
import unitech.unitechConsulting.pages.HomePage;
import unitech.unitechConsulting.utilities.CommonMethods;

public class Home_Page_TC_001 extends BaseClass {
	private static final String pageFactory =null;
	public Home_Page_TC_001() {
		super(driver);
		
	}
	HomePage homepage;
	
	@BeforeTest
	public void setUp( ) {
	driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		homepage = PageFactory.initElements(driver, HomePage.class);
		CommonMethods.maximizeBrowser();
	}
				
	@Test
	public void TC_001_click_header_home_button() {
		logger.info("TC_001 clicking Home button has started");
		CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
		CommonMethods.click(homepage.ClickHome, driver);
	}

	@Test
	public void TC_002_software_development_dropdown_click() {
		logger.info("Software Development dropdown clicked");
		Actions act = new Actions(driver);
		act.moveToElement(homepage.MouseOverSoftwareDevelopment).build().perform();
		CommonMethods.click(homepage.WebDevPageSelectionFromHomePage, driver);
		CommonMethods.getTitle(driver, "Web Development - PSPTech");
		CommonMethods.click(homepage.ClickHome, driver);
}
	@Test
	public void TC_003_software_development_dropdown_click() {
		logger.info("Software Development dropdown clicked");
		Actions act = new Actions(driver);
		act.moveToElement(homepage.MouseOverSoftwareDevelopment).build().perform();
		CommonMethods.click(homepage.AppDevPageSelectionFromHomePage, driver);
		CommonMethods.getTitle(driver, "App Development - PSPTech");
		CommonMethods.click(homepage.ClickHome, driver);
}
	
	@Test
	public void TC_004_header_AboutUS_button_click() {
		logger.info("AboutUs header button clicked");
		CommonMethods.click(homepage.ClickHomeHedderAboutUs, driver);
	//CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
		CommonMethods.getUrl(driver, "https://psptech.net/about-us/");
		CommonMethods.click(homepage.ClickHomeHedderAboutUs, driver);
	}


	@Test
	public void TC_005_header_Career_button_click() {
	logger.info("Career header button clicked");
	
	
	CommonMethods.click(homepage.ClickHomePageHedderCareer, driver);
CommonMethods.getUrl(driver, "https://psptech.net/career/");
	CommonMethods.click(homepage.ClickHome, driver);
	}	

	@Test
	public void TC_006_header_ContactUS_button_click() {
	logger.info("ContactUS header button clicked");
	
	CommonMethods.click(homepage.ClickHomePageHedderContactUS, driver);
CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	CommonMethods.click(homepage.ClickHome, driver);
}
	
	@Test
	public void TC_007_ClickDiscoverMore1_button() {
	logger.info("ClickDiscoverMore1 button ");
	Actions act = new Actions(driver);
	act.moveToElement(homepage.ClickDiscoverMore1).build().perform();
	CommonMethods.click(homepage.ClickDiscoverMore1, driver);
CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	CommonMethods.click(homepage.ClickHome, driver);
	}
	
			
	@AfterTest
	public void tearDown() {
		logger.info("Testing for Home_Page_TC_001 completed");
	}
			
		

}

	

