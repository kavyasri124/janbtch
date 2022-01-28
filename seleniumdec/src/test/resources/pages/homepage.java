package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath= "//header/div[2]/div[1]/div[1]/nav[1]/span[1]")
private WebElement Callusnow;
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;

	@FindBy(name = "submit_search")
	private WebElement Button;

	@FindBy(xpath = "//b[contains(text(),'Cart')]")
	private WebElement Addtocart;

	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement Signout;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	private WebElement contactUs;

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public void setSearchTextBox(String val) {
		this.searchTextBox.clear();
		this.searchTextBox.sendKeys(val);
	}

	public WebElement getCallusnow() {
		return Callusnow;
	}

	public WebElement getButton() {
		return Button;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getSignout() {
		return Signout;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

}

	
	
	
	
	
	

