import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		List<WebElement> sort = driver.findElements(By.linkText("Sortable"));
		System.out.println(sort.size());
		
		if(sort.size()==1) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Element not Present");
		}
		
		System.out.println("changing frame now");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		sort = driver.findElements(By.linkText("Sortable"));
		System.out.println(sort.size());
		
		if(sort.size()==1) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Element not Present");
		}
		
		driver.switchTo().defaultContent();
		
		
		

	}

}
