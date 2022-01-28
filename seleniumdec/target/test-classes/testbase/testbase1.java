package testbase;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;
import listener.Eventlistener;
import log4jtest.Log4jtestfile;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.AuthenticationPage;
import pages.contactuspage;
import pages.createaccount;
import pages.footerlinks;
import pages.headerlinks;
import pages.homepage;
import pages.myaccount;

import java.util.EventListener;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class testbase1 {
public WebDriver driver;
public homepage homeobj;
public myaccount myaccountobj;
public headerlinks headerlinkobj;
public footerlinks footerlinkobj;
public createaccount createaccountobj;
public contactuspage contactusobj;
public AuthenticationPage authobj;
public Properties prop;
public FileInputStream fis;
public Logger log = LogManager.getLogger();
public static ExtentReports extent;
public static ExtentTest logger;

@BeforeMethod(groups = {"signin","smoke","regression","search"})

public void openbrowser() throws IOException  {
	
	
	prop = new Properties();
	fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
	prop.load(fis);
	

	System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/seleniumdec/drivers/chrome/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors");

	driver = new ChromeDriver(options);


	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
Eventlistener ecapture = new Eventlistener(); 

//pass the driver to EventFiringWebDriver
EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);

//pass ecapture tp eventHandler
eventHandler.register(ecapture);



homeobj=new homepage(eventHandler);
 myaccountobj= new myaccount(eventHandler);
headerlinkobj= new headerlinks(eventHandler);
 footerlinkobj=new footerlinks(eventHandler);
 createaccountobj= new createaccount(eventHandler);
 contactusobj= new contactuspage(eventHandler);
 authobj=new AuthenticationPage(eventHandler);
}
@AfterMethod(groups = {"signin","smoke","regression","search"})
public void closebrowser() {
	driver.close();
	driver.quit();
	extent.endTest(logger);
	extent.flush();
}
@BeforeTest
public void testbefore() {
	extent = new ExtentReports(System.getProperty("user.dir")+"/report.html", true);
	extent.loadConfig(new File(System.getProperty("user.dir")+"/target/extent-config.xml"));
}

@AfterTest
public void testafter() {
	 
	extent.close();
}

}
