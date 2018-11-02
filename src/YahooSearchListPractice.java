import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearchListPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("canada");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath(".//ul[@class='yui3-aclist-list']/li"));
        System.out.println(list.size());
        
        for(WebElement g:list) {
        	System.out.println(g.getText());
        }
	}

}
