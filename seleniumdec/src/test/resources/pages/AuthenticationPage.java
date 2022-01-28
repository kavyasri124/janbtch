package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
WebDriver driver;
	
	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// create an account
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement EmailaddressCreateAccount;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
	private WebElement Craeteanaccountbutton;
	
	
	// Already Registered Account
	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailaddressSignIn;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;

	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	private WebElement forgotpassword;

	@FindBy(name = "SubmitLogin")
	private WebElement signinbutton;

	public WebElement getEmailaddressCreateAccount() {
		return EmailaddressCreateAccount;
	}

	public void setEmailaddressCreateAccount(String val) {
		EmailaddressCreateAccount.sendKeys(val);
	}

	public WebElement getEmailaddressSignIn() {
		return EmailaddressSignIn;
	}

	public void setEmailaddressSignIn(String val) {
		EmailaddressSignIn.sendKeys(val);;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String val) {
		this.password.sendKeys(val);;
	}

	public WebElement getCraeteanaccountbutton() {
		return Craeteanaccountbutton;
	}

	public WebElement getForgotpassword() {
		return forgotpassword;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}
	
	
}


