package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1_DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		box1.clear();
		String text="Selenium";
		box1.sendKeys(text);
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//double click action
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		
		String text1 =box2.getDomProperty("value");
		//validation for text copied 
		if(text.equals(text1))
		{
			System.out.println("Text copied..");
		}
		else
		{
			System.out.println("Text not copied..");
		}

	}

}
