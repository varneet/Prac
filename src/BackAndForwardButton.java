import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.linkText("Store")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		

	}

}
