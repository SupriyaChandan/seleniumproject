package Alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='sb_form_ic']//textarea")).sendKeys("java tutorial");
		
		List<WebElement>optn=driver.findElements(By.xpath("//div[@class='sa_tm']//span"));
		System.out.println("Total no of options:" +optn.size());
		driver.close();
	}

}


