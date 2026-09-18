package assessmentday10;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class saucebaseclass {
	WebDriver driver=null;
	@BeforeSuite
	public void Bs() {
		System.out.println("establish database connection");
	}
	@BeforeTest
	public void Bt() {
		System.out.println("pre conditions");
	}
	@BeforeClass
	public void Bc() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("launching the browser");
	}
	@BeforeMethod
	public void Bm() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./src/main/java/assessmentday10/commonpropertyday10");
		Properties p1 = new Properties();
		p1.load(fis);
		
		
		String browser = (p1.getProperty("browser"));
	    String url = (p1.getProperty("url"));
	    String username = (p1.getProperty("username"));
	    String password = (p1.getProperty("password"));
	    
	    driver.get(url);
	    loginpom l=new loginpom(driver);
	    l.getUsernamefield().sendKeys(username);
	    l.getPasswordfield().sendKeys(password);
	    Thread.sleep(2000);
	    l.getLoginbutton().click();
		
	}
	@AfterMethod
	public void AM() {
		System.out.println("All methods Executed");
	}
	@AfterClass
	public void AC() {
		driver.quit();
		System.out.println("CLosing the browser");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("Post-conditions");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("Disconnect the DB Connectivity");
	}
	
	

}
