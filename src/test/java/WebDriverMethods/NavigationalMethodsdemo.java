package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethodsdemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//get(url) method
		//driver.get("https://demo.nopcommerce.com/register");
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());

	}

}
