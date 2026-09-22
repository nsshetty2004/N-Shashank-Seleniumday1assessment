package FinalAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testcase2final {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.id("slide"));

		 Actions actions = new Actions(driver);

		 actions.moveToElement(slider, 100, 0).click().build().perform();
		 Thread.sleep(2000);
	
	    WebElement oplaced = driver.findElement(By.xpath("//h3[contains(text(), 'Mens Cotton Jacket')]"));
	    if(oplaced.isDisplayed()) {
	    	System.out.println("slided upto mens cotton jacket");
	    }
	    else {
	    	System.out.println("not slided");
	    }
	}
	    
	

}
