package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TofindmultiplewebelementsusingClassName {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("http://www.automationpractice.pl/index.php?");
		driver.manage().window().maximize();
		
		
		//finding elements using same classname
		List<WebElement> sliders= driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders:" +sliders.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("No of images: " +images.size());

		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of links:" +links.size());
		
		driver.quit();
	}

}




