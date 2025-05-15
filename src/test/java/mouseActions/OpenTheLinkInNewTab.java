package mouseActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reg=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		//to open link in new tab
		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
		
		Set<String> ids=driver.getWindowHandles();
		List<String> id= new ArrayList<String>(ids);
		
		// to switch window
		driver.switchTo().window(id.get(1));
		
		//locate element
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Steve Smith");
		
		// to switch window
		driver.switchTo().window(id.get(0));
		
		//locate element
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

	}

}
