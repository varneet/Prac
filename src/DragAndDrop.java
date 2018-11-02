import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		System.out.println(drag.getText()+"-----"+drop.getText() );
		builder.dragAndDrop(drag,drop).build().perform();
		
		System.out.println(drag.getText()+"*********"+drop.getText());
		
		driver.switchTo().defaultContent();
		
		//System.out.println(drag.getText()+"-----"+drop.getText() );
		
		
	}

}
