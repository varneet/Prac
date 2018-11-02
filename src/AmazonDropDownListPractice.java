import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDownListPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		WebElement dropDownBox = driver.findElement(By.xpath(".//*[@id='searchDropdownBox']"));
		List<WebElement> list = dropDownBox.findElements(By.tagName("option"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).isSelected()) {
				System.out.println(list.get(i).getText());
				break;
			}
		}
			
			Select s = new Select(dropDownBox);
			s.selectByValue("search-alias=electronics");
			Thread.sleep(3000);
			
			for(int j=0;j<list.size();j++) {
				System.out.println(list.get(j).getText()+"--------------"+list.get(j).isSelected());
			}
			
		
		

	}

}
