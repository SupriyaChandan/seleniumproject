package CheckboxandDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDDwithoutSelectTag {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		//clicking on DD
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//no of options
		List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
		System.out.println("NO OF DD OPTIONS...:" +options.size());
		
		//print all the options
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		//select options from dd
		/*for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equals("Java"))
			{
				options.get(i).click();
				break;
			}
		}
		
		for(int i=0;i<options.size();i++)
		{
			String op=options.get(i).getText();
			
			if(op.equals("Java")|| op.equals("Python"))
			{
				options.get(i).click();
			}
		}*/
		
		//enhanced for loop
		for(WebElement op:options)
		{
			String text=op.getText();
			if(text.equals("Java") || text.equals("Python"))
			{
				op.click();
			}
		}
	
		
	}
	

}





