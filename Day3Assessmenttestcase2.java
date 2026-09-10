package WebDrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Assessmenttestcase2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/datepick?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Select A Date\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"button\" and @aria-label=\"Next Month\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--009 react-datepicker__day--keyboard-selected\"]")).click();
		String date=driver.findElement(By.xpath("//input[@placeholder=\"Select A Date\"]")).getDomAttribute("value");
		System.out.println(date);
		if(!date.isEmpty()) {
			System.out.println("selected date is dispayed correct");
		}
		else {
			System.out.println("not displayed correctly");
		}
	}

}
