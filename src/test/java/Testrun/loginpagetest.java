package Testrun;




import org.testng.annotations.Test;

import pageobject.login.LoginPage;
import pageobject.pim.AddEmployepage;
import pageobject.pim.EmployInformation;
import pageobject.pim.Job;
import pageobject.pim.PersonalDetails;

import utility.BaseClass;


public class loginpagetest extends BaseClass {
	
	@Test(priority=1)
	public  void username() {
		LoginPage lp=new LoginPage(ut);
		lp.username();
		lp.Password();
		lp.button();
	}
	
	@Test(priority=2)
	public void Searchempy() {
		EmployInformation ip=new EmployInformation(ut);
		ip.Pimclick();
		ip.Employee();
		ip.SupervisorName();
		ip.EmplStatus();
		ip.JobT();
		ip.subtitle();
		ip.Incl();
		ip.Search();
		
	}
	
	@Test(priority=3)
	public void AddEmply()  {
	AddEmployepage ad=new AddEmployepage(ut);
	ad.Clickaddbutton();
	ad.fname();
	ad.midname();
	ad.lname();
	//ad.checkbox();
	//ad.Uname();
	//ad.passw();
	//ad.cpass();
	//ad.Stauts() ;
	ad.submit();
	}
	
	@Test(priority=4)
	public void PersonalInformation() {
		PersonalDetails pi=new PersonalDetails(ut);
		pi.EiditButton();
		pi.DrivingLN();
		pi.SSNNumber();
		pi. OtherID();
		pi.SINNo();
		pi.Expiredate();
		pi.Maternalstatus();
		pi.Natinality();
		pi.Nname();
		pi.MilitaryArea();
		pi.Smoker() ;
		pi.Geander('M');
		pi.Birthday();
		pi.savebutton();
	}
	
	@Test(priority=5)
	public void jobss() {
		Job jb=new Job(ut);
		jb.jobs();
		jb.eidit();
		jb.jobtitle();
		jb.employstatus();
		jb.jobStatus();
		jb.calander();
		jb.subunits() ;
		jb.location();
		jb.scalender();
		jb.ecalender();
		jb.savebutton();
		jb.reason();
		jb.calenders();
		jb.termination();
		jb.configration();
	}
	
	
}
