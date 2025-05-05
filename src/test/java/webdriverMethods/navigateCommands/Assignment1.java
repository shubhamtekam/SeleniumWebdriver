package webdriverMethods.navigateCommands;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		List<WebElement> links=driver.findElements(By.partialLinkText("Selenium"));
		System.out.println(links.size());
		
		for(WebElement link:links)
		{
			link.click();
		}
		Set<String> windowIds=driver.getWindowHandles();
		
		for(String windowId : windowIds)
		{
			String title=driver.switchTo().window(windowId).getTitle();
			if(title.equals("Selenium in biology - Wikipedia") || title.equals("Selenium disulfide - Wikipedia"))
			{
				driver.close();
			}
		}

	}

}
