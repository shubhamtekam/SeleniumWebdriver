package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		// name locator
		// driver.findElement(By.name("search")).sendKeys("iphone");

		// id locator
		// boolean logoStatus=driver.findElement(By.id("logo")).isDisplayed();
		// System.out.println(logoStatus);

		// linkText locator
		// driver.findElement(By.linkText("Cameras")).click();

		// partialLinkText locator
		// driver.findElement(By.partialLinkText("eras")).click();

		// classname locator
		// List<WebElement> links=driver.findElements(By.className("dropdown"));
		// System.out.println("no of links---"+links.size());

		// tagname
		List<WebElement> linkcount = driver.findElements(By.tagName("a"));
		System.out.println("linkcount=" + linkcount.size());

		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("total images=" + img.size());
	}
}
