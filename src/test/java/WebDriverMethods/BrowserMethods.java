package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(URL) method
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//Thread.sleep(50000);
		//driver.close();
		
		driver.findElement(By.xpath("//a[normalize-space()='nopCommerce']")).click();
		driver.quit();
		

	}

}
