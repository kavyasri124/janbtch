package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createaccount {
WebDriver driver;
	
	public createaccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// personal information
	@FindBy(id = "id_gender2")
	private WebElement GenderselectFemale;
	
	@FindBy(id = "id_gender1")
	private WebElement GenderselectMale;

	@FindBy(name = "customer_firstname")
	private WebElement FirstName;

	@FindBy(name = "customer_lastname")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;

	// Date of birth
	@FindBy(id = "days")
	private WebElement days;

	@FindBy(id = "months")
	private WebElement months;

	@FindBy(id = "years")
	private WebElement years;

	@FindBy(id = "newsletter")
	private WebElement newslettercheckbox;

	@FindBy(name = "optin")
	private WebElement recievespecialofferscheckbox;

	// your address
	@FindBy(id = "firstname")
	private WebElement addressFirstName;

	@FindBy(id = "lastname")
	private WebElement addressLastname;

	@FindBy(name = "company")
	private WebElement companyname;

	@FindBy(name = "address1")
	private WebElement Address1;

	@FindBy(name = "address2")
	private WebElement Address2;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;

	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement state;

	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement ziporpostalcode;

	@FindBy(id = "id_country")
	private WebElement Countryname;

	@FindBy(name = "other")
	private WebElement Additionalinformation;

	@FindBy(name = "phone")
	private WebElement Homephone;

	@FindBy(name = "phone_mobile")
	private WebElement mobilephone;

	@FindBy(name = "alias")
	private WebElement assignaddressalis;

	@FindBy(name = "submitAccount")
	private WebElement Register;

	// Newsletter
	@FindBy(xpath = "//input[@id='newsletter-input']")
	private WebElement Enteremailbox;

	@FindBy(xpath = "//footer[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	private WebElement EnteremailboxButton;

	// categories
	@FindBy(xpath = "//footer[1]/div[1]/section[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement Womenlink;

	public WebElement getGenderselectbutton() {
		return GenderselectFemale;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(String val) {
		FirstName.sendKeys(val);
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(String val) {
		LastName.sendKeys(val);;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String val) {
		this.password.sendKeys(val);
	}

	public WebElement getDays() {
		return days;
	}

	public void setDays(String val) {
		this.days.sendKeys(val);
	}

	public WebElement getMonths() {
		return months;
	}

	public void setMonths(String val) {
		this.months.sendKeys(val);
	}

	public WebElement getYears() {
		return years;
	}

	public void setYears(String val) {
		this.years.sendKeys(val);
	}

	public WebElement getNewslettercheckbox() {
		return newslettercheckbox;
	}

	public void setNewslettercheckbox(String val) {
		this.newslettercheckbox.sendKeys(val);
	}

	public WebElement getRecievespecialofferscheckbox() {
		return recievespecialofferscheckbox;
	}

	public void setRecievespecialofferscheckbox(String val) {
		this.recievespecialofferscheckbox.sendKeys(val);
	}

	
	public WebElement getLastname() {
		return addressLastname;
	}

	public void setLastname(String val) {
		this.addressLastname.sendKeys(val);
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String val) {
		this.companyname.sendKeys(val);
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public void setAddress1(WebElement address1) {
		Address1 = address1;
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public void setAddress2(WebElement address2) {
		Address2 = address2;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getZiporpostalcode() {
		return ziporpostalcode;
	}

	public void setZiporpostalcode(WebElement ziporpostalcode) {
		this.ziporpostalcode = ziporpostalcode;
	}

	public WebElement getCountryname() {
		return Countryname;
	}

	public void setCountryname(WebElement countryname) {
		Countryname = countryname;
	}

	public WebElement getAdditionalinformation() {
		return Additionalinformation;
	}

	public void setAdditionalinformation(WebElement additionalinformation) {
		Additionalinformation = additionalinformation;
	}

	public WebElement getHomephone() {
		return Homephone;
	}

	public void setHomephone(WebElement homephone) {
		Homephone = homephone;
	}

	public WebElement getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(WebElement mobilephone) {
		this.mobilephone = mobilephone;
	}

	public WebElement getAssignaddressalis() {
		return assignaddressalis;
	}

	public void setAssignaddressalis(WebElement assignaddressalis) {
		this.assignaddressalis = assignaddressalis;
	}

	public WebElement getRegister() {
		return Register;
	}

	public void setRegister(WebElement register) {
		Register = register;
	}

	public WebElement getEnteremailbox() {
		return Enteremailbox;
	}

	public void setEnteremailbox(WebElement enteremailbox) {
		Enteremailbox = enteremailbox;
	}

	public WebElement getEnteremailboxButton() {
		return EnteremailboxButton;
	}

	public void setEnteremailboxButton(WebElement enteremailboxButton) {
		EnteremailboxButton = enteremailboxButton;
	}

	public WebElement getWomenlink() {
		return Womenlink;
	}

	public void setWomenlink(WebElement womenlink) {
		Womenlink = womenlink;
	}

	public WebElement getAddressFirstName() {
		return addressFirstName;
	}

	public void setAddressFirstName(WebElement addressFirstName) {
		this.addressFirstName = addressFirstName;
	}

	public WebElement getAddressLastname() {
		return addressLastname;
	}

	public void setAddressLastname(WebElement addressLastname) {
		this.addressLastname = addressLastname;
	}

	public WebElement getGenderselectFemale() {
		return GenderselectFemale;
	}

	public void setGenderselectFemale(WebElement genderselectFemale) {
		GenderselectFemale = genderselectFemale;
	}

	public WebElement getGenderselectMale() {
		return GenderselectMale;
	}

	public void setGenderselectMale(WebElement genderselectMale) {
		GenderselectMale = genderselectMale;
	}

}


