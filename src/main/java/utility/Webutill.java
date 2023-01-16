package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webutill {
	
	
	public WebDriver driver;
	
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	
	public void close() {
		driver.close();
	}
	
	public void Screenshot(String X) {
		Date x=new Date();
		String date=x.toString();
		System.out.println(date);
		
		String date2=date.replaceAll(":", "_");
		System.out.println(date2);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src1=new File(".//Screenshot//"+date2+".png");
		try {
			FileUtils.copyFile(src,src1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
