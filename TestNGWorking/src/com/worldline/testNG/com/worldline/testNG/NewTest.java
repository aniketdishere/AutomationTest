package com.worldline.testNG.com.worldline.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() 
  {
	  System.out.println();
  }
  
  @Test(priority=2,groups= {"Smoke"})
  public void f2() {
	  System.out.println("i am in another method f2");
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


