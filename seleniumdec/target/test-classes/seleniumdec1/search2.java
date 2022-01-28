package seleniumdec1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import org.testng.annotations.BeforeMethod;



public class search2 {
	WebDriver driver;
	
	@Test(priority=1)
	void search() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("tamato").build().perform();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	void doubleClick() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
		
		Thread.sleep(5000);

		act.moveToElement(search).contextClick().build().perform();
	}
	
	@Test(priority=2)
	void onMouse() throws InterruptedException {
		Actions act = new Actions(driver);
		
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
		act.moveToElement(shopByCat).build().perform();
	
		Thread.sleep(1000);
		
		//if(shopByCat.isDisplayed() && shopByCat.isEnabled()) {
	//		driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
	//	} else {
	//		System.out.println("WebElement is not present");
		//}
	}
	
	@BeforeMethod
	void before() {
		driver.get("https://www.bigbasket.com");
	}
	@BeforeClass
	void beforeMethod() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/seleniumdec/drivers/chrome/chromedriver");
		
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bigbasket.com");
	}
	
	@AfterClass
	void afterMethod() {
		//driver.close();
	}
	

}




