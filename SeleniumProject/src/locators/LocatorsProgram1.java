package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsProgram1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		driver.manage().window();

//Find the sign up button from the registration form present in the facebook page(child)
		driver.findElement(By.xpath("//*[@id='pageFooter']/ul/child::li[11]/a[@class='_sv4']")).click();
		driver.findElement(By.xpath("//div[@class='_6luv _52jv']/descendant::div[11]/a[contains(@role,'button')]")).click();
		//driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[10]/button[@type='submit']")).click();
//
//		
//		
////Locate Firstname field from the sign-up button in facebook(parent)	
//		driver.findElement(By.xpath("//button[@id='u_2g_s_43']/parent::*/parent::*/child::div[1]/div/div[1]")).click();
//		
////Identify the newpassword from mobile number field in facebook (following)
//		driver.findElement(By.xpath("//input[@id='u_2g_g_eK']/following::input[2]")).click();;
//		
////Locate  the mobile number from newpassword field in facebook (preceding)
//		driver.findElement(By.xpath("//input[@id='password_step_input']/preceding::input[2]")).click();
//		
////Locate surname from female radio button in the facebook(ancestor)
//		driver.findElement(By.xpath("//input[@id='u_2g_2_uU']/ancestor::div[2]/div[1]/div/div[2]"));
//
////Identify the search textbox from google search button present in the google search home page(parent)
//		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']/parent::*/parent::*/parent::*/div[1]"));
//		
////Identify the Today's Deals link from the amazon search text box present in the amazon home page(following).
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::a[contains(text(),\"Today's Deals\")]"));
//		
////Identify the Hello, signIn from the searchbox present in the amazon home page(following).
//		driver.findElement(By.xpath("//input [@id='twotabsearchtextbox']/following::a[@id='nav-link-accountList']"));
//
////Identify the mobile icon element in the Amazon home page. 
//		driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::a[contains(text(),'Mobiles')]"));
//		driver.close();
		
		
		
		Locate  the mobile number from newpassword field in facebook
		
		
	}

}
