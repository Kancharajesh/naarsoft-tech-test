package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;
import javax.xml.transform.Source;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.jce.spec.GOST3410PublicKeySpec;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseTest.Baseclass;

public class Login extends Baseclass 
{
	
	@Test(priority = 1,enabled = true)
	public static void Bookappointment() throws IOException, Exception
	{
		//Click on MakeAppointment.
		driver.findElement(By.cssSelector(prop.getProperty("MakeAppointment"))).click();
		
		// ENTER USERID & PASSWORD.
		driver.findElement(By.cssSelector(prop.getProperty("Username"))).sendKeys(prop.getProperty("UsernameId"));
		driver.findElement(By.cssSelector(prop.getProperty("Password"))).sendKeys(prop.getProperty("PasswordId"));
		
		// Click ON LOGIN.
		driver.findElement(By.cssSelector(prop.getProperty("inSideLogin"))).click();
		
		// AFTER LOGIN.
		
		// CLICK ON FACILITY.
		driver.findElement(By.cssSelector(prop.getProperty("Facility"))).click();
		// SELECT FACILITY.	
		driver.findElement(By.cssSelector(prop.getProperty("SeoulCURAHealthcareCenter"))).click();
		 
		// SELECT CHECK bOX. 
		driver.findElement(By.cssSelector(prop.getProperty("Checkboxclick"))).click();
		
		//SELECT HEALTHCARE PROGRAM.
		driver.findElement(By.xpath(prop.getProperty("Medicaid"))).click();
		 
		 // SELECT DATE.
		driver.findElement(By.cssSelector(prop.getProperty("Datepicker"))).click(); 		
		 String monthyear = driver.findElement(By.cssSelector(prop.getProperty("Datepickertitle"))).getText();
		 System.out.println(monthyear);//February 2024 
			String month = monthyear.split(" ")[0].trim();
			String year = monthyear.split(" ")[1].trim();
	
		
		while (!(month.equals("June") && year.equals("2024"))) {
		
			driver.findElement(By.xpath(prop.getProperty("calendernext"))).click();
			monthyear = driver.findElement(By.cssSelector(prop.getProperty("Datepickertitle"))).getText();
			System.out.println(monthyear);//February 2024
				month = monthyear.split(" ")[0].trim();
				year = monthyear.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//td[text()='2']")).click();
		
			
			
			// Comment text.
			driver.findElement(By.cssSelector(prop.getProperty("comment"))).sendKeys(prop.getProperty("commenttext"));
			
			Thread.sleep(2500);
			 
			// CLICK ON	 Book-appointment.
			driver.findElement(By.cssSelector(prop.getProperty("Book-appointment"))).click();
			
			//TAKE SCREEN SHORT METHOD.	
			TakesScreenshot screenshort = (TakesScreenshot)driver;
			File source = screenshort.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C://tmp//2.png"));
			
			//lOGOUT.
			driver.findElement(By.cssSelector(prop.getProperty("ClickonThreedotoption"))).click();
			driver.findElement(By.xpath(prop.getProperty("logout"))).click();
		}
	
	
	
	
		
		 @Test(priority = 2,enabled = true)
		 public static void PRINTFACILITY() throws IOException, Exception
		 {
		//Click on MakeAppointment.
		driver.findElement(By.cssSelector(prop.getProperty("MakeAppointment"))).click();
		
		// ENTER USERID & PASSWORD.
		driver.findElement(By.cssSelector(prop.getProperty("Username"))).sendKeys(prop.getProperty("UsernameId"));
		driver.findElement(By.cssSelector(prop.getProperty("Password"))).sendKeys(prop.getProperty("PasswordId"));
		
		// Click ON LOGIN.
		driver.findElement(By.cssSelector(prop.getProperty("inSideLogin"))).click();
		
		//AFTER LOGIN.
		
		//CLICK ON FACILITY.
		driver.findElement(By.cssSelector(prop.getProperty("Facility"))).click();
		
//		String facilityetails = driver.findElement(By.cssSelector(prop.getProperty("Facility"))).getText();
//			System.out.println("print the all elements :"+facilityetails);
			
			Select dropdown = new Select(driver.findElement(By.cssSelector(prop.getProperty("Facility"))));
			dropdown.selectByValue("Hongkong CURA Healthcare Center");
			
			Thread.sleep(5500);
		
		 }

		 
		 
		 @Test(priority = 3,enabled = true)
		 public static void Errormessgae() throws IOException, Exception
		 {
			 
			//Click on MakeAppointment.
				driver.findElement(By.cssSelector(prop.getProperty("MakeAppointment"))).click();
				
				// ENTER USERID & PASSWORD.
				driver.findElement(By.cssSelector(prop.getProperty("Username"))).sendKeys(prop.getProperty("UsernameId"));
				driver.findElement(By.cssSelector(prop.getProperty("Password"))).sendKeys(prop.getProperty("invalidpassword"));
				
				// Click ON LOGIN.
				driver.findElement(By.cssSelector(prop.getProperty("inSideLogin"))).click();
				
				// Error message print 
				 boolean Display = driver.findElement(By.xpath(prop.getProperty("LoginEroormsg"))).isDisplayed();
				System.out.println("Element displayed is :"+Display);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 @Test(priority = 4,enabled = true)
			public static void Bookappointment1() throws IOException, Exception
			{
				//Click on MakeAppointment.
				driver.findElement(By.cssSelector(prop.getProperty("MakeAppointment"))).click();
				
				// ENTER USERID & PASSWORD.
				driver.findElement(By.cssSelector(prop.getProperty("Username"))).sendKeys(prop.getProperty("UsernameId"));
				driver.findElement(By.cssSelector(prop.getProperty("Password"))).sendKeys(prop.getProperty("PasswordId"));
				
				// Click ON LOGIN.
				driver.findElement(By.cssSelector(prop.getProperty("inSideLogin"))).click();
				
				// AFTER LOGIN.
				
				// CLICK ON FACILITY.
				Select alloptions = new Select(driver.findElement(By.cssSelector(prop.getProperty("Facility"))));
				
				alloptions.selectByIndex(1);
				
				Thread.sleep(2500);
			
				 
				// SELECT CHECK bOX. 
				driver.findElement(By.cssSelector(prop.getProperty("Checkboxclick"))).click();
				
				//SELECT HEALTHCARE PROGRAM.
				driver.findElement(By.xpath(prop.getProperty("None"))).click();
				
				// SELECT DATE.
				driver.findElement(By.cssSelector(prop.getProperty("Datepicker"))).click(); 
				
			
				selectDate("20", "June", "2024");
				}

		 public static String[] getmonthyear(String monthyear) {
			return monthyear.split(" ");
		}
		 
		 	public static void selectDate(String exDay, String exmonth, String exYear) throws Exception {
				String monthyear = driver.findElement(By.cssSelector(prop.getProperty("Datepickertitle"))).getText();
				System.out.println(monthyear);			

				while (!(getmonthyear(monthyear)[0].equals(exmonth)
				&&
				getmonthyear(monthyear)[1].equals(exYear)))	{
					
					driver.findElement(By.xpath(prop.getProperty("calendernext"))).click();
					monthyear = driver.findElement(By.cssSelector(prop.getProperty("Datepickertitle"))).getText();
			}
				
				driver.findElement(By.xpath("//td[text()='"+exDay+"']")).click();
				
				// CLICK ON	 Book-appointment.
				driver.findElement(By.cssSelector(prop.getProperty("Book-appointment"))).click();
				
				//TAKE SCREEN SHORT METHOD.	
				TakesScreenshot screenshort = (TakesScreenshot)driver;
				File source = screenshort.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("C://tmp//3.png"));
				
				//lOGOUT.
				driver.findElement(By.cssSelector(prop.getProperty("ClickonThreedotoption"))).click();
				driver.findElement(By.xpath(prop.getProperty("logout"))).click();
			}
					
				
}
