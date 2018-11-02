import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBLoginPractice {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("varneetvirk22");
        driver.findElement(By.id("pass")).sendKeys("hghghjjj");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
		Thread.sleep(3000);
		
		String actualError = driver.findElement(By.xpath("//div[@class='_5v-0 _53in']/div")).getText();
        System.out.println(actualError);
        
        String expectedError = "The email or phone number you’ve entered doesn’t match any account. Sign up for an account."; 
        
        if (actualError.equals(expectedError)) 
        {
        	System.out.println("TEST PASSED");
        }
        else {
        	System.out.println("TEST FAILED");
        }
       WebElement login = driver.findElement(By.linkText("Sign up for an account."));
       System.out.println(login.getText());
       login.click();
	}

}
