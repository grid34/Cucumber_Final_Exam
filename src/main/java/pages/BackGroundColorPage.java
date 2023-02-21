package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

public class BackGroundColorPage {
	WebDriver driver;
	
	
	
	SoftAssert softAssert;
	String actualbackgroundColor;
	String expectedBackgroundColor;

	public BackGroundColorPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "button[onclick=\"myFunctionSky()\"]")
	WebElement SkyBlueButtonPosition;
	@FindBy(how = How.CSS, using = "body[style = 'background-color: skyblue;']")
	WebElement SkyBlueBackgroundColor;
	@FindBy(how = How.CSS, using = "button[onclick=\"myFunctionWhite()\"]")
	WebElement WhiteButtonPosition;
	@FindBy(how = How.CSS, using = "body[style = 'background-color: white;']")
	WebElement WhiteBackgroundColor;

	
	
	
	public String ButtonExists(String button) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (button.equalsIgnoreCase("Set SkyBlue Background")) {
			return SkyBlueButtonPosition.getText();
		} else {
			return WhiteButtonPosition.getText();
		}
	}

	public void clickOnButton(String button) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (button.equalsIgnoreCase("Set SkyBlue Background")) {
			SkyBlueButtonPosition.click();
		}else{
			WhiteButtonPosition.click();}

	}

	public String backgroundColor(String color) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(color.equalsIgnoreCase("sky blue")) {
			return SkyBlueBackgroundColor.getText();
		}else {
			return WhiteBackgroundColor.getText();
		}
		 
	}


}