package day12Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmhomepagepom {
	WebDriver driver;
	public orangehrmhomepagepom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//recuterlink
			@FindBy(xpath = "//span[text()='Recruitment']")
			private WebElement recruitmrnt;
			public void getRecruitmrnt() {
				recruitmrnt.click();
			}
			
	//myinfolink
			@FindBy(xpath = "//span[text()='My Info']")
			private WebElement myinfo;
			public void getMyinfo() {
				 myinfo.click();
			}
			//profile
			@FindBy(xpath = "(//img[@alt=\"profile picture\"])[1]")
			private WebElement mypro;
			public void getMypro() {
				 mypro.click();;
			}
			
			//logout
			@FindBy(xpath = "//a[text()='Logout']")
			private WebElement logout;
			public void getLogout() {
				logout.click();
			}

			
			
			

}
