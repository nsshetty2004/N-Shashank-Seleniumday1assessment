package WebDrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Assessmenttestcase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		WebElement fn=driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_"));
		WebElement sn=driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_"));
		Point fnloc=fn.getLocation();
		Point snloc=sn.getLocation();
//		
		int fny=fnloc.getY();
		int sny=snloc.getY();
		System.out.println(fny);
		System.out.println(sny);
//		
		if(fny==sny) {
			System.out.println("both are aligned in same line");
		}
		else {
			System.out.println("not aligned in same line");
		}
//		
	}

}
