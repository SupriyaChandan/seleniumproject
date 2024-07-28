package CheckboxandDropdowns;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDDc {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@class='gLFyf'][@title='Search']")).sendKeys("selenium");
		
		List<WebElement>opns=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		System.out.println("No of options in auto suggestions...:" +opns.size());
		
		/*for(int i=0;i<opns.size();i++)
		{
			System.out.println(opns.get(i).getText());
		}*/
		
		for(int i=0;i<opns.size();i++)
			{
			
			String text=opns.get(i).getText();
			
			if(text.equals("selenium python"))
			{
				opns.get(i).click();
				break;
				
			}
			
			
			}

	}

}









