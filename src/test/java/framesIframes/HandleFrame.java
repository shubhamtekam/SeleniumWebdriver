package framesIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//switch to frame 1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		//switch to frame 2
		WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		// switch to frame 3
		WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("webdriver");
		
		driver.switchTo().frame(0);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement ele= driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		
		js.executeScript("arguments[0].click()",ele);
		
		driver.switchTo().defaultContent();
	}

}
