import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAndClickActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		Actions hover = new Actions(driver);
		
		/*WebElement cityhall = driver.findElement(By.xpath("//*[@id='tnNavHall']/a/img"));
		hover.moveToElement(cityhall).build().perform();
		Thread.sleep(3000);
		
		WebElement chall = driver.findElement(By.xpath("//*[@id='tnNavHallMenu']/a[2]"));
		hover.moveToElement(chall).build().perform();
		chall.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());*/
		
		WebElement buss = driver.findElement(By.xpath(".//*[@id='tnNavBusiness']/a/img"));
		hover.moveToElement(buss).build().perform();
		Thread.sleep(3000);
		
		WebElement chall = driver.findElement(By.xpath("//*[@id='tnNavBusinessMenu']/a[2]"));
		hover.moveToElement(chall).build().perform();
		chall.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//List<WebElement> list1= buss.findElements(By.xpath(".//*[@id='tnNavBusinessMenu']/a"));
		//System.out.println(list1.size());*/
		
		/*WebElement residence= driver.findElement(By.xpath(".//*[@id='tnNavResidents']/a/img"));
        hover.moveToElement(residence).build().perform();
        Thread.sleep(3000);
		
        
        List<WebElement> list = residence.findElements(By.xpath(".//div[@id='tnNavResidentsMenu']/a"));
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++) {
        	if(list.get(i).getText().equals("Garbage & Recycling")) {
        		System.out.println(list.get(i).getText());
        		list.get(i).click();
        		Thread.sleep(3000);
        		System.out.println(driver.getTitle());
        	}
     */   
	}

}
