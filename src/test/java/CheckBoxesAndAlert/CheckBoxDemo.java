package CheckBoxesAndAlert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate checkbox sunday
		//driver.findElement(By.id("sunday")).click();
		
		//locate all the checkboxes.
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        
		//normal for loop
    	/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement checkbox : checkboxes)
		{
			checkbox.click();
		}*/
		
		// select last 3 checkboxes
		// total no.of boxes - how many you want to select = starting index
		
		for(int i=3; i< checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		// unselect the selected checkboxes.
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
	}

}
