package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramessss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();

		dd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		dd.manage().window().maximize();
		
		
		//dd.switchTo().frame(1);
		
		//dd.switchTo().frame("")
		
		//dd.switchTo().parentFrame();
		
		
		
		
		dd.findElement(By.xpath("/html/body/button")).click();
		

		
		
		
		
		
	}

}
