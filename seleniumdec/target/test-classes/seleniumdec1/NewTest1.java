package seleniumdec1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("iam from test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("iam from before methodtest");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("iam from after methodtest"); 
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("iam from beforeclasstest");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("iam from after calss test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("iam from before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("iam from aftertest");
  }

}
