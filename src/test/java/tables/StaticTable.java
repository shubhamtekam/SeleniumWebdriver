package tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1--find total number of rows in table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // for multiple table
		//int rows=driver.findElements(By.tagName("tr")).size(); //for single table
        System.out.println("total rows in table = "+rows);
        
        // 2--find total no. of columns in table
        int column=driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size(); // for multiple table
        //int column=driver.findElements(By.tagName("th")).size(); //for single table
        System.out.println("Total no. of columns in table = "+column);
        
        // 3-- read data from specific row and column
        String book_name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[1]")).getText();
        System.out.println("Book name: "+book_name);
        
        String subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[3]")).getText();
        System.out.println("Subject ="+subject);
        
        //4-- read data from all the rows and columns
        
        for(int r=2;r<=rows;r++)
        {
        	for(int c=1;c<=column;c++)
        	{
        		String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
        		System.out.print(data+"\t");
        	}
        	System.out.println();
        }
        
        //5-- print booknames based on condition
        
        for(int r=2;r<=rows;r++)
        {
        	String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
        	if(author.equals("Amit"))
        	{
        		String bName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
        		System.out.println(bName+"\t"+author);
        	}
        }
        
        //6-- find total price of all the books
        int total=0;
        for(int i=2;i<=rows;i++)
        {
        	String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]")).getText();
        	total=total+ Integer.parseInt(price);
        }
        System.out.println("total price of books ="+total);
	}

}
