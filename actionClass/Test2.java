package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// right click

public class Test2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();
		
		Actions act = new Actions(dd);
		
		

		dd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement clickme = dd.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		act.contextClick(clickme).build().perform();
		
		
		
	}

}
