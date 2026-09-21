package day12Assessment;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class orangehrmbaseclass {
	WebDriver driver=null;
	@BeforeSuite
	public void Bs() {
		System.out.println("establish database connectivity");
	}
	@BeforeTest
	public void Bt() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/java/day12Assessment/day12properties");
		Properties p = new Properties();
		p.load(fis);
		
		//properties file
		String BROWSER = p.getProperty("browser");
		if(BROWSER.equals("chrome")) {
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Pre conditions");
	}
	@BeforeMethod
	public void Bm() throws IOException {
		System.out.println("Im in before method");
		
		
		
		orangeHrmpomlogin o =new  orangeHrmpomlogin(driver);
		driver.get(o.getUrl());
		o.getUn();
		o.getPwd();
		o.getLgbutton();
		//driver.switchTo().alert().accept();
		
	}
	@AfterMethod
	public void Am() throws InterruptedException {
		orangehrmhomepagepom hg=new orangehrmhomepagepom(driver);
		hg.getMypro();
		Thread.sleep(1000);
		hg.getLogout();
		System.out.println("Logout done");
	}
	@AfterClass
	public void Ac() {
		driver.quit();
		System.out.println("browser is closed");
	}
//	@AfterTest
//	public void At() {
//		System.out.println("post conditions");
//	}
//	@AfterSuite
//	public void As() {
//		System.out.println("database connectivity close");
//	}

}
