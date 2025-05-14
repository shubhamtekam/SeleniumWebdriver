package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2_DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement sEle=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dEle=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sEle, dEle).build().perform();
		
		String text=driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		//validation for drag and drop
		if(text.equals("Dropped!"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
	}
}
