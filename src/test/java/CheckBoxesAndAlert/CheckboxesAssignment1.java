package CheckBoxesAndAlert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement>checkboxes=driver.findElements(By.xpath("//tr//input[@type='checkbox']"));
		
		for(WebElement checkbox: checkboxes )
		{
			checkbox.click();
		}

	}

}
