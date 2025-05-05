package locators.cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// tag#id
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile");
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iphone");

		// tag.classname
		// driver.findElement(By.cssSelector("button.search-box-button")).click();
		// driver.findElement(By.cssSelector(".search-box-button")).click();

		// tag[attribute='value']
		driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("samsung");

	}

}
