package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		//ID,NAME,CLASSNAME,Link-text/Partial-linktext, TAGNAME
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//Open APP
		driver.get("http://www.automationpractice.pl/index.php?");
		driver.manage().window().maximize();
		
		//find the element using id element-- search box
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts") ;
		Thread.sleep(5000);
		
		//clicking on the search button
		driver.findElement(By.name("submit_search")).click();
		
		//linktext
		driver.findElement(By.linkText("Blouse")).click();
		
		//Partial LinkText
		//driver.findElement(By.partialLinkText("Short Sleeve")).click();
		
		//webelement having same link names -dress 
		//driver.findElement(By.partialLinkText("Dress")).click();  //it will select which ever element is first on the page this default behaviour
		
		
	}

}



