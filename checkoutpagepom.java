package assessmentday10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpagepom {
	WebDriver driver;

	public checkoutpagepom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"first-name\"]")
	private WebElement Fname;

	public WebElement getFname() {
		return Fname;
	}
	@FindBy(xpath="//input[@id=\"last-name\"]")
	private WebElement Lname;

	public WebElement getLname() {
		return Lname;
	}
	
	
	@FindBy(xpath="//input[@id=\"postal-code\"]")
	private WebElement pincde;

	public WebElement getPinCode() {
		return pincde;
	}
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement conti;

	public void getConti() {
		conti.click();
	}
	
	@FindBy(xpath="//button[@id=\"finish\"]")
	private WebElement finishbtn;

	public void getFinish() {
		finishbtn.click();
	}
}
