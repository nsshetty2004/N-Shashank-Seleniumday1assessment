package FinalAssessment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1final {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigating to toggle page
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		Thread.sleep(2000);
		//clicking on disable
		driver.findElement(By.xpath("//a[normalize-space()='Disabled']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> toggles = driver.findElements(
		    By.xpath("//input[@type='checkbox' and @disabled]")
		);

		for (WebElement toggle : toggles) {
		    js.executeScript("arguments[0].removeAttribute('disabled');", toggle);
		    js.executeScript("arguments[0].click();", toggle);
		}
		
		Thread.sleep(2000);
		//placing order
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		//validation
		WebElement oplaced = driver.findElement(By.xpath("//p[contains(text(), 'ORDER PLACED')]"));
		if(oplaced.isDisplayed()) {
			System.out.println("order is placed sucessfully");
		}
		else {
			System.out.println("not placed");
		}
		
		
		

	}

}
