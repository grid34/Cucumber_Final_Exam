package pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public static WebDriver driver;
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	public void takeScreenshot (WebDriver driver) {  
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;  
		  try {
		   
		   SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		   Date date = new Date();
		   String label = formatter.format(date);
		   
		   FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png"));
		  } catch (Exception e) {
		   e.printStackTrace();
		  }   
		 } 
	

}
