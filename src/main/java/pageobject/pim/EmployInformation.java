package pageobject.pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Webutill;

public class EmployInformation {

	@FindBy(id="menu_pim_viewPimModule") WebElement Pim;
	@FindBy(id="empsearch_employee_name_empName")WebElement empName;
	@FindBy(id="empsearch_supervisor_name") WebElement Super;
	@FindBy(id="empsearch_employee_status") WebElement EmploymentStatus;
	@FindBy(id="empsearch_job_title")WebElement jobtitle;
	@FindBy(xpath="//select[@id='empsearch_sub_unit']") WebElement Subunit;
	@FindBy(id="empsearch_termination") WebElement include;
	@FindBy(id="searchBtn") WebElement search;
	
	
	Webutill employinformation;
	
	public EmployInformation (Webutill utill){
		employinformation=utill;
		PageFactory.initElements(utill.driver, this);    //PageFactory.initElements(utill.driver, EmployInformation.class);
		
	}
	
	
	
	public void Pimclick() {
		Pim.click();
	}
	public void Employee() {
		empName.sendKeys("Lisa");
	}
	public void SupervisorName() {
		Super.sendKeys(" Fiona Grace");
	}
	public void EmplStatus() {
		new Select(EmploymentStatus).selectByIndex(4);
		
	}
	public void JobT() {
		new Select(jobtitle).selectByVisibleText("Software Engineer");
	
}
	public void subtitle(){
		new Select(Subunit).selectByVisibleText("  Development");
	}
	
	public void Incl() {
		new Select(include).selectByValue("1");
	}
	public void Search() {
		search.click();
	
	}
}