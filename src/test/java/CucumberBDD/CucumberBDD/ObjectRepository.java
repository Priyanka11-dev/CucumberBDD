package CucumberBDD.CucumberBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository {
	@FindBy(id="txtUsername")
	WebElement txt_userid;
	
	@FindBy(id="btnLogin")
	WebElement btn_login;
	
	@FindBy(xpath="//*[@id=\"right-side\"]/header/div/ohrm-navbar/nav/div/div/ul/li")
	WebElement lbl_dashboard;
	
	WebDriver driver;
	//Actions
	public ObjectRepository(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String userid) {
		txt_userid.clear();
		txt_userid.sendKeys(userid);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	

	public String lblPresent() {
		String lbl=lbl_dashboard.getText();
		return lbl;
	}
}
