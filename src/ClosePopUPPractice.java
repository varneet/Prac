import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosePopUPPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.aliexpress.com");
        
        List<WebElement> element = driver.findElements(By.className("close-layer"));
        System.out.println(element.size());
        
        if(element.size()>0) {
        	driver.findElement(By.className("close-layer")).click();
        	
        }
	}

}
