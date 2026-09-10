package WebDrivermethods;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day3Assessmenttestcase1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("a_FromSector_show")).sendKeys("Banglore");
		driver.findElement(By.xpath("//p[text()='Kempegowda International Airport']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("a_Editbox13_show")).sendKeys("Delhi");
		driver.findElement(By.xpath("//p[text()='Indira Gandhi International Airport']")).click();
		driver.findElement(By.id("snd_4_10/09/2026")).click();
		driver.findElement(By.id("iDownArr")).click();
		driver.findElement(By.xpath("//p[text()='  Adults']")).click();
		driver.findElement(By.id("add")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Search\" and @tabindex=\"1\"]")).click();
		Thread.sleep(2000);
		if(driver.getTitle().contains("EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com")) {
			System.out.println("flight-results page is displayed.");
		}else {
			System.out.println("flight-results page is not displayed.");
		}
		
		
		
		
		
	}

}
