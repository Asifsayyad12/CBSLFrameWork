package pageobject.pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Webutill;

public class PersonalDetails {
	Webutill details;
	public PersonalDetails(Webutill utill) {
		details=utill;
		PageFactory.initElements(utill.driver,this);
	}
    
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement eiditbutton;
	
	@FindBy(xpath="//input[@id='personal_txtLicenNo']")
	private WebElement  DLicenseNumbe;
	
	@FindBy(xpath="//input[@id='personal_txtNICNo']")
	private WebElement ssn;
	
	@FindBy(xpath="//input[@id='personal_txtOtherID']")
	private WebElement otherid;
	
	@FindBy(xpath="//input[@id='personal_txtSINNo']")
	private WebElement sinno;
	
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']")
	private WebElement ExpiryDate;
	
	
	@FindBy(xpath="//input[@id='personal_optGender_1']")
	private WebElement MGender;
	
	@FindBy(xpath="//input[@id='personal_optGender_2']")
	private WebElement FGender;
	
	@FindBy(xpath="//select[@id='personal_cmbMarital']")
	private WebElement Marital;
	
	@FindBy(xpath="//select[@id='personal_cmbNation']")
	private WebElement Nationality;
	
	@FindBy(xpath="//input[@id='personal_DOB']")
	private WebElement DOB;
	
	@FindBy(xpath="//input[@id='personal_txtEmpNickName']")
	private WebElement Nickname;
	
	@FindBy(xpath="//input[@id='personal_txtMilitarySer']")
	private WebElement Military ;
	
	@FindBy(xpath="//input[@id='personal_chkSmokeFlag']")
	private WebElement somker;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement save;
	
	
	public void EiditButton() {
		eiditbutton.click();
	}
	public void DrivingLN() {
		DLicenseNumbe.sendKeys("1234567890");
	}
	
	public void SSNNumber() {
		ssn.sendKeys(")(0987654321");
	}
	public void OtherID() {
		otherid.sendKeys("786786786");
	}
	public void SINNo() {
		sinno.sendKeys("3133133413");
	}
	public void Expiredate() {
		ExpiryDate.clear();
		ExpiryDate.sendKeys("2021-01-01");
		
	}
	public void Maternalstatus() {
		new Select(Marital).selectByIndex(1);
	}
	public void Natinality() {
		new Select(Nationality).selectByIndex(82);
	}
	public void Birthday() {
		DOB.clear();
		DOB.sendKeys("1993-11-04");
	}
	public void Nname() {
		 Nickname.sendKeys("Guddu");
	}
	public void MilitaryArea() {
		Military.sendKeys("AURANGABAD");
	
	}
	public void Smoker() {
		somker.click();
	}
	
	public void Geander(char gender) {
		switch(gender) {
		case 'M':
		MGender.click();
		break;
		
		case 'F':
		FGender.click();
		
		default :
		System.out.println("Pls Valid data");
		}
		
		
		
		
	}
	
	public void savebutton() {
		save.click();
	}
}


	


