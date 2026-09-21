package day12Assessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day12testcase1 extends orangehrmbaseclass {
	
	@DataProvider
	
	public Object[][] vn() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/main/java/day12Assessment/Vacency.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		int rowCount=sh.getLastRowNum();
		Object[][] obj=new Object[rowCount][3];
		for(int row=1;row<=rowCount;row++) {
			obj[row-1][0]=sh.getRow(row).getCell(0).getStringCellValue();
			obj[row-1][1]=sh.getRow(row).getCell(1).getStringCellValue();
			obj[row-1][2]=sh.getRow(row).getCell(2).getStringCellValue();
			
		}
		return obj;
		
		
	}
	
	
	
	
	@Test(priority=1,dataProvider="vn")
	
	
	
	public void testcase1(String vname,String des,String manager) throws AWTException, InterruptedException {
		orangehrmhomepagepom hg=new orangehrmhomepagepom(driver);
		hg.getRecruitmrnt();
		recruiterpom r=new recruiterpom(driver);
		r.getVac();
		//recruiterpom r=new recruiterpom(driver);
		r.getAdd();
		//vname
		vacancypom v=new vacancypom(driver);
		v.getVn(vname);
		v.getJt();
		v.getJobtitle();
		v.getJd(des);
		v.getHm(manager);
		Thread.sleep(2000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		v.getNopos("20");
		v.getSavebtn();
		System.out.println("saved");	
		
	}
	@Test(priority=2)
	
	public void myinfo() throws InterruptedException, IOException {
		orangehrmhomepagepom hg=new orangehrmhomepagepom(driver);
		hg.getMyinfo();
		Thread.sleep(2000);
		Myinfopom i=new Myinfopom(driver);
		i.getFn("Jai");
		Thread.sleep(3000);
		i.getMn("Shree");
		Thread.sleep(3000);
		i.getLn("Ram");
		Thread.sleep(3000);
		i.getId("Er22");
		Thread.sleep(8000);
		i.getSbtn();
		System.out.println("saved");
		
		//logout
		orangehrmhomepagepom hg1=new orangehrmhomepagepom(driver);
		hg1.getMypro();
		Thread.sleep(1000);
		hg1.getLogout();
		System.out.println("Logout done");
		//login
		orangeHrmpomlogin o1 =new  orangeHrmpomlogin(driver);
		o1.getUn();
		o1.getPwd();
		o1.getLgbutton();
		
		orangehrmhomepagepom r2 = new orangehrmhomepagepom(driver);
	    r2.getMyinfo();
	    // Create a new POM for the new page
	    Myinfopom m2 = new Myinfopom(driver);
	    // Get the updated details
	    String updatedFname = m2.getFn();
	    String updatedLname = m2.getLn();
	    // Verify the updated details
	    Assert.assertEquals(updatedFname, "Jai");
	    Assert.assertEquals(updatedLname, "Ram");
	    System.out.println("Test Case - 2 Executed");
		
	}
}



