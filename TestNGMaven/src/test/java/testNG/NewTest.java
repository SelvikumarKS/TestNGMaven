package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void test() {
	  System.out.println("Im test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" Im Before method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" Im After method");
		 
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" Im Before class");
		 
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" Im After class");
		 
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" Im Before test");
		 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" Im After test");
		 
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" Im Before suite");
		 
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" Im After suite");
		 
  }

}
