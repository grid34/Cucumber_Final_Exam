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

	@Given("{string} button exists")
	public void button_exists(String button) {
		
		driver.get("http://techfios.com/test/101/");
		if (button.equals("sky blue")) {
			String actualButton1 = bgPage.ButtonExists("sky blue");

			String expectedButton1 = "Set SkyBlue Background";
			Assert.assertEquals(expectedButton1, actualButton1);

		} else if (button.equalsIgnoreCase("white")) {
			String actualButton2 = bgPage.ButtonExists("white");

			String expectedButton2 = "Set White Background";
			Assert.assertEquals(expectedButton2, actualButton2);
		}
		
	}

	@When("I click on the {string}")
	public void i_click_on_the(String button) {

		bgPage.clickOnButton(button);
		
		
	}

	@Then("the background color will change to {string}")
	public void the_background_color_will_change_to(String colorCss) {
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
