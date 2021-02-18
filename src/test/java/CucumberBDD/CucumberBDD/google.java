package CucumberBDD.CucumberBDD;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class google {
	WebDriver driver;
	
	@FindBy(name="q")
	@CacheLookup
	WebElement txt_search;
	
	@FindBy(xpath="//*[@id=\"result-stats\"]")
	WebElement lbl_results;
	
	public google(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterKeyword(String keyword) {
		txt_search.clear();
		txt_search.sendKeys(keyword+Keys.ENTER);
	}
	
	public String resultsPresent() {
		String resvar=lbl_results.getText();
		return resvar;
	}
	
	

}
