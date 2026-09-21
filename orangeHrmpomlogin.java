package day12Assessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmpomlogin {
	WebDriver driver;
	String URL;
	String USERNAME;
	String PASSWORD;
	public orangeHrmpomlogin(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		FileInputStream fis = new FileInputStream("./src/main/java/day12Assessment/day12properties");
		Properties p = new Properties();
		p.load(fis);
		this.URL = p.getProperty("url");
		this.USERNAME = p.getProperty("username");
		this.PASSWORD = p.getProperty("password");
	}
	//username
		@FindBy(xpath = "//input[@name=\"username\"]")
		private WebElement un;
		//password
		@FindBy(xpath = "//input[@name=\"password\"]")
		private WebElement pwd;
		//login button
		@FindBy(xpath = "//button[@type=\"submit\"]")
		private WebElement lgbutton;
		public String getUrl() {
			return URL;
		}
		
		public void getLgbutton() {
			lgbutton.click();
		}
		public void getUn() {
			un.sendKeys(USERNAME);
		}
		public void getPwd() {
			pwd.sendKeys(PASSWORD);
		}
	

}
