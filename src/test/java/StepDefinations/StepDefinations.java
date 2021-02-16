package StepDefinations;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CucumberBDD.CucumberBDD.ObjectRepository;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinations {
	WebDriver driver;
	ObjectRepository lp;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver();

		lp=new ObjectRepository(driver);


	}

	@Given("User navigate to the {string} in browser")
	public void user_navigate_to_the_in_browser(String string) throws InterruptedException {
		driver.get(string);
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}

	@When("User enters {string}")
	public void user_enters_userid(String userid) {
		lp.setUsername(userid);
	}

	@And("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		lp.clickLogin();
		Thread.sleep(6000);
	}

	@Then("Dashbord Should be displayed")
	public void dashbord_should_be_displayed() {
		String lbl=lp.lblPresent();
		Assert.assertEquals(lbl, "Dashboard");
	}
	
	@After
	public void teardown() {
		driver.quit();
	}

}
