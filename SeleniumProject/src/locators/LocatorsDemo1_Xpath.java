package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window();
		
		//Absolute xpath
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("Tshirts");
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
		
		
		//Relative Xpath
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Pants");
		driver.findElement(By.xpath("//*[@name='submit_search']")).click();		
		
		//Xpath with "or" operators
		driver.findElement(By.xpath("//*[@id='search_query_top' or @name='search_query']")).sendKeys("Pants");
		driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search']")).click();
		
		//Xpath with "and" operators
		driver.findElement(By.xpath("//*[@id='search_query_top' or @name='search_query']")).sendKeys("Shirts");
		driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
		
		//Xpath Using "contains"
		driver.findElement(By.xpath("//input[contains(@id,'top')]")).sendKeys("Tshirts");
		driver.findElement(By.xpath("//button[contains(@name,'sub')]")).click();
		
		//Xpath Using "starts_with"
		driver.findElement(By.xpath("//input[starts-with(@id,'sear')]")).sendKeys("Tshirts");
		driver.findElement(By.xpath("//button[starts-with(@name,'subm')]")).click();
		
		
		//Xpath using "text"
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//Chained Xpath
		driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("Pants");
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("Tshirts");
		
		driver.findElement(By.xpath("//form[@id='searchbox']//button")).click();
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		
	}

}
