package unitech.unitechConsulting.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import unitech.unitechConsulting.baseClass.BaseClass;
import unitech.unitechConsulting.browserFactory.BrowserFactory;
import unitech.unitechConsulting.pages.Career;

import unitech.unitechConsulting.utilities.CommonMethods;

public class Career_page_TC_001 extends BaseClass {
	private static final String pageFactory =null;

	public Career_page_TC_001() {
		super(driver);
		
	}
	Career career;
	@BeforeTest
	public void setUp( ) {
		driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		career = PageFactory.initElements(driver, Career.class);
		CommonMethods.maximizeBrowser();
	
	}
	
	@Test
	public void TC_001_click_header_career_button() {
		logger.info(" clicking Career button has started");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
		//CommonMethods.click(career.ClickHomePageCareer, driver);
		
		
	}
	
	@Test
	public void TC_002_click_header_Home_button() {
		logger.info("clicking CareerHome button has started");
		CommonMethods.click(career.ClickHomePageCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
	@Test
	public void TC_003_click_header_AboutUs_button() {
		logger.info(" clicking CareerAboutUs button has started");
		CommonMethods.click(career.ClickAboutUsCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/about-us/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
	
	@Test
	public void TC_004_software_development_dropdown_click() {
		logger.info("  Career Software Development Dropdown App Development clicked");
		Actions act = new Actions(driver);
		act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
		CommonMethods.click(career.AppDevPageSelectionFromCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/software-development/app-development/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
	@Test
	public void TC_005_software_development_dropdown_click() {
		logger.info("  Career Software Development Dropdown Web Development clicked");
		Actions act = new Actions(driver);
		act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
		CommonMethods.click(career.WebDevPageSelectionFromCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/software-development/web-development/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
		}

	@Test
	public void TC_006_click_header_ContactUs_button() {
		logger.info(" clicking CareerContactUs button has started");
		CommonMethods.click(career.ClickContactUsCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/contact-us/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
//	@Test
//	public void TC_007_click_meddle_Home_button() {
//		logger.info(" clicking CareerHome1 button has started");
//		CommonMethods.click(career.ClickHome1Career, driver);
//		CommonMethods.getUrl(driver, "https://psptech.net/");

@Test
public void TC_009_click_BurgerMenu_AboutUs_button() {
	logger.info(" clicking CareerBurgerMenu AboutUs button has started");
	CommonMethods.click(career.ClickAboutUsCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/about-us/");
	CommonMethods.click(career.ClickBurgerMenuCareer, driver);
	
}
@Test
public void TC_010_click_BurgerMenu_ContactUs_button() {
	logger.info(" clicking CareerBurgerMenu ContactUs button has started");
	CommonMethods.click(career.ClickContactUsCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/contact-us/");
	CommonMethods.click(career.ClickBurgerMenuCareer, driver);
	
}

@Test
public void TC_011_click_BurgerMenu_Career_button() {
	logger.info(" clicking CareerBurgerMenu Career button has started");
	CommonMethods.click(career.ClickCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/career/");
	CommonMethods.click(career.ClickBurgerMenuCareer, driver);
	
}

@Test
public void TC_012_software_development_BargerMenu_Career_click() {
	logger.info("  Career Software Development BargerMenu Cicked");
	
	CommonMethods.click(career.ClickSoftwareDevelopmentBurgerMenuCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/");
	
//	CommonMethods.click(career.ClickCareer, driver);
//	CommonMethods.getUrl(driver, "https://psptech.net/career/");
//	
}
	
	@Test
	public void TC_013_software_development_dropdown_click() {
	logger.info("  Career Software Development Dropdown App Development clicked");
	Actions act = new Actions(driver);
	act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
	CommonMethods.click(career.AppDevPageSelectionFromCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/app-development/");
	CommonMethods.click(career.ClickSoftwareDevelopmentBurgerMenuCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/");
}
	@Test
	public void TC_014_software_development_dropdown_click() {
	logger.info("  Career Software Development Dropdown Web Development clicked");
	Actions act = new Actions(driver);
	act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
	CommonMethods.click(career.WebDevPageSelectionFromCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/web-development/");
	CommonMethods.click(career.ClickCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/career/");
}
	
	
	
	@Test
	public void TC_015_Logo_Psp_Tech_Career_click() {
		logger.info("  Career Software Development BargerMenu Cicked");
		
		CommonMethods.click(career.ClickLogoPspTechCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/");
		
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void tearDown() {
		logger.info("Testing for Career_Page_TC_001 completed");
	}

}
