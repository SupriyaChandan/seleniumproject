package CheckboxandDropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//select specific check-box
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//total no of check-boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		System.out.println("Total no of checkboxes: " +checkboxes.size()); //7
		
		//Select ALL check-boxes
		//using normal for loop
		/*for(int i=0;i<checkboxes.size();i++)   //list is index type so it will start with 0
		{
			checkboxes.get(i).click();  //in list we have to use get method but in array we can use [i]
		}*/
	
		//enhanced for loop
	/*	for(WebElement chbx:checkboxes)
		{
			chbx.click();
		}
		*/
		//select last two check-boxes
		//total no of check-boxes-how many check-boxes to be selected= starting index
		//7-2=5
		/*for(int i=5;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//select first 2 check-boxes
		/*for(int i=0;i<checkboxes;i++)
		{
			if(i<2)
			{
			checkboxes.get(i).click();
			}
		}
		 * 
		 * 
		 * for(int i=0;i<2;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//select only sunday and tuesday and thursday-even numbers
		/*for(int i=0;i<=4;i++)
		{
			if(i%2==0)
			{
			checkboxes.get(i).click();
			}
		}
		*/
		
		//clear- un-check the check-boxes- we can use click method also
		//first selecting all checkboxes
		/*for(int i=0;i<3;i++)
		{
			
			checkboxes.get(i).click();
		}
		
		//unchecking till wednesday
		/*for(int i=0;i<checkboxes.size();i++)
		{
			
			checkboxes.get(i).click();
		}*/
		
		//selecting all the checkboxes
		//using normal for loop
	/*	for(int i=0;i<checkboxes.size();i++)
		{
			
			checkboxes.get(i).click();
		}
		
		//unselected till wednesday
		for(int i=0;i<4;i++)
		{
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
			}
		}*/
		
		//enhanced for loop
		for(int i=0;i<3;i++)
		{
			
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		for(WebElement checkbx:checkboxes)
		{
			if(checkbx.isSelected())
			{
				checkbx.click();
			}
		}
	}

}







