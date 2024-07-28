package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitMethods {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit command
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//get(URL) method
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();

		//mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Username']")));
		
		WebElement username= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));//Explicit wait
		username.sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		WebElement password= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}






