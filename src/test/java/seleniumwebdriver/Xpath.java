package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Relative xpath
		String Productname= driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
		System.out.println(Productname);
		
		//Absolute xpath
		//String P1= driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div[1]/h4/a")).getText();
		//System.out.println(P1);
	}

}





