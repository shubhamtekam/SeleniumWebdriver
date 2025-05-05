package baiscPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		// driver.navigate().to("https://tutorialsninja.com/demo/");
		String act_title = driver.getTitle();
		System.out.println(act_title);

		if (act_title.equals("Your Store"))
			System.out.println("test passed");
		else
			System.out.println("test failed");

		driver.close();

	}

}
