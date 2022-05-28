package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPack.ActiTimeHeader;
import pomPack.Loginpage;

public class VerifytheApplicationHeader {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		driver.get("http://desktop-b2220qc/login.do");
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.sendUserName();
		loginpage.sendPasswordName();
		loginpage.selectKeepMeLogin();
		loginpage.clickOnLogin();
		
		ActiTimeHeader actiTimeHeader = new ActiTimeHeader(driver);
		Thread.sleep(2000);
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
		actiTimeHeader.clickOnLogout();
		}
		

	}


