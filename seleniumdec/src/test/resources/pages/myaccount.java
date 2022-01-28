package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccount {
WebDriver driver;
	
	public myaccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// my account
	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	private WebElement OrderHistoryAndDetails;

	@FindBy(xpath = "//span[contains(text(),'My credit slips')]")
	private WebElement Mycreditslips;

	@FindBy(xpath = "//span[contains(text(),'My addresses')]")
	private WebElement MyAddress;

	@FindBy(xpath = "//span[contains(text(),'My personal information')]")
	private WebElement mypersonalinformation;

	@FindBy(xpath = "//span[contains(text(),'My wishlists')]")
	private WebElement Mywishlists;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	private WebElement backtohomebutton;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement Signout;

	public WebElement getOrderHistoryAndDetails() {
		return OrderHistoryAndDetails;
	}

	public WebElement getMycreditslips() {
		return Mycreditslips;
	}

	public WebElement getMyAddress() {
		return MyAddress;
	}

	public WebElement getMypersonalinformation() {
		return mypersonalinformation;
	}

	public WebElement getMywishlists() {
		return Mywishlists;
	}

	public WebElement getBacktohomebutton() {
		return backtohomebutton;
	}

	public WebElement getSignout() {
		return Signout;
	}

	
}



