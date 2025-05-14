package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement seoul= driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement washington= driver.findElement(By.xpath("//div[@id='box3']"));
		
		WebElement italy= driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement southKorea = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));
		
		
		//drag and drop operation.
		Actions act =new Actions(driver);
		
		act.dragAndDrop(rome, italy).perform();
		act.dragAndDrop(madrid, spain).perform();
		act.dragAndDrop(seoul, southKorea).perform();
		act.dragAndDrop(washington, us).perform();
		
		

	}

}
