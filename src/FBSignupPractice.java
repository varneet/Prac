import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignupPractice {

	public static void main(String[] args) throws InterruptedException {
		 
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("varneet");
		//driver.findElement(By.xpath(".//input[@id='u_0_c']")).sendKeys("varneet");
		
		driver.findElement(By.name("lastname")).sendKeys("virk");
		//driver.findElement(By.xpath(".//input[@id='u_0_e']")).sendKeys("virk");
		
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("ghghjh@123");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("12");
		
		WebElement date = driver.findElement(By.xpath(".//*[@id='day']"));
		//date.sendKeys("22"); this option can also be used, but not preferred.
		Select d = new Select (date);
		d.selectByIndex(23);
		
		WebElement year = driver.findElement(By.xpath(".//*[@id='year']"));
		Select y = new Select (year);
		y.selectByVisibleText("1990");
		
		WebElement option = driver.findElement(By.xpath(".//input[@value='1']"));
		option.click();
		
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(2000);
		
		String actualError = driver.findElement(By.xpath(".//div[@class='_5v-0 _53im']/div")).getText();
		
		String expectedError = "Please enter a valid mobile number or email address.";
		
		if(actualError.equals(expectedError)) {
			
			System.out.println("test passed");
			
		}
		else {
			
			System.out.println("Test failed");
		}
		
		

	}

}
