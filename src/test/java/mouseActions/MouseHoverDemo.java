package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//mouse hover action
		WebElement computers=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
		act.moveToElement(computers).build().perform();
		WebElement desktop = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Notebooks ']"));
		act.moveToElement(desktop).build().perform();
		
		

	}

}
