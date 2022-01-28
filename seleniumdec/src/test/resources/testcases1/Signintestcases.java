package testcases1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import testbase.testbase1;

public class Signintestcases extends testbase1{

	
	@Test(groups = {"signin","smoke","regression"})
	void signintestbase001(){
		homeobj.getSignInLink().click();
		authobj.setEmailaddressSignIn("santosh@test.com");
		authobj.setPassword("123456");
		authobj.getSigninbutton().click();
		if(myaccountobj.getSignout().isEnabled()) {
			System.out.println("Successfully logined to account");
		} else {
			System.out.println("failed to login");
		}
	}
}
