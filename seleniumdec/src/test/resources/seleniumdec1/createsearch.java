package seleniumdec1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class createsearch {
	WebDriver driver;
	@Test
	
void search() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("input"))).click().keyDown(Keys.SHIFT).sendKeys("tomato").build().perform();
		Thread.sleep(1000);	
	}
		
	
	
	
	
	
	
	
	@BeforeMethod 
	void beforemethod() {
System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/seleniumdec/drivers/chrome/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
	}
	
	
	@AfterMethod
	void aftermethod() {
		driver.close();
		
	}
}
