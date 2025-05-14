package tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int pages =driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
		
		for(int p=1;p<=pages;p++)
		{
				for(int r=1;r<=5;r++)
				{
					String p_name=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[2]")).getText();
					String price =driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[3]")).getText();
					driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[4]/input")).click();
					System.out.println(p_name+" "+price);
				}
			
			System.out.println("-----------");
			driver.findElement(By.xpath("//ul[@id='pagination']/li["+p+"+1]")).click();
		}
		
		

	}

}
