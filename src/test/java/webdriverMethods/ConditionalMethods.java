package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		// isDisplayed()
		boolean logo_status = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		System.out.println("logo status: " + logo_status);

		// isEnabled()
		boolean searchbar_status = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("SearchBar Status:" + searchbar_status);

		// isselected()
		WebElement male_rb = driver.findElement(By.id("gender-male"));
		WebElement female_rb = driver.findElement(By.id("gender-female"));

		System.out.println("before selection---");
		System.out.println(male_rb.isSelected());// false
		System.out.println(female_rb.isSelected());// false

		male_rb.click();

		System.out.println("after selection---");
		System.out.println(male_rb.isSelected());// true
		System.out.println(female_rb.isSelected());// false

		female_rb.click();
		System.out.println("after selection---");
		System.out.println(male_rb.isSelected());// false
		System.out.println(female_rb.isSelected());// true

	}

}
