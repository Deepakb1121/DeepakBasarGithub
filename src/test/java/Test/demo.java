package Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://emp.apmosys.com/ApmosysLeaveManagement/?_gl=1*4b01p4*_ga*MTU2MzM3OTAxNy4xNjQxNzkzNzYy*_ga_HBXM8LSCLL*MTY2NjI2MjA4MC4xMi4wLjE2NjYyNjIwODAuMC4wLjA.&_ga=2.181410721.765055917.1666262080-1563379017.1641793762");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.findElement(By.id("username")).sendKeys("prashant.motghare@apmosys.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Apmosys@123");	
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.apmosys.com/webmail/");
		
		
			driver.findElement(By.xpath("//input[@name=\'email-address\']")).sendKeys("prashant.motghare@apmosys.com");
			driver.findElement(By.xpath("//button[@name=\'next\']")).click();
			
			driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("Welcome@2022");
			driver.findElement(By.xpath("//button[@type=\'button\']")).click();

		//driver.switchTo().frame(driver.findElement(By.id("gui.frm_main.main.mailview#frame")));
		//	String s1=driver.findElement(By.id("iw_webmail_msg_body")).getText();
		//	System.out.println(s1);
		//	String otp=s1.substring(21);
		Thread.sleep(15000);
			Set<String>window=driver.getWindowHandles();
			Iterator<String>it=window.iterator();
			
			String parent=it.next();
			String child=it.next();
		driver.switchTo().window(parent);
		//	driver.findElement(By.id("otp")).sendKeys(otp);
		//	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\'submit\']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa fa-file-text-o']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("View My EOD")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("txtFromDate")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//td[@data-month=\'10\']")).click();
	        
	        WebElement drop=driver.findElement(By.xpath("//*[@id=\'viewEodDataTable_length\']/label/select"));
	        
	        Select dropdown=new Select(drop);
	        
	        dropdown.selectByIndex(2);
	        System.out.println(dropdown.getFirstSelectedOption().getText());
	        
	        Thread.sleep(2000);
	}
}
