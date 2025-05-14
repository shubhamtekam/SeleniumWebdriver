package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	
	static void datePicker(WebDriver driver, String year,String month,String date)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //return current month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // returns current year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		// select date 
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		
		for(WebElement dt: allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch frame
		driver.switchTo().frame(0);
		
		//method_1 using sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/11/2025"); //mm/dd/yyyy
		
		
		// method-2 using date picker 
		String year="2027";
		String month ="May";
		String date ="11";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		datePicker(driver,year,month,date);
		
		//Select month & year
		

	}

}
