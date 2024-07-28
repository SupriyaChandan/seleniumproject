package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertwithinputbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alrt=driver.switchTo().alert();
		//Alert alertWindow1=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alrt.getText());
		
		alrt.sendKeys("welcome");
		
		//alrt.accept();
		alrt.dismiss();
		//validation
		String act_txt=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_txt="You entered: welcome";
		
		if(act_txt.equals(exp_txt))
		{
			System.out.println("test passed..");
		}
		else
		{
			System.out.println("test failed");
		}
	}

}









