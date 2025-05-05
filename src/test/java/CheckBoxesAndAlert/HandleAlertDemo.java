package CheckBoxesAndAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		// 1) normal alert with ok
		/*Alert myalert=driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		myalert.accept();
        */
		
		// 2-- alert with ok and cancel button.
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		// 3-- alert with prompt 
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert mypromtalr=driver.switchTo().alert();
		mypromtalr.sendKeys("welcome");
		mypromtalr.accept();
		
	}

}
