package pageobject.pim;import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Webutill;

public class AddEmployepage {
	
	@FindBy(name="btnAdd")
	private WebElement addbutton;
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement fristname;
	
	@FindBy(id="middleName")
	private WebElement middlename;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='chkLogin']")
	private WebElement box;
	
	@FindBy(xpath="//input[@id='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='user_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='re_password']")
	private WebElement confirmpass;
	
	@FindBy(xpath="//select[@id='status']")
	private WebElement status;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement submitbutton;
	
	
	Webutill addemploy;
	public AddEmployepage(Webutill utill) {
		addemploy=utill;
		PageFactory.initElements(utill.driver,this);
	}
	
	
	
	
	public void Clickaddbutton()  {
		addbutton.click();	
	}
	
	public void fname() {
		fristname.sendKeys("ASIF");	
	}
	
	public void midname(){
		middlename.sendKeys("Abdul");	
	}
	
	public void lname() {
		lastname.sendKeys("SAYYAD");
	}
	
//	public void checkbox()  {
//		box.click();
//	}
//	
//	public void Uname() {
//		username.sendKeys("ASIFABDULSAYYAD");
//	}
//	
//	public void passw() {
//		password.sendKeys("ASIFDON");
//	}
//	
//	public void cpass() {
//		confirmpass.sendKeys("ASIFDON");
//	}
//	
//	public void Stauts() {
//		new Select(status).selectByVisibleText("Enabled");
//	}
	public void submit() {
		submitbutton.click();
	}
	
}
