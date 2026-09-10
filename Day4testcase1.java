package WebDrivermethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4testcase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		List<WebElement> tf = driver.findElements(By.tagName("input"));
		System.out.println(tf.size());
		Thread.sleep(2000);
		for(WebElement e:tf) {
			System.out.println(e.getSize());
		}
	}

}
	


