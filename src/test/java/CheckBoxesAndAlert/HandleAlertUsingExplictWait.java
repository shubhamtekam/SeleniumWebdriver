package CheckBoxesAndAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebDriverWait eWait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert myalert=eWait.until(ExpectedConditions.alertIsPresent());
				
		System.out.println(myalert.getText());
		myalert.accept();
		       

	}

}
