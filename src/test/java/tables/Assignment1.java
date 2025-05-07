package tables;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		
		//select source city for flight
		WebElement web1= driver.findElement(By.name("fromPort"));
		Select ele = new Select(web1);
		ele.selectByValue("Boston");
		
		// select destination city 
		WebElement web2= driver.findElement(By.name("toPort"));
		Select ele2 = new Select(web2);
		ele2.selectByVisibleText("New York");
		
		// click on search flight button
		driver.findElement(By.className("btn-primary")).click();
		
		// find no of rows 
		 int rows=driver.findElements(By.xpath("//table[@class='table']//tbody/tr")).size();
		//find the cheapest flight price among all
		float arr[] = new float[5];
		
		//System.out.println(driver.findElement(By.xpath("//table[@class='table']//tr[2]//td[6]")).getText());
		for(int i=1;i<rows;i++)
		{
		     String data = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]/td[6]")).getText();
			 String price=data.substring(1);
		     arr[i]=Float.parseFloat(price);
			
		     //System.out.println(price);
		}
		Arrays.sort(arr);
		
		for(int i=1;i<=rows;i++)
		{
			String data = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]/td[6]")).getText();
			String price=data.substring(1);
			float data1=Float.parseFloat(price);
			//System.out.println(price);
			if(arr[1] == data1)
			{
				driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]/input[1]")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		if(driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).isDisplayed())
		{
			System.out.println("test pass");
		}

	}

}
