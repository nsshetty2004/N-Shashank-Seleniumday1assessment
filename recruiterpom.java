package day12Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recruiterpom {
	WebDriver driver;
	public recruiterpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Vacancies']")
	private WebElement vac;
	public void getVac() {
		 vac.click();
	}
	@FindBy(xpath="//button[normalize-space()=\"Add\"]")
	private WebElement add;
	public void getAdd() {
		 add.click();
		
	}
	
	
	
	

}
