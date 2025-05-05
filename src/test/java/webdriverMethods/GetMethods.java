package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// get(url) -opens the url in the browser.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);

		// getTitle() -- returns the title of the page.
		System.out.println(driver.getTitle()); // OrangeHRM

		// getCurrentUrl() -- returns the current page url.
		System.out.println(driver.getCurrentUrl()); // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		// getPageSource() -- returns source code of the page.
		// System.out.println("source code--"+driver.getPageSource());

		// getWindowHandle -- returns ID of the single browser window
		System.out.println("Window ID--" + driver.getWindowHandle()); // 0F2601D9AF9F024264256156A4C00CA5

		// getWindowHandles -- retruns id of the multiple browser windows.
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);

	}

}
