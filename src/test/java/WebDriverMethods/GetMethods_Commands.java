package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods_Commands {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get(url) method
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		//getTitle() method- no need to give the parameter 
		//System.out.println("Title of the page" +driver.getTitle());
		String Title= driver.getTitle();
		System.out.println("Title of the WEB PAGE: "+Title);
		
		//getCurrentURL()
		System.out.println("Current URL is:" +driver.getCurrentUrl());
		
		//getPageSource()
		
		//System.out.println("Page source......");
		//System.out.println(driver.getPageSource());  //to print entre source code
		
		System.out.println("Page source......");
		String ps= driver.getPageSource();
		System.out.println(ps.contains("html")); //true or false
		
		//getWindowHandle()
		System.out.println("It will return the ID of the Browser window: " +driver.getWindowHandle());
		
		//getWindowHandles()
		//System.out.println("HANDLES...."+driver.getWindowHandles());
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		//approach1
		Set<String> handles=driver.getWindowHandles();
		
		for(String winid: handles)
		{
			System.out.println(winid);
		}
		
		//approch2
		//System.out.println("HANDLES...."+driver.getWindowHandles());  //A3AD754C4E347B1EFB640C9EBA3BD8AD
		                                                                //07E77DB5C9F478BC2482CAE91FB8F9F3
		
	}

}



