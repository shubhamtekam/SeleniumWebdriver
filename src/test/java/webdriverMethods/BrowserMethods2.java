package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(3000);
		// driver.close();
		driver.quit();

	}

}
