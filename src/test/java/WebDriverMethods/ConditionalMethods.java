package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(url) method
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		//isDisplayes()
		//Approach1
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display status of logo: " +logo.isDisplayed());
		
		//Approach2
		Boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		//Search box isDisplayed or not
		//Boolean status1=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
		//System.out.println("Search input is present or not: " +status1);

		//or
		WebElement status1=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Search input is present or not: " +status1.isDisplayed());
		System.out.println("Search input is enabled or not: " +status1.isEnabled());

		//isEnabled()
		Boolean status2=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Name box is enabled or not: " +status2);
		
		//Thread.sleep(5000);
		//isSelected()
		WebElement M1=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement F1=driver.findElement(By.xpath("//input[@id='gender-female']"));

		//Before selection
		System.out.println("........Before selection........");
		System.out.println(M1.isSelected());
		System.out.println(F1.isSelected());
		
		//After Selection of male radio button
		System.out.println("After selection of male radio button....");
		M1.click();
		System.out.println(M1.isSelected());
		System.out.println(F1.isSelected());
		
		System.out.println("After selection of female radio button....");
		Thread.sleep(2000);
		F1.click();
		System.out.println(M1.isSelected());
		System.out.println(F1.isSelected());

	}

}
