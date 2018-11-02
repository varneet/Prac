import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpPractice {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("varneet");
		driver.findElement(By.name("lastname")).sendKeys("virk");
		driver.findElement(By.name("reg_email__")).sendKeys("4379854435");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ghfhghjbjnk");
		//WebElement month = driver.findElement(By.xpath("//select[@id='month']/option"));
		WebElement month = driver.findElement(By.xpath(".//*[@id='month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Feb");
		
		//WebElement day = driver.findElement(By.xpath("//select[@id='day']/option"));
		WebElement day = driver.findElement(By.xpath(".//*[@id='day']"));
        Select d = new Select(day);
		d.selectByValue("22");
		
		//WebElement year = driver.findElement(By.xpath("//select[@id='year']/option"));
		WebElement year = driver.findElement(By.xpath(".//*[@id='year']"));
		Select y = new Select(year);
		y.selectByIndex(4);
		
		WebElement option = driver.findElement(By.xpath(".//input[@value='1']"));
		option.click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
