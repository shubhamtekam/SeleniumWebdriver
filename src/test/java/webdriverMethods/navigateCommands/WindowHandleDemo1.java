package webdriverMethods.navigateCommands;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowId= driver.getWindowHandles();
		
		//Approach1
		/*List<String>windowList = new ArrayList<String>(windowId);
		
		String parentId= winID.get(0);
		String childId= winID.get(1);
		
		// switch window to child
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		// switch window to parent
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
        */
		//approach 2
		for(String winId : windowId)
		{
			String title=driver.switchTo().window(winId).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	}

}
