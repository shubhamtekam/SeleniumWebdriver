package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		// select single option from the dropdown
		//driver.findElement(By.xpath("//input[@value='csharp']")).click();
		
		//capture all options and find out size
		List <WebElement>options= driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		
		System.out.println("no of options in dropdown:"+options.size());
		
		// print all options from dropdown
		for(WebElement opt : options)
		{
			System.out.println(opt.getText());
		}
		
		// select multiple options 
		for(WebElement opt : options)
		{
			String op=opt.getText();
			if(op.equals("Java") || op.equals("Oracle"))
			{
				opt.click();
			}
		}
	}
}
