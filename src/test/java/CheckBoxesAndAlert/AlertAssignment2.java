package CheckBoxesAndAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://mypage.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=' Go ']")).click();
		
		Alert myalert=myWait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		myalert.accept();
	}

}
