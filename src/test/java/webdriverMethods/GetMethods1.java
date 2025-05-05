package webdriverMethods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(4000);
		System.out.println("page title-" + driver.getTitle());
		System.out.println("page url-" + driver.getCurrentUrl());
		System.out.println("Window ID-" + driver.getWindowHandle());
		driver.findElement(By.linkText("Write for us")).click();
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);
		System.out.println(driver.getPageSource());
	}

}
