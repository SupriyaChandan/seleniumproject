package TestNGtestsuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTestNG {
  
	WebDriver driver;
	@Test
	void OpenApp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}
	void login()
	{
		driver.findElement(By.xpath("//img[@class='-dOa_b L_FVxe']")).click();
		driver.findElement(By.name("Enter Email/Mobile Number")).sendKeys("98657888");
		driver.findElement(By.name("Request OTP")).click();
	}
	void Closeapp()
	{
		driver.quit();

	}
}
