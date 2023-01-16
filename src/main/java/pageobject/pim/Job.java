package pageobject.pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Webutill;

public class Job {
	
	
	@FindBy(xpath="//ul[@id='sidenav']//a[text()='Job']")
	private WebElement job;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement eidit;
	
	@FindBy(xpath="//select[@id='job_job_title']")
	private WebElement title;
	
	@FindBy(xpath="//select[@id='job_emp_status']") 
	private WebElement status;
	
	@FindBy(xpath="//select[@id='job_eeo_category']")
	private WebElement catjob;
	
	
	@FindBy(xpath="//input[@id='job_joined_date']")
	private WebElement calender;
	
	@FindBy(xpath="//select[@id='job_sub_unit']")
	private WebElement unit;
	
	@FindBy(xpath="//select[@id='job_location']")
	private WebElement location;
	
	@FindBy(xpath="//input[@id='job_contract_start_date']")
	private WebElement start;
	
	@FindBy(xpath="//input[@id='job_contract_end_date']")
	private WebElement end;
	
	@FindBy(xpath="//input[@id='btnTerminateEmployement']")
	private WebElement terminate;	
	
	@FindBy(xpath="//select[@id='terminate_reason']")
	private WebElement others;
	
	@FindBy(xpath="//input[@id='terminate_date']")
	private WebElement cand;
	
	@FindBy(id="terminate_note")
	private WebElement notes;
	
	@FindBy(xpath="//input[@id='dialogConfirm']")
	private WebElement config;
	
	
	Webutill jobhrm;
	public Job(Webutill utill) {
		jobhrm=utill;
		PageFactory.initElements(utill.driver, this);
	}
	
	

	public void jobs() {
		job.click();
	}
	
	public void eidit() {
		eidit.click();
		
	}
	public void jobtitle() {
		new Select(title).selectByValue("26");
	}
	
	public void employstatus() {
		new Select(status).selectByValue("4");
	}
	
	public void jobStatus() {
		new Select(catjob).selectByValue("6");
	}
	
	public void calander() {
		calender.clear();
		calender.sendKeys("1993-11-04");
	}
	
	public void subunits() {
		new Select(unit).selectByValue("5");
	}
	 public void location() {
		 new Select(location).selectByValue("5");
	}
	public void scalender() {
		 start.clear();
		 start.sendKeys("1992-11-04");
	}
	
	public void ecalender() {
		end.clear();
		end.sendKeys("1999-11-04");
	}
	public void savebutton() {
		terminate.click();
	}
	public void reason() {
		new Select(others).selectByValue("12");
	}
	public void calenders() {
		cand.clear();
		cand.sendKeys("1999-01-01");
	}
	
	public void termination() {
		notes.sendKeys("Behavior not too Good");
	}
	public void configration() {
		config.click();
	}
	
}
