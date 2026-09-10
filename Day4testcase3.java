package WebDrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4testcase3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		WebElement app = driver.findElement(By.xpath("(//input[@type=\"text\" and @placeholder=\"Search for Products...\"])[2]"));
		app.sendKeys("apple",Keys.ENTER);
		Thread.sleep(2000);
		WebElement ref = driver.findElement(By.xpath("//h3[normalize-space(text())='Apple - Royal Gala Economy']/../../../..//button[@pattern=\"outline\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",ref);
		Thread.sleep(2000);
		ref.click();
		WebElement txt = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']"));
		if(txt.getText().contains("successfully")) {
			System.out.println(txt.getText());
		}
		else {
			System.out.println("product is not added");
		}
	}

}
