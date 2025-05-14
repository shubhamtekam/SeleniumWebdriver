package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubleClickDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/Tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement textBox1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement textBox2=driver.findElement(By.xpath("//input[@id='field2']"));
		textBox1.clear(); // to clear existing text
		String sendtext="Welcome to java";
		textBox1.sendKeys(sendtext);
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		// Double click action
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		
		String text=textBox2.getDomProperty("value");
		// validation box2 contains "Welcome to java"
		if(sendtext.equals(text))
		{
			System.out.println("Text copied ");
		}
		else
		{
			System.out.println("Text not copied");
		}
	}

}
