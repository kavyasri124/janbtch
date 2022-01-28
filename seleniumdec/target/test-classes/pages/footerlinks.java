package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class footerlinks {
WebDriver driver;
	
	public footerlinks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// footer links
		// Newsletter
		@FindBy(xpath = "//input[@id='newsletter-input']")
		private WebElement Enteremailbox;

		@FindBy(xpath = "//footer[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
		private WebElement EnteremailboxButton;

		// categories
		@FindBy(xpath = "//footer[1]/div[1]/section[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
		private WebElement Womenlink;

		// information
		@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[1]/a[1]")
		private WebElement Specials;

		@FindBy(xpath = "//a[contains(text(),'New products')]")
		private WebElement NewProducts;

		@FindBy(xpath = "//a[contains(text(),'Best sellers')]")
		private WebElement Bestsellers;

		@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[4]/a[1]")
		private WebElement Ourstores;

		@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[5]/a[1]")
		private WebElement Contactus;

		@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[6]")
		private WebElement TermsandConditions;

		@FindBy(xpath = "//footer[1]/div[1]/section[3]/ul[1]/li[7]/a[1]")
		private WebElement Aboutus;

		@FindBy(xpath = "//a[contains(text(),'Sitemap')]")
		private WebElement SiteMap;

		// MyAccount
		@FindBy(xpath = "//a[contains(text(),'My account')]")
		private WebElement MyAccount;

		@FindBy(xpath = "//a[contains(text(),'My orders')]")
		private WebElement MyOrders;

		@FindBy(xpath = "//a[contains(text(),'My credit slips')]")
		private WebElement MyCreditSlips;

		@FindBy(xpath = "//a[contains(text(),'My addresses')]")
		private WebElement Myaddresses;

		@FindBy(xpath = "//a[contains(text(),'My personal info')]")
		private WebElement MyPersonalInfo;

		// Store information
		@FindBy(xpath = "//a[contains(text(),'support@seleniumframework.com')]")
		private WebElement EmailAddress;

		public WebElement getEnteremailbox() {
			return Enteremailbox;
		}

		public WebElement getEnteremailboxButton() {
			return EnteremailboxButton;
		}

		public WebElement getWomenlink() {
			return Womenlink;
		}

		public WebElement getSpecials() {
			return Specials;
		}

		public WebElement getNewProducts() {
			return NewProducts;
		}

		public WebElement getBestsellers() {
			return Bestsellers;
		}

		public WebElement getOurstores() {
			return Ourstores;
		}

		public WebElement getContactus() {
			return Contactus;
		}

		public WebElement getTermsandConditions() {
			return TermsandConditions;
		}

		public WebElement getAboutus() {
			return Aboutus;
		}

		public WebElement getSiteMap() {
			return SiteMap;
		}

		public WebElement getMyAccount() {
			return MyAccount;
		}

		public WebElement getMyOrders() {
			return MyOrders;
		}

		public WebElement getMyCreditSlips() {
			return MyCreditSlips;
		}

		public WebElement getMyaddresses() {
			return Myaddresses;
		}

		public WebElement getMyPersonalInfo() {
			return MyPersonalInfo;
		}

		public WebElement getEmailAddress() {
			return EmailAddress;
		}

}


