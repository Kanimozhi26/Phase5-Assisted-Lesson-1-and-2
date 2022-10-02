package com.example.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Hello Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test");
  }

}