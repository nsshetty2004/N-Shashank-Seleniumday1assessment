package assessmentday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpom {
	WebDriver driver;

	public loginpom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	private WebElement usernamefield;
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	private WebElement passwordfield;
	@FindBy(xpath="//input[@class=\"submit-button btn_action\"]")
	private WebElement loginbutton;

	public WebElement getUsernamefield() {
		return usernamefield;
	}
	public WebElement getPasswordfield() {
		return passwordfield;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
}
