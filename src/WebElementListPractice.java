import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementListPractice {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement footer = driver.findElement(By.xpath(".//*[@id='fbar']/div"));
		List<WebElement> link = footer.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for(int i=0; i<link.size();i++) {
			
			System.out.println(link.get(i).getText());
		}

	}

}
