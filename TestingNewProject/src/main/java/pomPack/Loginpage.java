package pomPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
		@FindBy (xpath = "//input[@name='username']")
		private WebElement userName;
		
		@FindBy (xpath = "//input[@name='pwd']")
		private WebElement password;
		
		@FindBy (xpath = "//a[text()='Login']")
		private WebElement loginButton;
		
		@FindBy (xpath = "//input[@name='keepLoggedInCheckBox']")
		private WebElement keepMeLoginCheckbox;
	    
		public Loginpage(WebDriver driver1) //driver1 = driver = new ChromeDriver
		{
			PageFactory.initElements(driver1,this);
		}
		
		public void sendUserName() {
			userName.sendKeys("Admin");
		}
		public void sendPasswordName() {
			userName.sendKeys("manager");
		}
		public void selectKeepMeLogin() {
			keepMeLoginCheckbox.click();
		}
		public void clickOnLogin() {
			loginButton.click();
		}
			
			//or
			
		public void loginToActitime() {
			userName.sendKeys("Admin");
			userName.sendKeys("manager");
			loginButton.click();
		   keepMeLoginCheckbox.click();
		}
		

	}


	
	}


