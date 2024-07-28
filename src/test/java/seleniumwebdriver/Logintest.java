package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("","");
		//WebDriverManager.ChromeDriver().setup();
		
		//Launch browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		//2 step- open url on the browser
		//driver.get("https://www.facebook.com/");
		driver.get("http://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//3Step- Provide User name
		//driver.get("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"); //using xpath
		
		//approch 1
		//WebElement txtUsername= driver.findElement(By.name("username"));
		//txtUsername.sendKeys("Admin");
		
		//Approach2
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		//4 step-- Provide password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Click on Login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(6000);
		
		//verify title of the dashboard page
			String act_title= driver.getTitle();
			String exp_title= "OrangeHRM";
			
			if(act_title.equals(exp_title))
			{
				System.out.println("Test is PASSED");		
			}
			else
				
			{
				System.out.println("Test is FAILED");
			}
			
			//Label validation 
			String actual_title= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			String Expected_title= "Dashboard";
			
			if(actual_title.equals(Expected_title))
			{
				System.out.println("PAASED");
			}
			
			else
			{
				System.out.println("FAILED");
			}
			
			//driver.close();
			//driver.quit();
		
	}

}
