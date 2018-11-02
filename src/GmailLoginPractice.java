import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginPractice {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("varneetvirk22");
		driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("gfhghjj");
		//driver.findElement(By.xpath(".//div[@class='Xb9hP']/div[1]")).sendKeys("ftgyhjh");
		driver.findElement(By.xpath(".//*[@id='passwordNext']")).click();
		
		String actualErr=  driver.findElement(By.xpath("//div[@id='password']/div[2]/div[2]")).getText();
		String expectedErr= "Wrong password. Try again or click Forgot password to reset it.";
		
		if(actualErr.equals(expectedErr)) {
			System.out.println("TEST PASSED");
		}
		else {
			System.out.println("test failed");
		}
	}

}
