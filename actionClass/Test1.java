package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// move to element 


public class Test1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();

		
		
		
		dd.get("https://www.orangehrm.com/");

		Actions act = new Actions(dd);
		
		
		
		
		WebElement ww = dd.findElement((By.className("dropdown-toggle")));
		
		WebElement ws = dd.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[2]/li[1]/ul/div[1]/li[1]/a"));
		
		
		
		
		act.moveToElement(ww).click().build().perform();
		
		act.moveToElement(ws).click().build().perform();
		
		
		
		dd.close();
		
	}

}



















