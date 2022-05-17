package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiseletcDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();
		
		dd.manage().window().maximize();
		
		dd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		dd.switchTo().frame("iframeResult");
		
		
		WebElement ww = dd.findElement(By.id("cars"));
		
		Select ss = new Select(ww);
		
		ss.selectByValue("opel");
		ss.selectByIndex(0);
		ss.selectByVisibleText("Saab");
		
		//ss.deselectAll();
		
		
		dd.close();
		
		
		
		
		
		
	}

}
