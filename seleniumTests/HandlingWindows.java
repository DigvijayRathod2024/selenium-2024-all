package seleniumTests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();
		
		dd.get("https://www.salesforce.com/in/");
		
		
		
		
		dd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
			
		
		
		Set<String> wndd = dd.getWindowHandles();
		
		Iterator <String> itr =wndd.iterator();
		
		
		
		String parentw =itr.next();
		
		String childw= itr.next();
		
		
		
		dd.switchTo().window(childw);	
		
	
		dd.findElement(By.name("UserFirstName")).sendKeys("digvijay");
		
		dd.findElement(By.name("UserLastName")).sendKeys("rathod");
		
		
		dd.switchTo().window(parentw);
		
	}

}
