package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatePopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//https://the-internet.herokuapp.com/basic_auth
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		String txt=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		if(txt.contains("Congratulations"))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
		driver.close();
	}

}
