package WebDriverMethods;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//declaration of FW
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30))
			    .pollingEvery(Duration.ofSeconds(10))
			    .ignoring(NoSuchElementException.class);*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		FluentWait mywait =new FluentWait(driver);
			    mywait.withTimeout(Duration.ofSeconds(30));
			    mywait.pollingEvery(Duration.ofSeconds(5));
			    mywait.ignoring(NoSuchElementException.class);
				
		WebElement username =(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//input[@placeholder='Username']")));		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		username.sendKeys("Admin");
	}

}





