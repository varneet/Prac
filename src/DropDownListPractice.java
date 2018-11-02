import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListPractice {

	public static void main(String[] args) throws InterruptedException {
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		List<WebElement> category = driver.findElements(By.xpath(".//*[@id='gh-cat']/option"));
		System.out.println(category.size());
		Thread.sleep(3000);
		
		for(WebElement c:category) {
			
			System.out.println(c.getText());
		}*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		WebElement category = driver.findElement(By.xpath(".//*[@id='gh-cat']"));
		List<WebElement> list = category.findElements(By.tagName("option"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText()+"---------"+list.get(i).isSelected());
		}
		
		Select d = new Select (category);
		d.selectByIndex(23);
		//category.sendKeys("Cameras & Photo"); this option can also be used to select item from ddlist.
		
		System.out.println("After Slection");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText()+"---------"+list.get(i).isSelected());
		}
		
		
		

	}

}
