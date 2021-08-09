package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2_XpathAxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window();
		
		//self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]/self::a")).getText();
		System.out.println(text); // Supreme Petroche
		
		//parent - Selects immediate parent of the current node
		String ParentText=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]/parent::td")).getText();
		System.out.println(ParentText); // Supreme Petroche
		
		//child - Selects all children of the current node(one of many)
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements:"+childs.size()); //5
		
		//Ancestor - Select all ancestors(parent , grandparent etc)
		String newText=driver.findElement(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr")).getText();
		System.out.println(newText); // Supreme Petroche A 727.95 794.05 + 9.08
		//Prints the complete line

		//descendants - Selects all descendants (includes all children and grandchildren) of the current node
		List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes:"+descendants.size());//7
		
		
		//Following : It selects everything in the document after the closing tag of the current node
		List<WebElement> followingnodes=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes : "+followingnodes.size()); //267
		
		
		//following-siblings : Selects all siblings after the current node
		List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings : "+followingsiblings.size()); //265
		
		
		 //preceding : Selects all node before the current node of the document
		List<WebElement> preceedings=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding nodes :"+ preceedings.size()); //9
		
		//preceding-sibling : Selects all siblings before the current node
		List<WebElement> preceedingsiblings=driver.findElements(By.xpath("//a[contains(text(),'Just Dial')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding nodes :"+ preceedingsiblings.size()); //8 
		
		driver.close();
		
	}

}
