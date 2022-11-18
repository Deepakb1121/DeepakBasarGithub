package Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Task {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.144.217.11/BSLI/apps/services/www/eapp/desktopbrowser/default/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("j_username")).sendKeys("550036");
		driver.findElement(By.id("j_password")).sendKeys("str");
		driver.findElement(By.xpath("//a[@class='loginBtn']")).click();
		driver.findElement(By.xpath("(//img[@src='./images/IconsonLandingPage/iChamp.png'])[1]")).click();
		WebElement drp=driver.findElement(By.id("proTitle"));
		Select sel=new Select(drp);
		sel.selectByVisibleText("Mr.");
		driver.findElement(By.id("proFirstName")).sendKeys("Deepak");
		driver.findElement(By.id("proMiddleName")).sendKeys("Babasaheb");
	    driver.findElement(By.id("proLastName")).sendKeys("Basar");
		driver.findElement(By.id("proDOB")).sendKeys("29/06/1998");
//		driver.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("25");
		driver.findElement(By.xpath("(//span[text()='Male'])[1]")).click();	
//		String Path="C:\\Users\\deepak basar\\eclipse\\java-2022-06\\eclipse\\workspace\\Automation1\\Test Data1\\Book (2).xlsx";
//		FileInputStream fis=new FileInputStream(Path);
//		XSSFWorkbook wb=new XSSFWorkbook();
//		String Fname=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//		String Lname=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
//		WebElement Firstname=driver.findElement(By.id("proFirstName"));
//		WebElement lastname=driver.findElement(By.id("proLastName"));
//		Firstname.sendKeys(Fname);
//		lastname.sendKeys(Lname);	
//		String username=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//		String password=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();	
	}
}
