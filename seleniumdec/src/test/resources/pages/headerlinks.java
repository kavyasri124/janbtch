package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class headerlinks {
WebDriver driver;
	
	public headerlinks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/span[1]")
	private WebElement Callusnow;

	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTextBox;

	@FindBy(name = "submit_search")
	private WebElement Button;

	@FindBy(xpath = "//b[contains(text(),'Cart')]")
	private WebElement Addtocart;

	// header
	@FindBy(xpath = "//div[6]/ul[1]/li[1]/a[1]")
	private WebElement Women;

	@FindBy(xpath = "//div[6]/ul[1]/li[2]/a[1]")
	private WebElement Dresses;

	@FindBy(xpath = "//div[6]/ul[1]/li[3]/a[1]")
	private WebElement Tshirts;

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public void setSearchTextBox(String val) {
		this.searchTextBox.sendKeys(val);
	}

	public WebElement getSignInLink() {
		return signInLink;
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

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getTshirts() {
		return Tshirts;
	}
}


