package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack.ActiTimeHeader;
import pomPack.Loginpage;

public class TestNG {
	
	WebDriver driver;
	ActiTimeHeader actiTimeHeader;
	Loginpage loginpage;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void loginToApplication() {
		driver.get("http://desktop-b2220qc/login.do");
	    loginpage = new Loginpage(driver);
		loginpage.sendUserName();
		loginpage.sendPasswordName();
		loginpage.selectKeepMeLogin();
		loginpage.clickOnLogin();
		
	  actiTimeHeader = new ActiTimeHeader(driver);
	}
	
	@Test
	public void verifyTaskTab() {
    actiTimeHeader.clickOnTaskTab();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		if(url.equals("desktop-b2220qc/tasks/otasklist.do") && title.equals("actiTimeHeader"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		
	@Test
	public void verifyReportTab() {
        actiTimeHeader.clickOnReportsTab();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		if(url.equals("desktop-b2220qc/tasks/otasklist.do") && title.equals("actiTimeHeader"))
		{
			System.out.println("pass");
		}
		else
		
		{
			System.out.println("fail");
		}
	
    @AfterMethod
	public void logoutFromApplication() {
    	actiTimeHeader.clickOnLogout();
	}
		
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	

	}


