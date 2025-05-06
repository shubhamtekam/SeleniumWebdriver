package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
		// select country 
		WebElement ele= driver.findElement(By.id("country-list"));
		Select dropdown = new Select(ele);
		
		List<WebElement> elements=dropdown.getOptions();
		
		System.out.println("no of options="+elements.size());
		
		for(WebElement op : elements )
		{
			System.out.println(op.getText());
		}
		
		dropdown.selectByValue("4");
		
		// select state
		WebElement state = driver.findElement(By.id("state-list"));
		Select sdropdown = new Select(state);
		Thread.sleep(4000);
		List<WebElement> states = sdropdown.getOptions();
		System.out.println("no of states:"+states.size());
		
		for(WebElement ops: states )
		{
			System.out.println(ops.getText());
		}
		
		sdropdown.selectByVisibleText("Tamil Nadu");
	}

}
