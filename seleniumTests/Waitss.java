package seleniumTests;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitss {

	public static void main(String[] args) {

		

		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");

		ChromeDriver dd = new ChromeDriver();
		
		dd.get("https://www.sugarcrm.com/au/request-demo/?utm_source=sugarcrm.com&utm_medium=referral");
		
		dd.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		dd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		dd.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		
		
		
		
		
		WebDriverWait wait = new WebDriverWait(dd, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("employees_c"))).click();
		
		
		
		
		
		
		
		
		WebElement dropD = dd.findElement(By.name("employees_c"));
		
		Select ss= new Select(dropD);
		
		
		
		
		ss.selectByIndex(1);
		
		
		
		
		
		
		
		
		
		WebDriverWait waitss = new WebDriverWait(dd, Duration.ofSeconds(5));
		
		waitss.until(ExpectedConditions.visibilityOfElementLocated(By.className("soijas"))).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		FluentWait ww = new FluentWait (dd);
		
		ww.withTimeout(Duration.ofSeconds(5)).
		pollingEvery(Duration.ofSeconds(1)).
		ignoring(NoSuchElementException.class);
		
		
		ww.until(ExpectedConditions.alertIsPresent());	
		
		
			
	}

}
