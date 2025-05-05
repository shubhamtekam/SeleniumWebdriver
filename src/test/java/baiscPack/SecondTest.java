package baiscPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.nopCommerce.com");
		String act_title = driver.getTitle();
		if (act_title.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

	}

}
