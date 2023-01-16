package pageobject.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Webutill;

public class LoginPage {
	Webutill loginutil; 
	
	public LoginPage(Webutill util){      //const Para
		loginutil= util;
		PageFactory.initElements(loginutil.driver,this);  
		
	}
	
	@FindBy(id="txtUsername") WebElement user;
	@FindBy(id="txtPassword") WebElement pass;
	@FindBy(id="btnLogin") WebElement loginbutton;
	
	public void username() {
		user.sendKeys("Admin");
	}
	
	public void Password () {
		pass.sendKeys("admin123");
	}
	
	public void button() {
		loginbutton.click();
	}
	}
	



