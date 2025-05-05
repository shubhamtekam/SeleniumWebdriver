package framesIframes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrame1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("java");
		driver.findElement(By.linkText("https://a9t9.com")).click();
		Set<String> id=driver.getWindowHandles();
		List<String> windowList= new ArrayList<String>(id);
		String childid= windowList.get(0);
		driver.switchTo().window(childid);
		String title=driver.getTitle();
		if(title.equals("2025 Open-Source RPA Software/Web Automation/Computer Use for Windows, macOS and Linux"))
		{
			System.out.println("pass");
		}
		

	}

}
