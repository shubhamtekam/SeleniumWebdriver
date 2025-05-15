package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement min_slider =driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		WebElement max_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		
		System.out.println("default location of min-slider before: "+min_slider.getLocation());
		System.out.println("default location of max-slider before: "+max_slider.getLocation());
		
		act.dragAndDropBy(min_slider, 100, 257).perform();
		act.dragAndDropBy(max_slider, -100, 257).perform();
		
		System.out.println("default location of min-slider after drag: "+min_slider.getLocation());
		System.out.println("default location of max-slider after drag: "+max_slider.getLocation());
		
		
		

	}

}
