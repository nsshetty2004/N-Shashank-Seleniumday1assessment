package day12Assessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myinfopom {
	WebDriver driver;
	public Myinfopom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="name=\"firstName\"")
//	private WebElement fn;
//	public void getFn(String value) {
//		fn.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//		fn.sendKeys(Keys.BACK_SPACE);
//		 fn.sendKeys(value);
//	}
//	@FindBy(xpath="//input[@placeholder=\"Middle name\"]")
//	private WebElement mn;
//	public void getMn(String value) {
//		mn.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//		mn.sendKeys(Keys.BACK_SPACE);
//		 mn.sendKeys(value);
//	}
//	
//	@FindBy(xpath="//input[@placeholder=\"Last Name\"]")
//	private WebElement ln;
//	public void getLn(String value) {
//		ln.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//		ln.sendKeys(Keys.BACK_SPACE);
//		ln.sendKeys(value);
//	}
//	
//	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
//	private WebElement id;
//	public void getId(String value) {
//		 id.sendKeys(value);
//	}
//	
//	@FindBy(xpath="(//button[text()=' Save '])[2]")
//	private WebElement sbtn;
//	public void getSbtn() {
//		 sbtn.click();
//	}
	
	@FindBy(xpath="//input[@placeholder=\"First Name\"]")
	private WebElement fn;
	public void getFn(String value) {
	fn.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	fn.sendKeys(Keys.BACK_SPACE);
	 fn.sendKeys(value);
	 }
	
	@FindBy(xpath="//input[@placeholder=\"Middle Name\"]")
	private WebElement mn;
	public void getMn(String value) {
		mn.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		mn.sendKeys(Keys.BACK_SPACE);
		 mn.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Last Name\"]")
	private WebElement ln;
	public void getLn(String value) {
		ln.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		ln.sendKeys(Keys.BACK_SPACE);
		ln.sendKeys(value);
	}
	
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	private WebElement id;
	public void getId(String value) {
		 id.sendKeys(value);
	}
	
	@FindBy(xpath="(//button[text()=' Save '])[2]")
	private WebElement sbtn;
	public void getSbtn() {
		 sbtn.click();
	}
	public String getFn() throws InterruptedException {
		Thread.sleep(3000);
		return fn.getDomProperty("value");
	}
	public String getLn() throws InterruptedException {
		Thread.sleep(3000);
		return ln.getDomProperty("value");
	}
	
	
	

}
