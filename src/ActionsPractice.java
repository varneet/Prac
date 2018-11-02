import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		Actions hover = new Actions(driver);
		
		WebElement box = driver.findElement(By.xpath(".//div[@id='nav-shop']/a"));
		hover.moveToElement(box).build().perform();
		
		Thread.sleep(3000);
		
		WebElement music = driver.findElement(By.xpath("//span[@aria-label='Prime Music']/span[1]"));
		hover.moveToElement(music).build().perform();
		Thread.sleep(3000);
		
		WebElement Pmusic = driver.findElement(By.partialLinkText("Open Web Player"));
		hover.moveToElement(Pmusic).build().perform();
		Pmusic.click();
		Thread.sleep(3000);
	}

}
