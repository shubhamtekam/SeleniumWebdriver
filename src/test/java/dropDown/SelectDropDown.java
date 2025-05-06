package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropDown= driver.findElement(By.id("country"));
		Select option = new Select(dropDown);
		
		// select single option from dropDown
		//option.selectByVisibleText("India");
		//option.selectByValue("japan");
		//option.selectByIndex(4);
		
		// capture all the options from the dropdown
		List<WebElement>options = option.getOptions();
		System.out.println("no of options:"+options.size());
		
		// print all the options from the dropdown
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}

	}

}
