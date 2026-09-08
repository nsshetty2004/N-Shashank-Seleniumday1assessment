package WebDrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssesmentMyntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		WebElement sb=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		sb.sendKeys("Apple earphones",Keys.ENTER);
		WebElement sb1=driver.findElement(By.xpath("(//h4[text()='EarPods (USB-C)']/../../..)//span[@class=\"product-wishlistFlex product-actionsButton product-wishlist \"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",sb1);
		
		
		
		
		
	}

}
