package WebDrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Assessmenttestcase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("(//span[text()='Create new account']/ancestor::div[@role=\"none\"])[1]"));
		WebElement email = driver.findElement(By.name("email"));
		System.out.println(email.getDomProperty("value"));
		System.out.println(email.getDomAttribute("value"));
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		System.out.println(email.getDomProperty("value"));
		System.out.println(email.getDomAttribute("value"));
		b.click();
		WebElement btn = driver.findElement(By.xpath("//span[text()='Submit']/ancestor::div[@class='x3nfvp2 x1n2onr6 xh8yej3']"));
		System.out.println(btn.getSize());
		System.out.println(btn.getCssValue("font-family"));
		System.out.println(btn.getCssValue("width"));
		System.out.println(btn.getCssValue("position"));
		System.out.println(btn.getCssValue("display"));
		Thread.sleep(3000);
		
		
	}

}
