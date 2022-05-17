package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();
		
		dd.get("https://www.sugarcrm.com/au/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
		
		dd.manage().window().maximize();
		
		
		
		WebElement dropD = dd.findElement(By.name("employees_c"));
		
		Select ss= new Select(dropD);
		
		
		
		ss.selectByValue("level2");
		
		ss.selectByVisibleText("11 - 50 employees");
		
		ss.selectByIndex(5);
		
		
	}

}
