package assessmentday10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class sauceexecutor extends saucebaseclass {
	@Test
	public void logintest() throws EncryptedDocumentException, IOException, InterruptedException {
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("product page is displayed");
		}
		else {
			System.out.println("not displayed");
		}
		productpom p=new productpom(driver);
		p.getAddcart();
		Thread.sleep(2000);
		p.getCartClick();
		
		 cartpom cp = new  cartpom(driver);
		 if(cp.getProduct().isDisplayed()) {
			 System.out.println("Produt is present in the cart ");
		 }else {
			 System.out.println("Produt is not present in the cart ");
		 }
		 cp.getCheckout();
		 FileInputStream fis = new FileInputStream("./src/main/java/assessmentday10/day10.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		String Fname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Lname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String Pincode = String.valueOf((int)wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue());
		 checkoutpagepom cop= new checkoutpagepom(driver);
		 
		 cop.getFname().sendKeys(Fname);
		 cop.getLname().sendKeys(Lname);
		 cop.getPinCode().sendKeys(Pincode);
		 cop.getConti();
		 if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
			 System.out.println("Checkout page is displayed");
		 }else {
			 System.out.println("Checkout page is not displayed");
		 }
		 
		 
	}
	
	@Test
	public void orderplacementTest() throws EncryptedDocumentException, IOException {
		
		productpom p=new productpom(driver);
		p.getAddcart();
		p.getCartClick();
		
		 cartpom cp = new  cartpom(driver);
		 
		 cp.getCheckout();
		 FileInputStream fis = new FileInputStream("./src/main/java/assessmentday10/day10.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String Fname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		 String Lname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		 String Pincode = String.valueOf((int)wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue());
		 checkoutpagepom cop= new checkoutpagepom(driver);
		 
		 cop.getFname().sendKeys(Fname);
		 cop.getLname().sendKeys(Lname);
		 cop.getPinCode().sendKeys(Pincode);
		 cop.getConti();
		 cop.getFinish();
		 checkoutcompletepom ccp= new checkoutcompletepom(driver);
		 if(ccp.getMsg().isDisplayed()) {
			 System.out.println("Message is Displayed");
		 }else {
			 System.out.println("Message is Not Displayed");
		 }
		 
	}
	

}
