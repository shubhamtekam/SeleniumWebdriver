package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act = new Actions(driver);
        //rightClick on button
        act.contextClick(button).build().perform();
        
        //click on copy
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
        
        //close alert box 
        driver.switchTo().alert().accept();
        
        System.out.println("test passed");
        
        
        
	}

}
