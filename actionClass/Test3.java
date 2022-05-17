package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// drag and drop

public class Test3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();
		
		Actions act = new Actions(dd);

		dd.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement box1 = dd.findElement(By.id("box1"));

		WebElement box2 = dd.findElement(By.id("box103"));

		
		
		
		act.dragAndDrop(box1, box2);
		
		
		
		
		
		
		
		
		
		
	}

}
