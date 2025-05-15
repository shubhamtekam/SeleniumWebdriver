package mouseActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		//to open new site in another tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//to open new site in new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

	}

}
