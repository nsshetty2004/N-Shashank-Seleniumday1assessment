package day12Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vacancypom {
	WebDriver driver;
	public vacancypom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement vn;
	public void getVn(String Value) {
		 vn.sendKeys(Value);
	}
	@FindBy(xpath="//div[@class=\"oxd-select-text-input\"]")
	private WebElement jt;
	public void getJt() {
		 jt.click();;
	}
	
	@FindBy(xpath="//div[@role='option']//span[normalize-space(text())='Software Engineer']")
	private WebElement jobtitle;
	public void getJobtitle() {
		 jobtitle.click();;
	}
	
	@FindBy(xpath="//textarea[@placeholder=\"Type description here\"]")
	private WebElement jd;
	public void getJd(String value) {
		 jd.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
	private WebElement hm;
	public void getHm(String value) {
		 hm.sendKeys(value);;
	}
	
	@FindBy(xpath="//label[normalize-space()='Number of Positions']/parent::div/following-sibling::div/child::input")
	private WebElement Nopos;
	public void getNopos(String string) {
		 Nopos.sendKeys(string);
	}
	
	@FindBy(xpath="(//button[@type=\"submit\"])")
	private WebElement savebtn;
	public void getSavebtn() {
		 savebtn.click();
	}
	
	
	
	

}
