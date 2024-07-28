package CheckboxandDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownwithSelectTag {

	public static void main(String[] args){

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")).click();
		
		/*WebElement drpCountryEle=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select drpCountry=new Select(drpCountryEle);
		
		//selecting an option from dropdown
		//drpCountry.selectByVisibleText("American Samoa");
		//drpCountry.selectByValue("ALB");
		//drpCountry.selectByIndex(4);
		List<WebElement> options= drpCountry.getOptions();
		System.out.println("Total no of dropdown options :"+options.size());
		*/
		
		//without using select class
		driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")).click();

		
		List<WebElement>options=driver.findElements(By.xpath("//option"));
		System.out.println("Total no of dropdown options :"+options.size());
		
		
		/*//print options in console wondow
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	
		//foreach lopp
		/*for(WebElement opn: options)
		{
			System.out.println(opn.getText());
		}*/
	}

}






