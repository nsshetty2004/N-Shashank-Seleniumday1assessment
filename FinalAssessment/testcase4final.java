package FinalAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase4final {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='iphone']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"Check Delivery\"]")).sendKeys("583229");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"Check\"]")).click();
		
		//verfication
		WebElement check = driver.findElement(By.xpath("//a[text()='Check deliverable pins.']"));
		if(check.isDisplayed()) {
			System.out.println("Product is not diliverable to Your location");
		}else{
			System.out.println("Product is diliverable to Your location");
		}
		
		
	}

}
