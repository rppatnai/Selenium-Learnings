import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
		//Chrome
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Tag and ID combination ("#email") or (Tag#id)
		driver.findElement(By.cssSelector("#email")).sendKeys("david");		
		driver.findElement(By.cssSelector("input#email")).sendKeys("david");
		
		
		//Tag and Class combination(".class") or (Tage.class)
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("rohan");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("rohan");
		
		
		//Tag and Attribute combination ("[attribute=value]") or (Tag[attribute=value])
		//Attribute always remains in square bracket
		driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("Rohit");
		driver.findElement(By.cssSelector("[data-testid=royal_email]")).sendKeys("Rohit");
		
		
		//Tag,class and Attribute combination (tag.class[attribute=value]) . When tag and class are same for two elements
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys(" Email");
		driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("Password");
										//OR You can use data-testid 
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys(" Email");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Password");
		
	}

}
