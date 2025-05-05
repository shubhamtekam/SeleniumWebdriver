package CheckBoxesAndAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=' Go ']")).click();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		

	}

}
