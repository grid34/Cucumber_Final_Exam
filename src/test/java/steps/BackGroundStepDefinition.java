package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BackGroundColorPage;
import pages.TestBase;

public class BackGroundStepDefinition extends TestBase {
	BackGroundColorPage bgPage;

	String actualButon2;

	@Before
	public void beforeRun() {
		initDriver();
		bgPage = PageFactory.initElements(driver, BackGroundColorPage.class);
	}

	@Given("{string} white button exists")
	public void w_button_exists(String button) {
		
		driver.get("http://techfios.com/test/101/");
		
		String ActualButton=driver.findElement(By.cssSelector("button[onclick='myFunctionWhite()']")).getText();
		if (ActualButton.equals("Set White Background")) {
			
			System.out.println(" White Button exist!");
		}
		else {
			System.out.println(" White Button  does not  exist!");
		}
	}
		@Given("{string} Blue button exists")
		public void b_button_exists(String button) {
			
			driver.get("http://techfios.com/test/101/");
			
			String ActualButton=driver.findElement(By.cssSelector("button[onclick='myFunctionWhite()']")).getText();
			if (ActualButton.equals("Set White Background")) {
				
				System.out.println(" Blue Button exist!");
			}
			else {
				System.out.println(" Blue Button  does not  exist!");
			}
		
	}

	@When("I click on the Blue {string}")
	public void i_click_on_theBlue(String Blue) throws Exception {

		
		
		driver.findElement(By.cssSelector("button[onclick='myFunctionSky()']")).click();
		
		
		
		
	}
	@When("I click on the White {string}")
	public void i_click_on_theWhite(String White) throws Exception {

		
		
		driver.findElement(By.cssSelector("button[onclick='myFunctionSky()']")).click();
		
		
		driver.findElement(By.cssSelector("button[onclick='myFunctionWhite()']")).click();
		
		
	}

	@Then("the background color will change to white {string}")
	public void the_background_color_will_change_to_white(String colorCss) {
		String bgColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
		switch (colorCss) {
		case "skyblue":
			assert (bgColor.equals("rgba(135, 206, 235, 1)"));
			break;
		case "white":
			assert (bgColor.equals("rgba(255, 255, 255, 1)"));
			break;

		}
		
		takeScreenshot(driver);
	}
	
	@Then("the background color will change to blue {string}")
	public void the_background_color_will_change_to_blue(String colorCss) {
		String bgColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
		switch (colorCss) {
		case "skyblue":
			assert (bgColor.equals("rgba(135, 206, 235, 1)"));
			break;
		case "white":
			assert (bgColor.equals("rgba(255, 255, 255, 1)"));
			break;

		}
		
		takeScreenshot(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
