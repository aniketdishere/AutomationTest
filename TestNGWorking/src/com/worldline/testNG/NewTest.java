package com.worldline.testNG;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
    //@Parameters({"Browser"})
	@Test(invocationCount=1, enabled=true,priority=2,alwaysRun=true,groups={"smoke"})//is enable = false then it will not run, default value true
 public void f() 
  {
    	
      System.out.println("i am in another test method ");
     // enable priority is 1, and always run should be true
  }
  
  @Test(priority=1,description="F1 functionality",groups= {"Regration"})
  public void f1()
  {
      System.out.println("i am in another test method f1 ");
  }
    
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in before suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in after suite");
  }

}
