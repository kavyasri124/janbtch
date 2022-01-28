package testcases1;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import testbase.testbase1;
import com.relevantcodes.extentreports.LogStatus;

public class Signintestcases3 extends testbase1{

	
	@Test(groups = {"signin","smoke","regression"})

	void signintestbase001(){
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test1 i am running");
		homeobj.getSignInLink().click();
		logger.log(LogStatus.INFO, "Clicked on the SignIn link");
		
		authobj.setEmailaddressSignIn(prop.getProperty("username"));
		authobj.setPassword(prop.getProperty("password"));
		authobj.getSigninbutton().click();
		logger.log(LogStatus.INFO, "Entered username and password");
		
		logger.log(LogStatus.INFO, "Verify the logged in successfully or not");
		try {
			if(myaccountobj.getSignout().isEnabled()) {
				logger.log(LogStatus.PASS, "Successfully loogged in");
			}
		} 
		catch(Exception e) {
			logger.log(LogStatus.ERROR, "Failed to logged in");
		}
		
	}
	
	@Test(groups= {"signin", "smoke", "regression"})
	void signInTestcase002() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test1 i am running");
		
		homeobj.getSignInLink().click();
		logger.log(LogStatus.INFO, "Clicked on the SignIn link");
		
		authobj.setEmailaddressSignIn(prop.getProperty("username"));
		authobj.setPassword("12345678");
		authobj.getSigninbutton().click();
		logger.log(LogStatus.INFO, "Entered username and password");
		
		logger.log(LogStatus.INFO, "Verify the logged in successfully or not");
		try {
		if(myaccountobj.getSignout().isEnabled()) {
			logger.log(LogStatus.PASS, "Successfully loogged in");
		}
		}catch(Exception e) {
			logger.log(LogStatus.ERROR, "Failed to logged in");
		}
		
		
	}
	
	@Test
	void contactUsTestcase001() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "running");
		
		homeobj.getContactUs().click();
		logger.log(LogStatus.INFO, "Clicked on the Contact us link");
		
		String contactUsPageText = "CUSTOMER SERVICE - CONTACT US ";
		String webPageText = contactusobj.getcontactUsPageText().getText();
		
		
		if(contactUsPageText.equals(webPageText)) {
			logger.log(LogStatus.PASS, "Successfully Verified the contact us text");	
			AssertJUnit.assertTrue(true);
		} else {
			logger.log(LogStatus.FAIL, "Unable to Verify the contact us text hence test case is failed");
			AssertJUnit.assertTrue(false);			
		}
		
		
	}

	}



