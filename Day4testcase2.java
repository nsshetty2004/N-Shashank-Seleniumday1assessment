package WebDrivermethods;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4testcase2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/bangalore/restaurants");
		driver.findElement(By.xpath("//button[normalize-space(text())='Log in']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"auth-login-ui\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]")).sendKeys("8431068649");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search for restaurant, cuisine or a dish\"]"));
		@Nullable
		String da = search.getDomAttribute("placeholder");
		System.out.println("da");
		if(da.contains("Search for restaurant, cuisine or a dish")) {
			System.out.println("zomato main page is displayed");
		}
		else {
			System.out.println("main page is not displayed");
		}
		
		
		
		
	}

}


