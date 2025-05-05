package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		// isDisplayed()
		boolean logo = driver.findElement(By.id("Image1_img")).isDisplayed();
		System.out.println("logo status: " + logo);
		// isEnabled()
		boolean textbox_status = driver.findElement(By.xpath("//input[@id='text2']")).isEnabled();
		System.out.println(textbox_status);
		// isSelected()
		boolean checkbox_status = driver.findElement(By.id("check2")).isSelected();
		System.out.println(checkbox_status);

	}

}
