package testcases1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import testbase.testbase1;

public class homepagetestcases extends testbase1 {
@Test(groups = {"search","smoke","regression"})

	


	public void searchTestcase001() {
		homeobj.setSearchTextBox("Jeans");
		homeobj.getButton().click();
		
		String resultSearchText = homeobj.getSearchTextBox().getAttribute("value");
		System.out.println("Search value is " + resultSearchText);
	}
	
	@Test(groups = {"search","regression"})

	public void searchTestcase002() {
		homeobj.setSearchTextBox("Shirt");
		homeobj.getButton().click();
		
		String resultSearchText = homeobj.getSearchTextBox().getAttribute("value");
		System.out.println("Search value is " + resultSearchText);
		
	}
	
	@Test(groups = {"signin","regression"})

	public void searchTestcase003() {
		homeobj.setSearchTextBox("T Shirt");
		homeobj.getButton().click();
		
		String resultSearchText = homeobj.getSearchTextBox().getAttribute("value");
		System.out.println("Search value is " + resultSearchText);
		
	}

	



}
	
	
	
	

