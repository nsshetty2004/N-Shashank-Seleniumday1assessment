package assessmentday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutcompletepom {
	WebDriver driver;

	public checkoutcompletepom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()=\"Thank you for your order!\"]")
	private WebElement msg;

	public WebElement getMsg() {
		return msg;
	}
}
