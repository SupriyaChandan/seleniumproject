package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectors {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//tag and ID #
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		//Tag and class .
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Laptop");
		
		//Tag and Attribute []
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Airline");
		//double quotation is not allowed inside double quotes, if we want to use"" then we can use with help of \\backward slash
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Airline");
		
		
		//Tag,Class and Attribute .[]
		driver.findElement(By.cssSelector("input.search-box-text[Placeholder='Search store']")).sendKeys("Mobile");
		
}

}




